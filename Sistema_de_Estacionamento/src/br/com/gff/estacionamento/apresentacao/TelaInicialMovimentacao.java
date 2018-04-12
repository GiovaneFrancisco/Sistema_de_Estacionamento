package br.com.gff.estacionamento.apresentacao;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaInicialMovimentacao extends JFrame implements ActionListener{
	
	private JButton btnSair;
	private JButton btnEntrar;
	
	//TODO temporário
		public static void main(String[] args) {
			TelaInicialMovimentacao tela = new TelaInicialMovimentacao();
			tela.setVisible(true);
		}
	
	public TelaInicialMovimentacao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sistma de estacionamento");
		getContentPane().setLayout(new GridLayout(1, 2, 0, 0));
		setSize(new Dimension(550,300)); //Cria a tela
		
		btnEntrar = new JButton("");
		btnEntrar.addActionListener(this); //Faz com que o botão receba uma ação
		btnEntrar.setActionCommand("entrada"); //Quando pressionado gera o texto entrada
		btnEntrar.setToolTipText("Resgistrar entrada de ve\u00EDculo");
		btnEntrar.setBackground(SystemColor.menu);
		btnEntrar.setIcon(new ImageIcon(TelaInicialMovimentacao.class.getResource("/recursos/entrada.png.png")));
		getContentPane().add(btnEntrar);
		
		btnSair = new JButton("");
		btnSair.addActionListener(this); //Faz com que o botão receba uma ação
		btnSair.setActionCommand("saida"); //Quando pressionado gera o texto saida
		btnSair.setToolTipText("Registrar sa\u00EDda de ve\u00EDculo");
		btnSair.setBackground(SystemColor.menu);
		btnSair.setIcon(new ImageIcon(TelaInicialMovimentacao.class.getResource("/recursos/saida.png.png")));
		getContentPane().add(btnSair);
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand(); //Recebe o texto gerado pela ação
		JFrame tela = null;
		if (cmd.equals("entrada")) { //Se o texto recebido for igual a entrada, o 1o botão foi apertado
			tela = new TelaEntradaVeiculo(this); //Cria a tela de entrada
		}else { //Senão, o 2o botão foi apertado
			tela = new TelaSaidaVeiculo(this); //Cria a tela de saída
		}
		tela.setVisible(true); //Faz com que apareça a tela criada
		this.setVisible(false); //"Minimiza" esta tela de escolha
		
	}

}
