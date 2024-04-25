package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class METROTICKETBOOKING {

	private JFrame frame;
	private JTextField tb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					METROTICKETBOOKING window = new METROTICKETBOOKING();
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
	public METROTICKETBOOKING() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" METRO TICKET BOOKING APP");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(123, 11, 191, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 44, 55, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb = new JTextField();
		tb.setBounds(111, 41, 105, 20);
		frame.getContentPane().add(tb);
		tb.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("SOURCE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 75, 55, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "DILSUKHNAGAR", "LB NAGAR", "AMEERPET", "MGBS", "JBS"}));
		cb1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cb1.setBounds(111, 72, 105, 20);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_3 = new JLabel("DESTINATION");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setBounds(10, 106, 91, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "DILSUKHNAGAR", "LB NAGAR", "AMEERPET", "MGBS", "JBS"}));
		cb2.setBounds(111, 103, 105, 20);
		frame.getContentPane().add(cb2);
		
		JLabel lblNewLabel_4 = new JLabel("NO.OF TICKETS");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setBounds(10, 135, 91, 18);
		frame.getContentPane().add(lblNewLabel_4);
		
		JSpinner jsp = new JSpinner();
		jsp.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		jsp.setBounds(111, 134, 105, 21);
		frame.getContentPane().add(jsp);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb.getText();
				String s=(String) cb1.getSelectedItem();
				String d=(String) cb2.getSelectedItem();
				int nt=(int) jsp.getValue();
				int bill=0;
				if(s.equals(d))
				{
					JOptionPane.showMessageDialog(btnNewButton,"Please check the stations");
				}
				else
				{
					bill=bill+nt*45;
					JOptionPane.showMessageDialog(btnNewButton,"NAME:"+name+"\n SOURCE:"+s+"\n DESTINATION:"+d+"\n NUMBER OF TICKETS:"+nt+"\nAMOUNT:"+bill+"\n!!-----HAPPY JOURNEY------!!");
				}
			}
		});
		btnNewButton.setBounds(77, 180, 81, 25);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\m.jpg"));
		lblNewLabel_5.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
