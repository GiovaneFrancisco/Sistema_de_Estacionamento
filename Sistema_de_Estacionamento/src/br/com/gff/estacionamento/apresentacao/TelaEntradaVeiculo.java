package br.com.gff.estacionamento.apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import br.com.gff.estacionamento.controle.EstacionamentoController;

public class TelaEntradaVeiculo extends JFrame implements ActionListener{
	
	private JFrame parent;
	private JTextField txtCor;
	private JTextField txtModelo;
	private JTextField txtMarca;
	private JButton btnOk;
	private JButton btnCancelar;
	private JFormattedTextField txfPlac;
	
	//TODO temporário
	public static void main(String[] args) {
		TelaEntradaVeiculo tela = new TelaEntradaVeiculo(null);
		tela.setVisible(true);
	}
	
	public TelaEntradaVeiculo(JFrame parent) {
		setSize(290,350);
		setTitle("Entrada de ve\u00EDculo");
		//TODO criar construtir
		this.parent = parent;
		getContentPane().setLayout(null);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setBounds(54, 43, 46, 14);
		getContentPane().add(lblPlaca);
		
		JLabel lblCor = new JLabel("Cor:");
		lblCor.setBounds(54, 214, 46, 14);
		getContentPane().add(lblCor);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(54, 157, 46, 14);
		getContentPane().add(lblModelo);
		
		JLabel lblMarca = new JLabel("Marca: ");
		lblMarca.setBounds(54, 100, 68, 14);
		getContentPane().add(lblMarca);
		
		txtCor = new JTextField();
		txtCor.setBounds(125, 212, 86, 20);
		getContentPane().add(txtCor);
		txtCor.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(125, 154, 86, 20);
		getContentPane().add(txtModelo);
		txtModelo.setColumns(10);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(125, 96, 86, 20);
		getContentPane().add(txtMarca);
		txtMarca.setColumns(10);
		
		try {
			txfPlac = new JFormattedTextField(new MaskFormatter("UUU-####")); //Padrão brasileiro de placas, 3 letras e 4 números
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			assert false: "Padrão de placa incorreto"; //Caso algo no desenvolvimento de errado, aparecerá o erro para o desenvolvedor
		} 
		txfPlac.setBounds(132, 40, 68, 20);
		getContentPane().add(txfPlac);
		
		btnOk = new JButton("Ok");
		btnOk.setBounds(33, 268, 89, 23);
		getContentPane().add(btnOk);
		btnOk.addActionListener(this);
		btnOk.setActionCommand("ok");
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(138, 268, 89, 23);
		getContentPane().add(btnCancelar);
		
		setLocationRelativeTo(null);
	}


	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getActionCommand().equals("ok")) {
			EstacionamentoController controle = new EstacionamentoController();
			controle.processarEntrada(txfPlac.getText(), 
									  txtMarca.getText(), 
									  txtModelo.getText(), 
									  txtCor.getText()); //Pega os dados dos campos preenchido e envia para o Controller
		}
		this.parent.setVisible(true);
		this.dispose();
	}
		
}

