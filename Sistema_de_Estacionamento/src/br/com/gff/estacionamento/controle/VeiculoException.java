package br.com.gff.estacionamento.controle;

public class VeiculoException extends Exception { //Cria uma excessão
	public VeiculoException(String msg) { //Recebe a mensagem do erro
		super(msg); //Envia para a classe Pai
	}
}
