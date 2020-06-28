/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;



public class Color extends DefaultTableCellRenderer{  

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel cell = (JLabel) super.getTableCellRendererComponent(table, value, hasFocus, hasFocus, row, row);
        if (value==null){
            cell.setBackground(java.awt.Color.WHITE);
        }else{
            int valor = (int)value;    
            if (valor==0){
                cell.setBackground(java.awt.Color.orange);
                cell.setForeground(java.awt.Color.orange);
                
            }
            if (valor==1){
                cell.setBackground(java.awt.Color.YELLOW);
                cell.setForeground(java.awt.Color.YELLOW);
                
                
            }            
        }
       
        
        return cell;
    }
};


