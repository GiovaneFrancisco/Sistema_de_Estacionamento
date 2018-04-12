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
	 * Valida a placa do ve�culo com o padrao nacional LLL-NNNN.
	 * L - Letra
	 * N - N�mero
	 * 
	 * @param placa Placa do ve�culo
	 * @return true se atender o padr�o, false se n�o.
	 */
	public boolean validarPadraoPlaca(String placa) {
		//TODO implementar ValidarPadraoPlaca
		return false;
	}
	
	/**
	 * Calculo do valor da estada do ve�culo baseado no tarif�rio, hora de entrada e sa�da
	 * Altera a pr�pria inst�ncia do par�mentro 
	 * 
	 * @param movimentacao Instancia da movimenta��o
	 */
	public void calcularPagamento(Movimentacao movimentacao) {
		//TODO implementar calcularPagamento
	}
}
