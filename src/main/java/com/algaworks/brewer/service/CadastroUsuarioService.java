package com.algaworks.brewer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.algaworks.brewer.model.Usuario;
import com.algaworks.brewer.repository.Usuarios;
import com.algaworks.brewer.service.exception.NomeEstiloJaCadastradoException;
import com.algaworks.brewer.service.exception.SenhaObrigatoriaUsuarioExpcetion;

@Service
public class CadastroUsuarioService {

	@Autowired
	private Usuarios usuarios;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Transactional
	public void salvar(Usuario usuario) {
		Optional<Usuario> usuarioOptional = usuarios.findByEmail(usuario.getEmail());
		
		validaEmailExistente(usuarioOptional);
		validaSenhaObrigatoria(usuario);
		criptografaSenha(usuario);
		
		usuarios.save(usuario);
	}

	private void criptografaSenha(Usuario usuario) {
		if(usuario.isNovo()) {
			usuario.setSenha(this.passwordEncoder.encode(usuario.getSenha()));
			usuario.setConfirmacaoSenha(usuario.getSenha());
		}
	}

	private void validaSenhaObrigatoria(Usuario usuario) {
		if(usuario.isNovo() && StringUtils.isEmpty(usuario.getSenha())) {
			throw new SenhaObrigatoriaUsuarioExpcetion("Senha é obrigatória para novo usuário");
		}
	}

	private void validaEmailExistente(Optional<Usuario> usuarioOptional) {
		if(usuarioOptional.isPresent()) {
			throw new NomeEstiloJaCadastradoException("E-mail de usuário já cadastrado");
		}
	}

	@Transactional
	public void alterarStatus(Long[] codigos, StatusUsuario statusUsuario) {
		statusUsuario.executar(codigos, usuarios);
	}
	
}
