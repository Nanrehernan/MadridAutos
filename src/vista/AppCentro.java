/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author HERNAN GARCETE
 */
public class AppCentro extends JPanel{
    public AppCentro(){
        CardLayout cl = new CardLayout();
        VistaTabla vt = new VistaTabla();
        
        cl.addLayoutComponent(this, "VistaTabla");
        setLayout(cl);
        add(vt);
    }
}
