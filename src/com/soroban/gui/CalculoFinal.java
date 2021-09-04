package com.soroban.gui;

import com.soroban.backend.Operators;
import com.soroban.gui.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextPane;

public class CalculoFinal extends JPanel {	
	private JButton btnComoUtilizarVoltar;
	public CalculoFinal(GUI gui) {
		super();
		setBackground(new Color(47, 79, 79));
		this.setBounds(0, 0, 800, 500);
		this.setLayout(null);
		
		btnComoUtilizarVoltar = new JButton("Voltar");
		btnComoUtilizarVoltar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gui.voltarPasso();
				gui.switchPanel(gui.passosPanel);
			}
		});
		btnComoUtilizarVoltar.setBounds(42, 397, 183, 51);
		this.add(btnComoUtilizarVoltar);
		
		JTextPane txtpnPlaceholder = new JTextPane();
		int num1 = 0, num2 = 0;

		if (Utilizar.txfUtilizarOperando1.getText().equals(""))  num1 = 0;
		else num1 = Integer.valueOf(Utilizar.txfUtilizarOperando1.getText());

		if (Utilizar.txfUtilizarOperando2.getText().equals(""))  num2 = 0;
		else num2 = Integer.valueOf(Utilizar.txfUtilizarOperando2.getText());

		int sum = Operators.sum(num1, num2);

		txtpnPlaceholder.setText(String.valueOf(sum));
		txtpnPlaceholder.setBounds(158, 106, 488, 261);
		add(txtpnPlaceholder);
		
		JButton btnMenuPrincipal = new JButton("Menu Principal");
		btnMenuPrincipal.setBounds(42, 27, 183, 51);
		add(btnMenuPrincipal);
	}
}
