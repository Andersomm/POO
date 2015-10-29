package Janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Janela4 extends JFrame implements ActionListener{
	
	public Janela4(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,450);
		JPanel painel = new JPanel();
		JButton btnOK = new JButton("OK");
		JButton btnSAIR = new JButton("SAIR");
		
		btnSAIR.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Você clicou no botão SAIR");
				System.exit(0);
			}	
		});
		
		btnOK.setName("btnOK");
		
		btnOK.addActionListener(this);
		painel.add(btnOK);
		painel.add(btnSAIR);
		
		add(painel);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent arg0){
		JButton botao = (JButton)arg0.getSource();
		JOptionPane.showMessageDialog(null, "Você clicou em um botão");
	}
			
	}










