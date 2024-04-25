package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class STUDENTREGFORM {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					STUDENTREGFORM window = new STUDENTREGFORM();
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
	public STUDENTREGFORM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REG FORM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(134, 21, 178, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ROLL NUMBER");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(30, 65, 99, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(119, 65, 126, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(40, 96, 71, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb2 = new JTextField();
		tb2.setBounds(119, 96, 126, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(32, 129, 53, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox ctb1 = new JComboBox();
		ctb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "CS", "DS", "IOT", "AIML", "ECE", "EEE"}));
		ctb1.setBounds(119, 125, 128, 20);
		frame.getContentPane().add(ctb1);
		
		JLabel lblNewLabel_4 = new JLabel("GENDER");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(32, 154, 57, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton r1 = new JRadioButton("male");
		r1.setBounds(119, 152, 80, 20);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("female");
		r2.setBounds(201, 153, 85, 18);
		frame.getContentPane().add(r2);
		
		JLabel lblNewLabel_5 = new JLabel("PROG LANG");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(30, 179, 75, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JCheckBox cb1 = new JCheckBox("C");
		cb1.setBounds(300, 176, 43, 20);
		frame.getContentPane().add(cb1);
		
		JCheckBox cb2 = new JCheckBox("JAVA");
		cb2.setBounds(119, 179, 75, 14);
		frame.getContentPane().add(cb2);
		
		JCheckBox cb3 = new JCheckBox("PYTHON");
		cb3.setBounds(196, 174, 90, 20);
		frame.getContentPane().add(cb3);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String roll=tb1.getText();
				String name=tb2.getText();
				String branch=(String) ctb1.getSelectedItem();
				String gender=" ";
				String langs= "";
				if(r1.isSelected())
				{
					gender="male";
				}
				if(r2.isSelected())
				{
					gender="female";
				}
				if(cb1.isSelected())
				{
					langs=langs+"C";
				}
				if(cb2.isSelected())
				{
					langs=langs+"JAVA";
				}
				if(cb3.isSelected())
				{
					langs=langs+"PYTHON";
				}
				JOptionPane.showMessageDialog(btnNewButton, "ROLL:"+roll+"\n NAME:"+name+"\n BRANCH:"+branch+"\n GENDER:"+gender+"\n PROG LANG:"+langs);
			}
		});
		btnNewButton.setBounds(97, 212, 97, 20);
		frame.getContentPane().add(btnNewButton);
	}
}
