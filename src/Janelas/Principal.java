package Janelas;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//altera a aparencia das janelas para o padrao do sistema
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		//Janela1 j1 = new Janela1();
		//Janela2 j2 = new Janela2();
		//Janela3 j3 = new Janela3();
		Janela4 j4 = new Janela4();
	}

}
