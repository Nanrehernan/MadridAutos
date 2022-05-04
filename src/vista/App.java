/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author HERNAN GARCETE
 */
public class App extends JPanel{
    public App(){
        setLayout(new BorderLayout());
        add(new AppNorte(), BorderLayout.NORTH);
        add(new AppCentro(), BorderLayout.CENTER);
    }
}
