/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;


/**
 *
 * @author ravi
 */



public class ManagerInfo extends JFrame implements ActionListener{
    
    JTable table;
    JButton back; 
    
    ManagerInfo(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        
//        Jlabel l1 = new JLabel("Room Number");
//        l1.setBounds(10, 10, 100, 20);
//        add(l1);

        JLabel l1 = new JLabel("Name");
        l1.setBounds(0, 10, 100, 20);
        add(l1);
        
        JLabel l2 = new JLabel("Age");
        l2.setBounds(120, 10, 100, 20);
        add(l2);
        
        JLabel l3 = new JLabel("Gender");
        l3.setBounds(250, 10, 100, 20);
        add(l3);
        
        JLabel l4 = new JLabel("Job");
        l4.setBounds(390, 10, 100, 20);
        add(l4);
        
        JLabel l5 = new JLabel("Salary");
        l5.setBounds(500, 10, 100, 20);
        add(l5);
        
         JLabel l6 = new JLabel("Phone");
        l6.setBounds(640, 10, 100, 20);
        add(l6);
        
        JLabel l7 = new JLabel("Email");
        l7.setBounds(760, 10, 100, 20);
        add(l7);
        
        JLabel l8 = new JLabel("Social Security");
        l8.setBounds(870, 10, 100, 20);
        add(l8);
        
        table = new JTable();
        table.setBounds(0, 40, 1000, 400);
        add(table);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee where job = 'Manager'");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch(Exception e){
            e.printStackTrace();
        }
        
        back = new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        back.setBounds(440, 500, 120, 30);
        add(back);
        
        setBounds(300, 200, 1000, 600);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Reception(); 
    }
    public static void main(String[] args){
        new ManagerInfo();
    }
}