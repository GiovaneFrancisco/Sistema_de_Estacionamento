package br.com.gff.estacionamento.utilitario;

import java.util.regex.Pattern;

import br.com.gff.estacionamento.negocios.Movimentacao;
import jdk.nashorn.internal.runtime.regexp.joni.Matcher;

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
	public static boolean validarPadraoPlaca(String placa) {
		String padrao = "[A_Z][A_Z][A_Z]-[0_9][0_9][0_9][0_9]"; //Cria o padr�o com 3 letras mai�sculas e 4 n�meros
		Pattern p = Pattern.compile(padrao); //Recebe este padr�o
		java.util.regex.Matcher m = p.matcher(placa); //Faz a compara��o do padr�o definido com o padr�o declarado
		return m.matches(); //Retorna os erros, caso tenha
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
