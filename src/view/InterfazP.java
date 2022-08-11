package view;

import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.*;

public class InterfazP extends JFrame implements ActionListener {
	JPanel panel01;
	JButton btn01;
	JButton btn02;
	JButton btn03;

	public InterfazP() {

		Toolkit centrarForm = Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla = centrarForm.getScreenSize();
		

		int heigthForm = tamanoPantalla.height / 2;
		int whidthForm = tamanoPantalla.width / 2;

		String Labe_1 = "Listado de líderes ordenados por ciudad ";
		String Labe_2 = "Información de proyectos filtrados por nombre y por ciudad ";
		String Labe_3 = "Compras realizadas por los proyectos filtradas por ciudad y proveedor ";
		
		
		setTitle("Interfaz Principal");
		setSize(whidthForm, heigthForm);
		setLocation(whidthForm / 2, heigthForm / 2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		btn01 = new JButton("Consulta 1");
		btn01.setBounds(whidthForm * 50 / 100, 40, 300, 50);
		btn01.setToolTipText(Labe_1);
		btn01.addActionListener(this);
		add(btn01);

		btn02 = new JButton("Consulta 2");
		btn02.setBounds(whidthForm * 50 / 100, 100, 300, 50);
		btn02.setToolTipText(Labe_2);
		btn02.addActionListener(this);
		add(btn02);

		btn03 = new JButton("Consulta 3");
		btn03.setBounds(whidthForm * 50 / 100, 160, 300, 50);
		btn03.setToolTipText(Labe_3);
		btn03.addActionListener(this);
		add(btn03);

		//add(labels);
		

		panel01 = new JPanel();
		panel01.setLayout(null);
		add(panel01);
		
		JLabel etiq1 = new JLabel();
		etiq1.setBounds(10,40,300,25);
		etiq1.setText(Labe_1+":");
		//etiq1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel01.add(etiq1);
		
		JLabel etiq2 = new JLabel();
		etiq2.setBounds(10,90,410,60);
		etiq2.setText("<html>" + Labe_2 +": <html>");
		panel01.add(etiq2);
		
		JLabel etiq3 = new JLabel();
		etiq3.setBounds(10,160,410,60);
		etiq3.setText("<html>" + Labe_3 +": <html>");
		panel01.add(etiq3);	
		
		
        int topLabel = heigthForm* 50/100;
        int widthLabel = whidthForm * 90/100;
		JLabel etiq4 = new JLabel();
		etiq4.setBounds(20,topLabel,widthLabel,100);
		etiq4.setText("<html>Ciclo 2 - Programación Básica <br> Trabajo presentado por : Alvaro Nates Huertas <br> "
				+ "Grupo: 71<html>");
		etiq4.setFont(new Font("Verdana", Font.PLAIN, 18));
		etiq4.setBackground(Color.ORANGE);
		etiq4.setOpaque(true);
		panel01.add(etiq4);	
		
			

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btn01) {
			new Interfaz1();
		} else if (e.getSource() == btn02) {
			new Interfaz2();
		} else if (e.getSource() == btn03) {
			new Interfaz3();
		}
	}
}

