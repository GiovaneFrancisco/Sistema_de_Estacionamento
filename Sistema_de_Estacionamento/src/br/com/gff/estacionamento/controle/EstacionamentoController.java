package br.com.gff.estacionamento.controle;

import java.time.LocalDateTime;
import java.util.List;

import br.com.gff.estacionamento.negocios.Movimentacao;
import br.com.gff.estacionamento.negocios.Vaga;
import br.com.gff.estacionamento.negocios.Veiculo;
import br.com.gff.estacionamento.persistencia.DAOEstacionamento;
import br.com.gff.estacionamento.utilitario.EstacionamentoUtil;

public class EstacionamentoController {
	/**
	 * Apartir dos dados fornecidos pelo operador, realiza o fluxo de entrada e/ou saída de veículos 
	 * 
	 * @param placa
	 * @param marca
	 * @param modelo
	 * @param cor
	 * @throws EstacionamentoExcepion quando estacionamento estiver lotado
	 * @throws VeiculoException quando o padrão da placa estiver incorreta
	 */
	public void processarEntrada(String placa, String marca, String modelo, String cor) throws EstacionamentoExcepion, VeiculoException {
		
		if(!Vaga.temVagaLivre()) { //Verificar a existencia de vagas livres
			throw new EstacionamentoExcepion("Estacionamento Lotado!"); //Cria uma classe para uma excessão específica, neste caso, quando não houver vagas livres
		}
		
		
		if(EstacionamentoUtil.validarPadraoPlaca(placa)) { //Confirmar a formatação da placa
			throw new VeiculoException("Placa Inválida!");//Cria uma classe para uma excessão específica, neste caso, quando o padrão da placa estiver incorreto
		}
		
		
		Veiculo veiculo = new Veiculo(placa, marca, modelo, cor); //Criar uma instancia do veiculo
		
		
		Movimentacao movimentacao = new Movimentacao(veiculo, LocalDateTime.now()); //Criar a movimentacao, com as caracteristicas e a data de entrada do veiculo
		
		
		DAOEstacionamento dao = new DAOEstacionamento(); //Registrar na base de dados
		dao.criar(movimentacao);
		
	
		Vaga.entrou(); //Atuliza as vagas
		
		
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
