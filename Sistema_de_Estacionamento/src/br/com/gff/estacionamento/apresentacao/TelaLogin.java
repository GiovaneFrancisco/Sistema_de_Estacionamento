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
	
	//Coloca os campos que serão utilizdos por outras classes como atributos 
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
		setSize(new Dimension(500,150)); //Cria as dimenções da janela
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
		
		ButtonGroup grupo = new ButtonGroup(); //Cria um grupo de botões para que não haja a seleção simultânea de ambos
		rdbtnOperacional = new JRadioButton("Operador");
		rdbtnOperacional.setSelected(true); //Começa o programa com este selecionado
		rdbtnOperacional.addActionListener(this); //Quando o botão estiver selecionado, desencadeia uma ação 
		rdbtnOperacional.setActionCommand("operacional"); //Quando este for selecionado, crie uma String "operacional" para ser usada
		grupo.add(rdbtnOperacional); //Adiciona o botão ao grupo
		panel_3.add(rdbtnOperacional);
	
		rdbtnRelatorio = new JRadioButton("Administrador");
		grupo.add(rdbtnRelatorio); //Adiciona o botão ao grupo
		rdbtnRelatorio.addActionListener(this); //Quando o botão estiver selecionado, desencadeia uma ação 
		rdbtnRelatorio.setActionCommand("relatorio"); //Quando este for selecionado, crie uma String "relatorio" para ser usada
		panel_3.add(rdbtnRelatorio);

		panel_2.setVisible(false); //Inicia o programa com o painel de senha invisível, pois o botão operacional estará selecionado
		setLocationRelativeTo(null); //Faz com que a tela apareca no meio 
		
	}

	@Override
	public void actionPerformed(ActionEvent evento) { //Desencadeia uma sequencia de eventos
		String cmd = evento.getActionCommand(); //Cria uma variável baseada nos comandos dados
		JFrame tela = null;
		if(cmd.equals("operacional")) { //Se o botão operacional for selecionado, a String "operacional" passará para essa variável, 
			panel_2.setVisible(false); //Deixa o painel de senha invisível
		}else if(cmd.equals("relatorio")){//Se o botão relatório for selecionado, a String "relatorio" passará para essa variável
			txtSenha.setText(null); //Apaga o campo de texto Senha caso tenha algo escrito
			panel_2.setVisible(true); //Deixa o painel de senha visível
			
		}else if(cmd.equals("ok")) { //Se o botão Ok for apertado
			if(rdbtnOperacional.isSelected()) { //Se o Operacional estiver selecionado
				tela = new TelaInicialMovimentacao(); //Crie a tela de movimentação
				tela.setVisible(true); //Mostre a tela de movimentação
				
			}else { //Senão, o botão Relatório estará apertado
				String senha = new String(txtSenha.getPassword()); //Captura os caracteres escritos no campo de senha
				if(senha.equals("giovane")) { //Se esses caracteres forem iguais a uma senha pré definida
					tela = new TelaInicialRelatorio(); //Crie a tela de relatórios
					tela.setVisible(true); //Mostre a tela de relatórios
				}else{
					JOptionPane.showMessageDialog(null, "Senha incorreta", "Falha de Login", JOptionPane.ERROR_MESSAGE); 
					//Se a senha não for igual, crie um JOptionPane mostrando o erro
					txtSenha.setText(null); //Limpa o campo de senha
					return; //Volte para a tela de seleção
				}
			}
			this.dispose(); //A tela de Login será "apagada"
		} 
	}
}
