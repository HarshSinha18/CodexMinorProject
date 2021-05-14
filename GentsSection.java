package Codex;

import javax.swing.*;  
import java.awt.event.*;  
public class GensSection extends JFrame implements ActionListener{  
    JLabel i1;  
    JCheckBox cb1,cb2,cb3 ; 
    JButton b;  
    GensSection(){  
    	JTextField t1 = new 	JTextField("<Gen's  Section/>");
    	t1.setBounds(50 , 30 , 200 , 20);
        i1=new JLabel("What do you want to 	Order ? ");  
        i1.setBounds(50,50,300,20);  
        cb1=new JCheckBox("Red Shirt @ 599 RS");  
        cb1.setBounds(100,100,150,20);  
        cb2=new JCheckBox(" Black Shirt @ 550 RS");  
        cb2.setBounds(100,150,150,20);  
        cb3=new JCheckBox("Blue Shirts @ 799 RS");  
        cb3.setBounds(100,200,150,20);   
        b=new JButton("Order");  
        b.setBounds(100,250,80,30);  
        b.addActionListener(this); 
        add(t1);
        add(i1);
        add(cb1);
        add(cb2);
        add(cb3);
        add(b);  
        setSize(400,400);  
        setLayout(null); 
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    public void actionPerformed(ActionEvent e){  
        float amount=0;  
        String msg="";  
        if(cb1.isSelected()){  
            amount+=599;  
            msg="Red Shirt: 599\n";  
        }  
        if(cb2.isSelected()){  
            amount+=550;  
            msg+="Black Shirt: 550\n";  
        }  
        if(cb3.isSelected()){  
            amount+=799;  
            msg+="Blue Shirt: 799\n";  
        }
        msg+="-----------------\n";  
        JOptionPane.showMessageDialog(this,msg+"Total: "+amount);  
    }  
    public static void main(String[] args) {  
    }  

}
