package com.algaworks.brewer.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.algaworks.brewer.model.Usuario;

public class UsuarioSistema extends User{
	
	private static final long serialVersionUID = 1L;
	
	private String empresa;
	private Usuario usuario;

	public UsuarioSistema(Usuario usuario, 
			Collection<? extends GrantedAuthority> authorities, String empresa) {
		super(usuario.getEmail(), usuario.getSenha(), authorities);
		this.empresa = empresa;
		this.usuario = usuario;
	}
	
	public String getEmpresa() {
		return empresa;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	
}
