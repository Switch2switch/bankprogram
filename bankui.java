package com.bank.bank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class bankui {
	int beforefunds = 0;
	private JFrame bankui;
	private JTextField txtCurrentBalance;
	private JTextField newmoney;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bankui window = new bankui();
					window.bankui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bankui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		bankui = new JFrame();
		bankui.setTitle("Bank UI");
		bankui.setBounds(100, 100, 450, 300);
		bankui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtCurrentBalance = new JTextField();
		txtCurrentBalance.setText("0");
		txtCurrentBalance.setEditable(false);
		bankui.getContentPane().add(txtCurrentBalance, BorderLayout.NORTH);
		txtCurrentBalance.setColumns(10);
		
		JButton addmoneybutton = new JButton("Add amount");
		
		addmoneybutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int newmoney = 0;
				
				int balance = Integer.parseInt(txtCurrentBalance.getText());
				
				
					//int oldbalance;
					//beforefunds = balance;
					newmoney = Integer.parseInt(bankui.this.newmoney.getText());
					System.out.println(newmoney);
					
					
					
					
					
					
					balance = newmoney + balance;
					txtCurrentBalance.setText(""+Integer.parseInt(bankui.this.txtCurrentBalance.getText()));
					System.out.println("Balance Updated! Current balance:" + balance);
					txtCurrentBalance.setText(""+balance);
					
					//transaction data
					System.out.println("Transaction completed!");
					System.out.println("Transaction Data");
					System.out.println("_____________________");
					System.out.println("transaction amount = " + newmoney);
					System.out.println("Reciver = " + System.getProperty("os.name"));
					System.out.println("Transaction Data -- Finished");
				
				
				
			
		}});
		bankui.getContentPane().add(addmoneybutton, BorderLayout.SOUTH);
		
		newmoney = new JTextField();
		bankui.getContentPane().add(newmoney, BorderLayout.WEST);
		newmoney.setColumns(10);
		
		
		
		
}}