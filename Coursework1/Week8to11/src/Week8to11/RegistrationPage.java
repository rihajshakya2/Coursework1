package Week8to11;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class RegistrationPage {
	public static void main(String[] args) {
		RegistrationPage sig= new RegistrationPage();

	}
	
	RegistrationPage(){
		JFrame sign= new JFrame("SignUp");
		
		JLabel lUsername, lPassword, lCPassword, jsign;
		JTextField tfUsername;
		JPasswordField pfPassword, pfCPassword;
		JButton btnSignUp, btnCancel;
		
	
		lUsername= new JLabel("Username");
		sign.add(lUsername);
		lUsername.setBounds(120, 150, 300, 30);
		lUsername.setFont(new Font("Arial", Font.BOLD,15));
		lUsername.setForeground(Color.WHITE);
		
		tfUsername= new JTextField(30);
		sign.add(tfUsername);
		tfUsername.setBounds(265, 150, 330, 30);
		
		
		
		lPassword= new JLabel("Password");
		sign.add(lPassword);
		lPassword.setBounds(120, 200, 300, 30);
		lPassword.setFont(new Font("Arial", Font.BOLD,15));
		lPassword.setForeground(Color.WHITE);
			
		pfPassword= new JPasswordField(30);
		sign.add(pfPassword);
		pfPassword.setBounds(265, 200, 330, 30);
		
		
		lCPassword= new JLabel("Confirm Password");
		sign.add(lCPassword);
		lCPassword.setBounds(120, 250, 300, 30);
		lCPassword.setFont(new Font("Arial", Font.BOLD,15));
		lCPassword.setForeground(Color.WHITE);
			
		pfCPassword= new JPasswordField(30);
		sign.add(pfCPassword);
		pfCPassword.setBounds(265, 250, 330, 30);
		
		
		btnSignUp = new JButton("Signup");
		sign.add(btnSignUp);
		btnSignUp.setBounds(265, 330, 140, 40);
		btnSignUp.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
		btnSignUp.setBackground(Color.cyan);
		
		btnCancel = new JButton("Cancel");
		sign.add(btnCancel);
		btnCancel.setBounds(450, 330, 140, 40);
		btnCancel.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
		btnCancel.setBackground(Color.red);
		
		
		btnCancel.addActionListener(e->{
			int select= JOptionPane.showConfirmDialog(btnCancel,"Are you sure?");
			if (select==0) {
				new LoginPage();
				sign.dispose();
			}
			
		});
		
		btnSignUp.addActionListener(e->{
			String username= tfUsername.getText();
			String password= pfPassword.getText();
			String cpassword= pfCPassword.getText();
			
			try {
				FileWriter myWriter= new FileWriter("Register.txt");
				myWriter.write(username+","+password+","+cpassword);
				myWriter.close();
				JOptionPane.showMessageDialog(btnSignUp, "Registered Successfully");
				System.out.println("Successfully wrote to the file.");
			}catch(IOException e1) {
				System.out.println("An error occured.");
				e1.printStackTrace();
			}
			new LoginPage();
			sign.dispose();		
		
			
		});
		
		ImageIcon background_image=new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Week8to11\\background1.jpg");
			
		Image img=background_image.getImage();
		Image temp_img=img.getScaledInstance(1500,800, Image.SCALE_SMOOTH);
		background_image=new ImageIcon(temp_img);
		JLabel background=new JLabel("", background_image,JLabel.CENTER);
		sign.add(background);
		
		JLabel jreg=new JLabel("SignUp");
		background.add(jreg);
		sign.setBounds(50, 10, 1500, 70);
		sign.setFont(new Font("Serif",Font.BOLD, 60));
		sign.setForeground(Color.cyan);
		 
		
		
		background.setBounds(0, 0, 1500, 800);
		
				
		sign.setLayout(null);
		sign.setSize(1000,600);
		sign.setVisible(true);
		sign.setLocationRelativeTo(null);
		sign.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
	}

}
