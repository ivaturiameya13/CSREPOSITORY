package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LOGINPAGE {

	private JFrame frame;
	private JTextField tb1;
	private JTextField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGINPAGE window = new LOGINPAGE();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LOGINPAGE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(135, 72, 75, 20);
		frame.getContentPane().add(lblNewLabel);
		
		tb1 = new JTextField();
		tb1.setBounds(220, 72, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(135, 103, 65, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		p1 = new JTextField();
		p1.setBounds(220, 103, 86, 20);
		frame.getContentPane().add(p1);
		p1.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String pwd=p1.getText();
                if(name.equals("ameya") && pwd.equals("12345"))
                {
                	JOptionPane.showMessageDialog(btnNewButton, "valid user");
                }
                else
                {
                	JOptionPane.showMessageDialog(btnNewButton, "invalid user");
                }
			}
		});
		btnNewButton.setBounds(179, 136, 75, 20);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN PAGE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setLabelFor(frame);
		lblNewLabel_2.setBounds(176, 11, 78, 20);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
