package br.com.gff.estacionamento.persistencia;

import java.time.LocalDateTime;
import java.util.List;
import br.com.gff.estacionamento.negocios.Movimentacao;

public class DAOEstacionamento {

	public void criar(Movimentacao movimentacao) {
		//TODO implementar  criar
	}
	
	public void atualizar(Movimentacao movimentacao) {
		//TODO implementar atualizar
	}
	
	public Movimentacao buscarMovimentacaoAberta(String placa) {
		//TODO implementar buscarMovimentacaoAberta
		return null;
	}
	
	public List<Movimentacao> consultarMovimentacoes(LocalDateTime data){
		//TODO implementar consultarMovimentacoes
		return null;
	}
}
