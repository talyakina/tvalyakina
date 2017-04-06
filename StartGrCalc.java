import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class StartGrCalc {
	static JTextField northField;
	static JTextArea resultText;

	public static void main(String[] args) {
		JFrame myWindow = new JFrame("Калькулятор");
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setSize(300, 330);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout(5,1));
		myWindow.add(mainPanel);
		
		northField = new JTextField();
		northField.setPreferredSize(new Dimension(100,50));
		mainPanel.add(northField, BorderLayout.NORTH);
		
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new GridLayout(6,3));
		mainPanel.add(topPanel, BorderLayout.CENTER);
		
		
		
		JButton but1 = new JButton("1");
		JButton but2 = new JButton("2");
		JButton but3 = new JButton("3");
		JButton but4 = new JButton("4");
		JButton but5 = new JButton("5");
		JButton but6 = new JButton("6");
		JButton but7 = new JButton("7");
		JButton but8 = new JButton("8");
		JButton but9 = new JButton("9");
		JButton but0 = new JButton("0");
		JButton butM = new JButton("*");
		JButton butAd = new JButton("+");
		JButton butSub = new JButton(" -");
		JButton butDiv = new JButton("/");
		JButton butRes = new JButton("=");
		JButton butDel = new JButton("C");
		JButton butDelAl = new JButton("CE");
		JButton butTEST = new JButton(".");
		
		JPanel southPanel = new JPanel();
		resultText = new JTextArea("Результат");
		resultText.setPreferredSize(new Dimension(100, 50));											
		resultText.setEditable(false);
		mainPanel.add(resultText, BorderLayout.SOUTH);
		
		topPanel.add(but1);
		topPanel.add(but2);
		topPanel.add(but3);
		topPanel.add(but4);
		topPanel.add(but5);
		topPanel.add(but6);
		topPanel.add(but7);
		topPanel.add(but8);
		topPanel.add(but9);
		topPanel.add(butM);
		topPanel.add(but0);
		topPanel.add(butAd);
		topPanel.add(butSub);
		topPanel.add(butDiv);
		topPanel.add(butRes);
		topPanel.add(butDel);
		topPanel.add(butDelAl);
		topPanel.add(butTEST);
		
		myWindow.setVisible(true);
		
		butRes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	try{
            		String exp = northField.getText(); 
            		Calculator Calculator = new Calculator(exp);
                	int result = Calculator.calculate();
                	resultText.setText(String.valueOf(result));
                
            	}catch(Exception ex){
            		
            	}
            	
            }
		}); 
		but1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {            	
            	String s = northField.getText();
            	northField.setText(s+'1');            	
            }
		});
		butTEST.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {            	
            	String s = northField.getText();
            	northField.setText(s+'.');            	
            }
		});
		butDelAl.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {            	        
            	northField.setText("");
            }
		});
		butDel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {            	
            	String s = northField.getText();
            	s = s.substring(0, s.length()-1);
            	northField.setText(s);
            }
		});
		but2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {            	
            	String s = northField.getText();
            	northField.setText(s+'2');
            }
		});
		but3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {            	
            	String s = northField.getText();
            	northField.setText(s+'3');
            }
		});but4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String s = northField.getText();
            	northField.setText(s+'4');
            }
		});but5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {            	 
            	String s = northField.getText();
            	northField.setText(s+'5');
            }
		});but6.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {            	 
            	String s = northField.getText();
            	northField.setText(s+'6');
            }
		});but7.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
            	 
            	String s = northField.getText();
            	northField.setText(s+'7');
            }
		});but8.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {            	 
            	String s = northField.getText();
            	northField.setText(s+'8');
            }
		});but9.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {            	 
            	String s = northField.getText();
            	northField.setText(s+'9');
            }
		});but0.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {            	 
            	String s = northField.getText();
            	northField.setText(s+'0');
            }
		});butM.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {            	 
            	String s = northField.getText();
            	northField.setText(s+'*');
            }
		});butAd.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {            	 
            	String s = northField.getText();
            	northField.setText(s+'+');
            }
		});
		butSub.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {            	 
            	String s = northField.getText();
            	northField.setText(s+'-');
            }
		});butDiv.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {            	 
            	String s = northField.getText();
            	northField.setText(s+'/');
            }
		});
	}}