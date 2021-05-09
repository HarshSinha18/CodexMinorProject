package Codex;
import javax.swing.*;  
import java.awt.event.*;  
public class LadiesSection extends JFrame implements ActionListener{  
    JLabel i1;  
    JCheckBox cb1,cb2,cb3 ; 
    JButton b;  
    LadiesSection(){  
    	JTextField t1 = new 	JTextField("<Ladies  Section/>");
    	t1.setBounds(50 , 30 , 200 , 20);
        i1=new JLabel("What do you want to Order ? ");  
        i1.setBounds(50,50,300,20);  
        cb1=new JCheckBox("Yellow Sharii @ 330 Rs");  
        cb1.setBounds(100,100,180,20);  
        cb2=new JCheckBox("Blue Sharii @ 499 Rs");  
        cb2.setBounds(100,150,180,20);  
        cb3=new JCheckBox("Green Sharii @ 560");  
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
            amount+=330;  
            msg="	Yellow Sharii: 330\n";  
        }  
        if(cb2.isSelected()){  
            amount+=499;  
            msg+="Blue Sharii: 499\n";  
        }  
        if(cb3.isSelected()){  
            amount+=560;  
            msg+="Green Sharii: 560\n";  
        }
        msg+="-----------------\n";  
        JOptionPane.showMessageDialog(this,msg+"Total: "+amount);  
    }  
    public static void main(String[] args) {  
        
    }  
}