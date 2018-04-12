package br.com.gff.estacionamento.negocios;

import java.time.LocalDateTime;

/**
 * Representa o fluxo de entrada e saída de veículos do estacionamnto.
 * Contém as informações de entrada, saída e o valor pago.
 * 
 * @author Giovane Francisco
 *
 */
public class Movimentacao {
	private Veiculo veiculo;
	private LocalDateTime dataHoraEntrada; //Utilização de uma classe para registrar data e hora
	private LocalDateTime dataHoraSaida;
	private double valor;

	public Movimentacao(Veiculo veiculo, LocalDateTime dataEntrada) {
		this.veiculo = veiculo;
		this.dataHoraEntrada = dataEntrada;
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public LocalDateTime getDataHoraEntrada() {
		return dataHoraEntrada;
	}
	public void setDataHoraEntrada(LocalDateTime dataHoraEntrada) {
		this.dataHoraEntrada = dataHoraEntrada;
	}
	public LocalDateTime getDataHoraSaida() {
		return dataHoraSaida;
	}
	public void setDataHoraSaida(LocalDateTime dataHoraSaida) {
		this.dataHoraSaida = dataHoraSaida;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
