package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import model.vo.Consulta3VO;

import java.awt.*;
import java.util.ArrayList;

public class Interfaz3 extends JFrame{
    JPanel panelg;
    JTable tabla;
    JScrollPane scpanel01;
    DefaultTableModel modelo;

    public Interfaz3(){
    	Toolkit centrarForm = Toolkit.getDefaultToolkit();
    	Dimension tamanoPantalla = centrarForm.getScreenSize();
    	
    	int heigthForm = tamanoPantalla.height/2;
    	int whidthForm = tamanoPantalla.width/2;
    	
        setTitle("Consulta 3");
        setSize(whidthForm,heigthForm);
        setLocation(whidthForm/2,heigthForm/2);
        setResizable(false);
        
        panelg= new JPanel();
        panelg.setBackground(new Color(255,178,102));
        panelg.setLayout(null);
        
        int topLabel = heigthForm* 82/100;
        int widthLabel = whidthForm * 90/100;
        JLabel etiq2 = new JLabel();
		etiq2.setBounds(10,topLabel,widthLabel,60);
		etiq2.setText("<html>Compras realizadas por los proyectos con el proveedor\r\n "
				+ "“Homecenter”, para la ciudad de “Salento”<html>");
		panelg.add(etiq2);
       
        
        String[] columnas={"ID","Constructora","Banco"};
        ArrayList<String[]> d=Consulta3VO.valores();
        String[][] Datos= new String[d.size()][3];

        for (int i = 0; i < d.size(); i++) {
            int j=0;
            for (String s : d.get(i)) {
                Datos[i][j]=s;
                j++;
            }
            
        }
        
        //String[][] Datos={{"","","",""},{"","","",""}};
        modelo=new DefaultTableModel(Datos,columnas);
        tabla=new JTable(modelo);

        scpanel01=new JScrollPane(tabla);
        scpanel01.setBounds(whidthForm*2/100,heigthForm*2/100,whidthForm*95/100,heigthForm*80/100);
        add(scpanel01);


        add(panelg);
        setVisible(true);
    }
}
