package Janelas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Janela1 extends JFrame{

	public Janela1(){
		
		JFrame Janela1 = new JFrame();
		
		//Definicao do tamanho da janela
		Janela1.setBounds(200,200,200,200);
		//Definicao metodo fechar janela
		Janela1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Alterar cursor
		Janela1.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		//Alterar cor de fundo
		Janela1.getContentPane().setBackground(Color.BLUE);
		//Dar visibilidade a janela
		Janela1.setVisible(true);
	}
	
	
}
