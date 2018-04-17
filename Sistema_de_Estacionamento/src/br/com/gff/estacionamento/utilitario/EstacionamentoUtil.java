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
	 * Valida a placa do veículo com o padrao nacional LLL-NNNN.
	 * L - Letra
	 * N - Número
	 * 
	 * @param placa Placa do veículo
	 * @return true se atender o padrão, false se não.
	 */
	public static boolean validarPadraoPlaca(String placa) {
		String padrao = "[A_Z][A_Z][A_Z]-[0_9][0_9][0_9][0_9]"; //Cria o padrão com 3 letras maiúsculas e 4 números
		Pattern p = Pattern.compile(padrao); //Recebe este padrão
		java.util.regex.Matcher m = p.matcher(placa); //Faz a comparação do padrão definido com o padrão declarado
		return m.matches(); //Retorna os erros, caso tenha
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
