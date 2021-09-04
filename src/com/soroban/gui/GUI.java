package com.soroban.gui;

import java.awt.BorderLayout;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {
	
	private final JFrame frmAbaco;
	
	public JPanel historiaPanel;
	public JPanel homePanel;
	public JPanel utilizarPanel;
	public JPanel comoUtilizarPanel;
	public JPanel passosPanel;
	public JPanel calculoFinalPanel;
	public JPanel desafioPanel;
	private int passoAtual;
	
	public void resetPasso() {
		passoAtual = 0;
	}
	
	public int proxPasso() {
		int passo = ++passoAtual;
		//Implementar limites para o contador, preciso do resto do programa pra implementar
		//Retornar -1 quando bater no limite para passar para o frame calculoFinal
		return passo;
	}
	public int voltarPasso() {
		int passo = --passoAtual;
		//Implementar limites para o contador, preciso do resto do programa pra implementar
		return passo;
	}
	
	public void switchPanel(JPanel panel) {
		frmAbaco.getContentPane().removeAll();
		frmAbaco.getContentPane().add(panel, BorderLayout.CENTER);
		frmAbaco.getContentPane().revalidate();
		frmAbaco.repaint();
	}

	public GUI() throws ParseException {
		frmAbaco = new JFrame("\u00C1baco");
		frmAbaco.setSize(800,500);
		frmAbaco.setResizable(false);
		
		frmAbaco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		homePanel = new Home(this);
		utilizarPanel = new Utilizar(this);
		historiaPanel = new Historia(this);
		comoUtilizarPanel = new ComoUtilizar(this);
		passosPanel = new Passos(this);
		calculoFinalPanel = new CalculoFinal(this);
		desafioPanel = new Desafio(this);
		

		frmAbaco.getContentPane().add(homePanel, BorderLayout.CENTER);
		frmAbaco.setVisible(true);
	}
}
