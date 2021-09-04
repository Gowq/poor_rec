package com.soroban.gui;

import com.soroban.backend.RandomGenerator;
import com.soroban.gui.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

import java.awt.Font;
import javax.swing.JSeparator;
import java.text.ParseException;

public class Utilizar extends JPanel {
	
	private JButton btnUtilizarVoltar;
	public static JTextField txfUtilizarOperando1;
	public static JTextField txfUtilizarOperando2;
	private int numRandom;
	
	public Utilizar(GUI gui) throws ParseException {
		super();
		setBackground(new Color(47, 79, 79));
		this.setBounds(0, 0, 800, 500);
		this.setLayout(null);
		
		btnUtilizarVoltar = new JButton("Voltar");
		btnUtilizarVoltar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gui.switchPanel(gui.homePanel);
			}
		});
		btnUtilizarVoltar.setBounds(62, 390, 183, 51);
		this.add(btnUtilizarVoltar);
		
		JLabel lblOperacaoMatematica = new JLabel("Modo: ");
		lblOperacaoMatematica.setFont(new Font("Leelawadee UI", Font.BOLD, 24));
		lblOperacaoMatematica.setBounds(75, 60, 273, 44);
		add(lblOperacaoMatematica);
		
		JLabel lblGrandezaDosNumeros = new JLabel("Classe numérica");
		lblGrandezaDosNumeros.setFont(new Font("Leelawadee UI", Font.BOLD, 24));
		lblGrandezaDosNumeros.setBounds(75, 120, 273, 44);
		add(lblGrandezaDosNumeros);
		
		JLabel lblOperando_1 = new JLabel("Primeiro operando: ");
		lblOperando_1.setFont(new Font("Leelawadee UI", Font.BOLD, 24));
		lblOperando_1.setBackground(new Color(0, 0, 0));
		lblOperando_1.setForeground(new Color(0, 0, 0));
		lblOperando_1.setBounds(75, 180, 273, 44);
		add(lblOperando_1);
		
		JLabel lblOperando_2 = new JLabel("Segundo operando: ");
		lblOperando_2.setFont(new Font("Leelawadee UI", Font.BOLD, 24));
		lblOperando_2.setBounds(75, 240, 273, 44);
		add(lblOperando_2);
		
		JComboBox<String> comboBoxOperacao = new JComboBox<String>();
		comboBoxOperacao.setModel(new DefaultComboBoxModel<String>(
				new String[] {"Somar", "Subtrair"}));
		comboBoxOperacao.setBounds(450, 60, 166, 44);
		add(comboBoxOperacao);
		
		//FormataÃ§Ã£o de texto para apenas inteiros
		NumberFormatter formatter = new NumberFormatter();
		formatter.setValueClass(Integer.class);
		formatter.setMinimum(0);
		formatter.setMaximum(135);

		JComboBox<String> comboBoxGrandeza = new JComboBox<String>();
		comboBoxGrandeza.setModel(new DefaultComboBoxModel<String>(
				new String[] {"Unidades", "Dezenas", "Centenas", "Milhares", "Centena de Milhares", "Milhões"}));
		comboBoxGrandeza.setBounds(450, 120, 166, 44);
		add(comboBoxGrandeza);

		txfUtilizarOperando1 = new JFormattedTextField(formatter){
		    @Override
		    protected void processFocusEvent(final FocusEvent f) {
		    	switch(comboBoxGrandeza.getSelectedItem().toString()) {

					case "Unidades":
						numRandom  = RandomGenerator.generate("UNIT");
						setValue(numRandom);
						break;

					case "Dezenas":
						numRandom  = RandomGenerator.generate("DOZEN");
						setValue(numRandom);
						break;

					case "Centenas":
						numRandom  = RandomGenerator.generate("HUNDRED");
						setValue(numRandom);
						break;

					case "Milhares":
						numRandom  = RandomGenerator.generate("THOUSAND");
						setValue(numRandom);
						break;

					case "Centenas de Milhares":
						numRandom  = RandomGenerator.generate("HUNDRED THOUSAND");
						setValue(numRandom);
						break;

					case "Milhões":
						numRandom  = RandomGenerator.generate("MILLION");
						setValue(numRandom);
						break;

				}

		        super.processFocusEvent(f);
		    }
		};
		
		txfUtilizarOperando1.setFont(new Font("Leelawadee UI", Font.BOLD, 24));
		txfUtilizarOperando1.setBounds(450, 180, 165, 44);
		add(txfUtilizarOperando1);
		txfUtilizarOperando1.setColumns(10);
		
		txfUtilizarOperando2 = new JFormattedTextField(formatter) {
		@Override
		protected void processFocusEvent(final FocusEvent e) {
			switch(comboBoxGrandeza.getSelectedItem().toString()) {

				case "Unidades":
					numRandom  = RandomGenerator.generate("UNIT");
					setValue(numRandom);
					break;

				case "Dezenas":
					numRandom  = RandomGenerator.generate("DOZEN");
					setValue(numRandom);
					break;

				case "Centenas":
					numRandom  = RandomGenerator.generate("HUNDRED");
					setValue(numRandom);
					break;

				case "Milhares":
					numRandom  = RandomGenerator.generate("THOUSAND");
					setValue(numRandom);
					break;

				case "Centenas de Milhares":
					numRandom  = RandomGenerator.generate("HUNDRED THOUSAND");
					setValue(numRandom);
					break;

				case "Milhões":
					numRandom  = RandomGenerator.generate("MILLION");
					setValue(numRandom);
					break;
			}
			super.processFocusEvent(e);
		}
	};
		
		txfUtilizarOperando2.setFont(new Font("Leelawadee UI", Font.BOLD, 24));
		txfUtilizarOperando2.setBounds(450, 240, 165, 44);
		add(txfUtilizarOperando2);
		txfUtilizarOperando2.setColumns(10);
		
		JButton btnUtilizarPassos = new JButton("Passos");
		btnUtilizarPassos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gui.resetPasso();
				gui.switchPanel(gui.passosPanel);
			}
		});
		btnUtilizarPassos.setBounds(307, 390, 183, 51);
		add(btnUtilizarPassos);
		
		JButton btnUtilizarCalcular = new JButton("Calcular Resultado");
		btnUtilizarCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gui.switchPanel(gui.calculoFinalPanel);
			}
		});
		btnUtilizarCalcular.setBounds(552, 390, 183, 51);
		add(btnUtilizarCalcular);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 337, 780, 8);
		add(separator);
	}
}
