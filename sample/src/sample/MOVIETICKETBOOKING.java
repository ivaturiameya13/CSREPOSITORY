package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MOVIETICKETBOOKING {

	protected static final int YES_OPTION = 0;
	private JFrame frame;
	private JTextField tb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MOVIETICKETBOOKING window = new MOVIETICKETBOOKING();
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
	public MOVIETICKETBOOKING() {
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
		
		JLabel lblNewLabel = new JLabel("MOVIE TICKET BOOKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(152, 11, 143, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(21, 51, 87, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb = new JTextField();
		tb.setBounds(118, 43, 148, 29);
		frame.getContentPane().add(tb);
		tb.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE NAME");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 87, 98, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "RRR", "KGF", "SALAAR"}));
		cb1.setBounds(118, 83, 148, 29);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_3 = new JLabel("NO.OF TICKECTS");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 127, 98, 21);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "01", "02", "03", "04", "05"}));
		cb2.setBounds(118, 123, 148, 29);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb.getText();
				String movie=(String) cb1.getSelectedItem();
				String tickets=(String) cb2.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				int bill=0;
				if(movie.equals("RRR"))
				{
					bill=bill+nt*150;
				}
				if(movie.equals("KGF"))
				{
					bill=bill+nt*250;
				}
				if(movie.equals("SALAAR"))
				{
					bill=bill+nt*350;
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton,"NAME:"+name+"\n MOVIE NAME:"+movie+"\n NO.OF TICKETS:"+nt);
				if(res==YES_OPTION)
				{
					JOptionPane.showMessageDialog(btnNewButton, "BOOKING CONFIRMED");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "BOOKING CANCELLED");
				}
			}
		});
		btnNewButton.setBounds(82, 186, 87, 21);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\bhuvi\\moviepic.png"));
		lblNewLabel_4.setBounds(-10, 0, 444, 261);
		frame.getContentPane().add(lblNewLabel_4);
	}

}
