package Janelas;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Janela2 extends JFrame{
	
	public Janela2(){
		
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Exemplo de JPanel");
		
		//Criação do novo JPanel
		JPanel painel = new JPanel();
		//Borda com titulo e aplicar ao JPanel
		painel.setBorder(BorderFactory.createTitledBorder(" Painel "));
		//Inserir JPanel na JFrame
		getContentPane().add(painel);
		setVisible(true);
		
		
	}

}
