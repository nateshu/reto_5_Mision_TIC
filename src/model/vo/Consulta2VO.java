package model.vo;
import java.sql.*;
import java.util.ArrayList;

import model.dao.Consulta2DAO;
public class Consulta2VO {
    public static ArrayList<String[]> valores() {
        ArrayList<String[]> salida_vo=new ArrayList<String[]>();
        try {
            ResultSet rs=Consulta2DAO.consulta();
            while(rs.next()){
                //ID_Proyecto,Constructora,Numero_Habitaciones,Ciudad
                int ID=rs.getInt("ID_Proyecto");
                String constructora=rs.getString("Constructora");
                String nh=rs.getString("Numero_Habitaciones");
                String ciudad=rs.getString("Ciudad");
                //System.out.println(String.format("%5d %15s %15s %15s", ID,nombre,apellido,ciudad));
                salida_vo.add(new String[]{ID+"",constructora,nh,ciudad});
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return salida_vo;        
    }
}
