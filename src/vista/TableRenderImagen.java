/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author HERNAN GARCETE
 */
public class TableRenderImagen extends DefaultTableCellRenderer{
    @Override
    public Component getTableCellRendererComponent(JTable tabla, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        if (value instanceof JLabel){
            JLabel label = (JLabel) value;
            label.setOpaque(true);
            fillColor(tabla, label, isSelected);
            return label;
        }else{
            return super.getTableCellRendererComponent(tabla, value, isSelected, hasFocus, row, column);
        }
    }
    
    public void fillColor(JTable tabla, JLabel label, boolean isSelected){
        if (isSelected){
            label.setBackground(tabla.getSelectionBackground());
            label.setForeground(tabla.getSelectionForeground());
        }else{
            label.setBackground(tabla.getBackground());
            label.setForeground(tabla.getForeground());
        }
    }
}
