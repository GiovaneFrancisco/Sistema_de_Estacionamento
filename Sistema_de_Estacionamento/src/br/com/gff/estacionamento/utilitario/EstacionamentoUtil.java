package br.com.gff.estacionamento.utilitario;

import br.com.gff.estacionamento.negocios.Movimentacao;

/**
 * Representa uma classe de apoio para o sistema.
 * 
 * @author Giovane Francisco
 *
 */
public class EstacionamentoUtil {
	
	/**
	 * Valida a placa do veículo com o padrao nacional LLL-NNNN.
	 * L - Letra
	 * N - Número
	 * 
	 * @param placa Placa do veículo
	 * @return true se atender o padrão, false se não.
	 */
	public boolean validarPadraoPlaca(String placa) {
		//TODO implementar ValidarPadraoPlaca
		return false;
	}
	
	/**
	 * Calculo do valor da estada do veículo baseado no tarifário, hora de entrada e saída
	 * Altera a própria instância do parâmentro 
	 * 
	 * @param movimentacao Instancia da movimentação
	 */
	public void calcularPagamento(Movimentacao movimentacao) {
		//TODO implementar calcularPagamento
	}
}
