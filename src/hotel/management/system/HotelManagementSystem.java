package hotel.management.system;

import javax.swing.*;
import java.awt.*;

public class HotelManagementSystem extends JFrame{
    
    HotelManagementSystem() {
//        setSize(1366, 565);
//        setLocation(100, 100);
        setBounds(100, 100, 1366, 565);
        setLayout(null);
        
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpeg"));
        JLabel image = new JLabel(img1);
        image.setBounds(0, 0, 1366, 565);
        add(image);
        
        JLabel txt1 = new JLabel("Hotel Management System");
        txt1.setBounds(20, 430, 500, 90);
        txt1.setForeground(Color.WHITE);
        txt1.setFont(new Font("serif", Font.PLAIN, 20));
        image.add(txt1);
        
        JButton next = new JButton("Next");
        next.setBounds(1150, 450, 150, 50);
        next.setBackground(Color.BLUE);
        next.setForeground(Color.BLACK);
        next.setFont(new Font("serif", Font.BOLD, 24));
        image.add(next);
        
        setVisible(true);
        
        
        while(true){
            txt1.setVisible(false);
            try{
                Thread.sleep(500);
            } catch (Exception e){
                e.printStackTrace();
            }
            txt1.setVisible(true);
            try{
                Thread.sleep(500);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new HotelManagementSystem();
    }
    
}
