package Week8to11;

import java.awt.Color;

import javax.swing.*;   

public class Connect {
	public static void main(String[] args) {
        Connection log = new Connection();
        
    }
}



class Connection{
	Connection(){

	JFrame f = new JFrame("ComboBox Example");  
	JComboBox cb,cb2;
	JButton btnConnect ;
	
	
    String country[]={"India","Aus","U.S.A","England","Newzealand"};        
    cb=new JComboBox(country);    
    cb.setBounds(50, 50,90,20);    
    f.add(cb); 
    
    String country2[]={"India","Aus","U.S.A","England","Newzealand"};        
    cb2=new JComboBox(country);    
    cb2.setBounds(50, 100,90,20);    
    f.add(cb2); 
    
    
    btnConnect = new JButton("Connect");
    f.add(btnConnect);
    btnConnect.setBounds(50,150,100,40);
    btnConnect.setBackground(Color.green);
    
    
    
    
    
    
   
    
    
    
    
    
    f.setLayout(null);    
	f.setSize(400,500);    
	f.setVisible(true);  
     

 
}
}
	
