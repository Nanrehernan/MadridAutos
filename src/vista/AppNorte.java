/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.FlowLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author HERNAN GARCETE
 */
public class AppNorte extends JPanel{
    public AppNorte(){
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JMenu menu1 = new JMenu("Mantenimiento");
        JMenu menu2 = new JMenu("Vista");
        
        JMenuItem item1 = new JMenuItem("Nuevo Marca");
        JMenuItem item2 = new JMenuItem("Nuevo Modelo");
        
        JMenuBar barra = new JMenuBar();
        
        menu1.add(item1);
        menu1.add(item2);
        
        barra.add(menu1);
        barra.add(menu2);
        
        add(barra);
    }
}
