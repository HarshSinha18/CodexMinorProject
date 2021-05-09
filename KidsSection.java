package Codex;
import javax.swing.*;  
import java.awt.event.*;  
public class KidsSection extends JFrame implements ActionListener{  
    JLabel i1;  
    JCheckBox cb1,cb2,cb3 ; 
    JButton b;  
    KidsSection(){  
    	JTextField t1 = new 	JTextField("<Kids Section/>");
    	t1.setBounds(50 , 30 , 200 , 20);
        i1=new JLabel("What do you want to Order ? ");  
        i1.setBounds(50,50,300,20);  
        cb1=new JCheckBox("Kids T-Shirt @ 199 Rs");  
        cb1.setBounds(100,100,150,20);  
        cb2=new JCheckBox("Kids Shirt @ 249 Rs");  
        cb2.setBounds(100,150,150,20);  
        cb3=new JCheckBox("Kids Jeans @ 559 Rs");  
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
            amount+=199;  
            msg="Kids T-Shirts: 199\n";  
        }  
        if(cb2.isSelected()){  
            amount+=249;  
            msg+="Kids Shirt: 249\n";  
        }  
        if(cb3.isSelected()){  
            amount+=559;  
            msg+="Kids Jeans: 559\n";  
        }
        msg+="-----------------\n";  
        JOptionPane.showMessageDialog(this,msg+"Total: "+amount);  
    }  
    public static void main(String[] args) {  
        new KidsSection();  
    }  
}