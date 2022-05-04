/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HERNAN GARCETE
 */
public class VistaTabla extends JPanel{
    private JTable tabla;
    private JComboBox combo;
    private JTextField cuadro_texto;
    
    public VistaTabla(){
        setLayout(new BorderLayout());
        add(new LaminaNorte(), BorderLayout.NORTH);
        add(new LaminaCentro(), BorderLayout.CENTER);
    }
    
    private class LaminaNorte extends JPanel{
        public LaminaNorte(){
            setLayout(new FlowLayout(FlowLayout.RIGHT));
            String opciones[] = {"Marca", "Consumo Maximo", "Emisiones Maximas", "Clasificacion Energetica"};
            cuadro_texto = new JTextField();
            cuadro_texto.setPreferredSize(new Dimension(200, 25));
            combo = new JComboBox(opciones);
            add(combo);
            add(cuadro_texto);
        }
    }
    
    private class LaminaCentro extends JPanel{
        public LaminaCentro(){
            setLayout(new GridLayout(1, 1));
            
            TableRenderImagen render = new TableRenderImagen();
            tabla = new JTable();
            tabla.setDefaultRenderer(Object.class, render);
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            modelo.addColumn("Modelo");
            modelo.addColumn("Consumo");
            modelo.addColumn("Emisiones");
            modelo.addColumn("Imagen");
            add(new JScrollPane(tabla));
        }
    }
}
