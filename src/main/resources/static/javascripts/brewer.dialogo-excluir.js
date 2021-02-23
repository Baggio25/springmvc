
Brewer = Brewer || {};

Brewer.DialogoExcluir = (function() {
	
	function DialogoExcluir() {
		this.exclusaoBtn = $('.js-exclusao-btn');
	}
	
	DialogoExcluir.prototype.iniciar = function() {
		this.exclusaoBtn.on('click', onExcluirClicado.bind(this));
		
		if(window.location.search.indexOf('excluido') > -1) {
			swal('Pronto!', 'Excluído com sucesso', 'success');
		}
	}
	
	function onExcluirClicado(evento) {
		evento.preventDefault();
		var botaoClicado = $(evento.currentTarget);
		var url = botaoClicado.data('url');
		var objeto = botaoClicado.data('objeto');
		
		swal({
			title: 'Tem certeza',
			text: 'Excluir "' + objeto + '"? Você não poderá recuperar depois.',
			showCancelButton: true,
			confirmButtonColor: '#DD6B55',
			confirmButtonText: 'Sim, exclua agora!',
			closeOnConfirm: true,
		}, 
			onExcluirConfirmado.bind(this, url)
		);
	}
	
	function onExcluirConfirmado(url) {
		$.ajax({
			url: url,
			method: 'DELETE',
			success: onExcluidoSucesso.bind(this),
			error: onErroAoExcluir.bind(this)
		});
	}
	
	function onExcluidoSucesso() {
		var urlAtual = window.location.href;
		var separator = urlAtual.indexOf('?') > -1 ? '&' : '?';
		var novaUrl = urlAtual.indexOf('excluido') > -1 ? urlAtual : urlAtual + separator + 'excluido';
		
		window.location = novaUrl;
	}
	
	function onErroAoExcluir(e) {
		swal('Ooops!', e.responseText, 'error');
	}
	
	return DialogoExcluir;
	
}());

$(function() {
	var dialogo = new Brewer.DialogoExcluir();
	dialogo.iniciar();
});