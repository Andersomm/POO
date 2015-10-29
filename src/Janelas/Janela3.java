package Janelas;

import java.awt.Color;
import java.awt.Font;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Janela3 extends JFrame{
	
	public Janela3(){
		setTitle("Exemplo de utilização de JLabel");
		setSize(200,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel painel = new JPanel();
		
		Date data = new Date(System.currentTimeMillis());
		
		//Criando JLabels
		JLabel label1 = new JLabel("Welcome Home!!!");
		JLabel label2 = new JLabel("Aula de POO");
		JLabel label3 = new JLabel("Data: "+data.toString());
		
		//Definindo a Fonte da Label
		label2.setFont(new Font("Arial",Font.ITALIC,24));
		label1.setForeground(Color.BLUE);
		label3.setToolTipText("Label do Horário Mostrado");
		
		painel.add(label1);
		painel.add(label2);
		painel.add(label3);
		
		add(painel);
		
		setVisible(true);
		
		
	}

}
