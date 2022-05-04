/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.JFrame;

/**
 *
 * @author HERNAN GARCETE
 */
public class Marco extends JFrame{
    public Marco(){
        setTitle("Madrid Autos");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(new App());
        setVisible(true);
    }
}
