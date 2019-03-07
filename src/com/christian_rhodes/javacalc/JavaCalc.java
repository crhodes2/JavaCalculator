package com.christian_rhodes.javacalc;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class JavaCalc 
{
	private static Scanner scanner = new Scanner(System.in);
	static String input = null;
	private JFrame aFrame = new JFrame(input);
	private JTextArea calcScreen = new JTextArea();
	
	//Calculation Variables
	String strNum1 = "";
	String strNum2 = "";
	String[] statement;
	int num1 = 0;
	int num2 = 0;
	String strTotal = null;
	int Total = 0;
	

	private JButton btn0 = new JButton("0");
	private JButton btn1 = new JButton("1");
	private JButton btn2 = new JButton("2");
	private JButton btn3 = new JButton("3");
	private JButton btn4 = new JButton("4");
	private JButton btn5 = new JButton("5");
	private JButton btn6 = new JButton("6");
	private JButton btn7 = new JButton("7");
	private JButton btn8 = new JButton("8");
	private JButton btn9 = new JButton("9");
	
	private JButton addBtn = new JButton("+");
	private JButton subBtn = new JButton("-");
	private JButton mulBtn = new JButton("*");
	private JButton divBtn = new JButton("/");
	private JButton equBtn = new JButton("=");
	
	
	private JavaCalc()
	{
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aFrame.setVisible(true);
		aFrame.setSize(400,550);
		aFrame.setResizable(false);
		aFrame.setLayout(null);
		
		calcScreen.setSize(380,150);
		calcScreen.setLocation(7, 5);
		calcScreen.setEditable(false);

		// ZERO POSITION
		btn0.setSize(100, 50);
		btn0.setLocation  (120, 460);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcScreen.append("0");
			}
		});
		
		// ONE POSITION
		btn1.setSize(100, 50);
		btn1.setLocation  (20, 395);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcScreen.append("1");
			}
		});

		// TWO POSITION
		btn2.setSize(100, 50);
		btn2.setLocation  (120, 395);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcScreen.append("2");
			}
		});

		// THREE POSITION
		btn3.setSize(100, 50);
		btn3.setLocation  (220, 395);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcScreen.append("3");
			}
		});
		
		// FOUR POSITION
		btn4.setSize(100, 50);
		btn4.setLocation  (20, 325);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcScreen.append("4");
			}
		});
		
		// FIVE POSITION
		btn5.setSize(100, 50);
		btn5.setLocation  (120, 325);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcScreen.append("5");
			}
		});
		
		// SIX POSITION
		btn6.setSize(100, 50);
		btn6.setLocation  (220, 325);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcScreen.append("6");
			}
		});
		
		// SEVEN POSITION
		btn7.setSize(100, 50);
		btn7.setLocation  (20, 255);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcScreen.append("7");
			}
		});
		
		// EIGHT POSITION
		btn8.setSize(100, 50);
		btn8.setLocation  (120, 255);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcScreen.append("8");
			}
		});
		
		// NINE POSITION
		btn9.setSize(100, 50);
		btn9.setLocation  (220, 255);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcScreen.append("9");
			}
		});
		
		// ADD POSITION
		addBtn.setSize(50, 50);
		addBtn.setLocation  (330, 195);
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcScreen.append("+");
			}
		});

		// SUBTRACT POSITION
		subBtn.setSize(50, 50);
		subBtn.setLocation  (330, 270);
		subBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcScreen.append("-");
			}
		});
		
		// MULTIPLY POSITION
		mulBtn.setSize(50, 50);
		mulBtn.setLocation  (330, 345);
		mulBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcScreen.append("*");
			}
		});
		
		// DIVIDE POSITION
		divBtn.setSize(50, 50);
		divBtn.setLocation  (330, 420);
		divBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcScreen.append("/");
			}
		});
		
		// EQUAL POSITION
		equBtn.setSize(50, 50);
		equBtn.setLocation  (270, 460);
		equBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if(calcScreen.getText().contains("+")) 
				{
					statement = calcScreen.getText().split("\\+");
					
					strNum1 = statement[0];
					strNum2 = statement[1];
					
					num1 = Integer.parseInt(strNum1);
					num2 = Integer.parseInt(strNum2);
					
					Total = num1 + num2;
					strTotal = Integer.toString(Total);
					calcScreen.setText(strTotal);
				}
				else if(calcScreen.getText().contains("-")) 
				{
					statement = calcScreen.getText().split("\\-");
					
					strNum1 = statement[0];
					strNum2 = statement[1];
					
					num1 = Integer.parseInt(strNum1);
					num2 = Integer.parseInt(strNum2);
					
					Total = num1 - num2;
					strTotal = Integer.toString(Total);
					calcScreen.setText(strTotal);
				}
				else if(calcScreen.getText().contains("*")) 
				{
					statement = calcScreen.getText().split("\\*");
					
					strNum1 = statement[0];
					strNum2 = statement[1];
					
					num1 = Integer.parseInt(strNum1);
					num2 = Integer.parseInt(strNum2);
					
					Total = num1 * num2;
					strTotal = Integer.toString(Total);
					calcScreen.setText(strTotal);
				}
				
				else if(calcScreen.getText().contains("/")) 
				{
					statement = calcScreen.getText().split("\\/");
					
					strNum1 = statement[0];
					strNum2 = statement[1];
					
					num1 = Integer.parseInt(strNum1);
					num2 = Integer.parseInt(strNum2);
					
					Total = num1 / num2;
					strTotal = Integer.toString(Total);
					calcScreen.setText(strTotal);
				}
			}
		});
		
		aFrame.add(calcScreen);
		aFrame.add(btn0);
		aFrame.add(btn1);
		aFrame.add(btn2);
		aFrame.add(btn3);
		aFrame.add(btn4);
		aFrame.add(btn5);
		aFrame.add(btn6);
		aFrame.add(btn7);
		aFrame.add(btn8);
		aFrame.add(btn9);
		
		aFrame.add(addBtn);
		aFrame.add(subBtn);
		aFrame.add(mulBtn);
		aFrame.add(divBtn);
		aFrame.add(equBtn);
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("Type the name of your calculator...");
		input = scanner.nextLine();	
		new JavaCalc();
		
		System.out.println("Welcome to your " + input + " calculator.");
		System.out.println("BUGGY NOTE: The calculator's buttons are not shown initially. Please hover\n            mouse around Java program to make them appear. Thank you.");
		System.out.println("");
		
	}

}

