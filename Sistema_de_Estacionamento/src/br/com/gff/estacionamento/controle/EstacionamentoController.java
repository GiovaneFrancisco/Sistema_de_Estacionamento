package br.com.gff.estacionamento.controle;

import java.time.LocalDateTime;
import java.util.List;

import br.com.gff.estacionamento.negocios.Movimentacao;

public class EstacionamentoController {
	/**
	 * Apartir dos dados fornecidos pelo operador, realiza o fluxo de entrada e/ou saída de veículos 
	 * 
	 * @param placa
	 * @param marca
	 * @param modelo
	 * @param cor
	 */
	public void processarEntrada(String placa, String marca, String modelo, String cor) {
		//TODO implementar processarEntrada
	}
	
	public Movimentacao processarSaida(String placa) {
		//TODO implementar processarSaida
		return null;
	}
	
	public List<Movimentacao> emitirRelatorio(LocalDateTime data){
		//TODO implementar emitirRelatorio
		return null;
	}
	
	
}
