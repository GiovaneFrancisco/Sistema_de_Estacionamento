package br.com.gff.estacionamento.apresentacao;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;

public class TelaLogin extends JFrame implements ActionListener{
	
	//Coloca os campos que ser�o utilizdos por outras classes como atributos 
	private JPasswordField txtSenha;
	private JPanel panel_2;
	private JRadioButton rdbtnOperacional;
	private JRadioButton rdbtnRelatorio;
	private JButton btnOK;
	
	public static void main(String[] args) {
		TelaLogin tela = new TelaLogin();
		tela.setVisible(true);
	}
	
	public TelaLogin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(500,150)); //Cria as dimen��es da janela
		setTitle("Login");
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		
		btnOK = new JButton("OK!");
		btnOK.addActionListener(this);
		btnOK.setActionCommand("ok");
		panel.add(btnOK);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.SOUTH);
		
		JLabel lblSenha = new JLabel("Senha:");
		panel_2.add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setColumns(20);
		panel_2.add(txtSenha);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.CENTER);
		
		ButtonGroup grupo = new ButtonGroup(); //Cria um grupo de bot�es para que n�o haja a sele��o simult�nea de ambos
		rdbtnOperacional = new JRadioButton("Operador");
		rdbtnOperacional.setSelected(true); //Come�a o programa com este selecionado
		rdbtnOperacional.addActionListener(this); //Quando o bot�o estiver selecionado, desencadeia uma a��o 
		rdbtnOperacional.setActionCommand("operacional"); //Quando este for selecionado, crie uma String "operacional" para ser usada
		grupo.add(rdbtnOperacional); //Adiciona o bot�o ao grupo
		panel_3.add(rdbtnOperacional);
	
		rdbtnRelatorio = new JRadioButton("Administrador");
		grupo.add(rdbtnRelatorio); //Adiciona o bot�o ao grupo
		rdbtnRelatorio.addActionListener(this); //Quando o bot�o estiver selecionado, desencadeia uma a��o 
		rdbtnRelatorio.setActionCommand("relatorio"); //Quando este for selecionado, crie uma String "relatorio" para ser usada
		panel_3.add(rdbtnRelatorio);

		panel_2.setVisible(false); //Inicia o programa com o painel de senha invis�vel, pois o bot�o operacional estar� selecionado
		setLocationRelativeTo(null); //Faz com que a tela apareca no meio 
		
	}

	@Override
	public void actionPerformed(ActionEvent evento) { //Desencadeia uma sequencia de eventos
		String cmd = evento.getActionCommand(); //Cria uma vari�vel baseada nos comandos dados
		JFrame tela = null;
		if(cmd.equals("operacional")) { //Se o bot�o operacional for selecionado, a String "operacional" passar� para essa vari�vel, 
			panel_2.setVisible(false); //Deixa o painel de senha invis�vel
		}else if(cmd.equals("relatorio")){//Se o bot�o relat�rio for selecionado, a String "relatorio" passar� para essa vari�vel
			txtSenha.setText(null); //Apaga o campo de texto Senha caso tenha algo escrito
			panel_2.setVisible(true); //Deixa o painel de senha vis�vel
			
		}else if(cmd.equals("ok")) { //Se o bot�o Ok for apertado
			if(rdbtnOperacional.isSelected()) { //Se o Operacional estiver selecionado
				tela = new TelaInicialMovimentacao(); //Crie a tela de movimenta��o
				tela.setVisible(true); //Mostre a tela de movimenta��o
				
			}else { //Sen�o, o bot�o Relat�rio estar� apertado
				String senha = new String(txtSenha.getPassword()); //Captura os caracteres escritos no campo de senha
				if(senha.equals("giovane")) { //Se esses caracteres forem iguais a uma senha pr� definida
					tela = new TelaInicialRelatorio(); //Crie a tela de relat�rios
					tela.setVisible(true); //Mostre a tela de relat�rios
				}else{
					JOptionPane.showMessageDialog(null, "Senha incorreta", "Falha de Login", JOptionPane.ERROR_MESSAGE); 
					//Se a senha n�o for igual, crie um JOptionPane mostrando o erro
					txtSenha.setText(null); //Limpa o campo de senha
					return; //Volte para a tela de sele��o
				}
			}
			this.dispose(); //A tela de Login ser� "apagada"
		} 
	}
}
