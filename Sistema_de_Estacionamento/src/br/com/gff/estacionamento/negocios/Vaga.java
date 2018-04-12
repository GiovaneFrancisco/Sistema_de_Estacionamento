package br.com.gff.estacionamento.negocios;

/**
 * Representa as informa��es relativas as vagas do estacionamento.
 * 
 * @author Giovane Francisco
 *
 */
public class Vaga {
	private Vaga() {} //Define um construtor que pro�be a atribui��o de outros valores � essa classe
	
	public static int TOTAL_VAGAS = 100;
	/* private int vagasOcupadas = 0; o valor tem que ser considerado est�tico, 
	 * pois � um valor "global" usado por todas as outras classes
	 */
	
	private static int vagasOcupadas = 0;

	/**
	 * Verifica a exist�ncia de alguma vaga livre no estacionamento.
	 * @return true se houver alguma vaga livre e false se nao houver.
	 */
	public boolean temVagaLivre() {
		//TODO implementar temVagaLivre
		return false;
	}
	
	/**
	 * Busca o status atual das vagas do estacionamento.
	 */
	public static void inicializarOcupadas() {
		//TODO implementar inicializarOcupadas
	}
	
	/**
	 * Retorna o n�mero de vagas ocupadas.
	 * @return n�mero total de vagas ocupadas num determinado instante
	 */
	public static int ocupada() {
		return Vaga.vagasOcupadas;
	}
	
	/**
	 * Retorna o n�mero de vagas livres.
	 * @return n�mero total de vagas livres
	 */
	public static int livres() {
		return TOTAL_VAGAS - Vaga.vagasOcupadas;
	}
	
	/**
	 * Atualiza o valor de vagas ocupadas 
	 */
	public static void entrou() {
		Vaga.vagasOcupadas ++;
	}
}