package calc;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.apache.log4j.Logger;

public class StartGrCalcLog {

	static JTextField northField;
	static JTextArea resultText;

	public static void main(String[] args) throws IOException {

		String path = new File("").getAbsolutePath();//указывается путь, где лежат файлы (в src)
		File file = new File(path + "\\ENTER.txt");//создали файл с именем

		FileWriter writer = new FileWriter(path + "\\ENTER.txt");
		String text = "LP";
		writer.write(text);//записали в первый файл
		writer.flush();//для перезаписи
		writer.close();//закрываем потом 
		System.out.println("Enter the login");
		Scanner sc = new Scanner(System.in);
		String enter = sc.nextLine();
		sc.close();
		String path2 = new File("").getAbsolutePath();
		File file2 = new File(path2 + "\\ENTERUSER.txt");
		FileWriter writer1 = new FileWriter(path2 + "\\ENTERUSER.txt");
		writer1.write(enter);//записали во второй файл
		writer1.flush();
		writer1.close();
		  
		BufferedReader reader = new BufferedReader(new FileReader(path + "\\ENTER.txt"));// поток для чтения   
        String s = " ";
        while (s != null) {
            s = reader.readLine();
          
        }
               BufferedReader reader2 = new BufferedReader(new FileReader(path2 + "\\ENTERUSER.txt"));    
        String s2= " ";
       while (s2 != null) {
            s2 = reader.readLine();
       }      
      		if (s.equals(s2)) {//Нужно сравнить не объекты, а значения-поэтому метод equals. 
      							//НО НЕ работает,не разобралась почему.

			final Logger log = Logger.getLogger(StartGrCalcLog.class);
			JFrame myWindow = new JFrame("Калькулятор");
			myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			myWindow.setSize(300, 330);

			JPanel mainPanel = new JPanel();
			mainPanel.setLayout(new BorderLayout(5, 1));
			myWindow.add(mainPanel);

			northField = new JTextField();
			northField.setPreferredSize(new Dimension(100, 50));
			mainPanel.add(northField, BorderLayout.NORTH);

			JPanel topPanel = new JPanel();
			topPanel.setLayout(new GridLayout(6, 3));
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

			myWindow.setVisible(true);

			butRes.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					try {
						String exp = northField.getText();
						Calculator calc = new Calculator(exp, log);
						int result = calc.calculate();
						resultText.setText(String.valueOf(result));

					} catch (Exception ex) {
						log.error(ex.getMessage());
						log.error("Error Stack Trace:\n" + ex.getStackTrace());
					}

				}
			});
			but1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = northField.getText();
					northField.setText(s + '1');
					log.info("Button1 has been pushed. Result=" + s + '1');
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
					s = s.substring(0, s.length() - 1);
					northField.setText(s);
				}
			});
			but2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = northField.getText();
					northField.setText(s + '2');
					log.info("Button1 has been pushed. Result=" + s + '2');
				}
			});
			but3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = northField.getText();
					northField.setText(s + '3');
					log.info("Button1 has been pushed. Result=" + s + '3');
				}
			});
			but4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = northField.getText();
					northField.setText(s + '4');
					log.info("Button1 has been pushed. Result=" + s + '4');
				}
			});
			but5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = northField.getText();
					northField.setText(s + '5');
					log.info("Button1 has been pushed. Result=" + s + '5');
				}
			});
			but6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = northField.getText();
					northField.setText(s + '6');
					log.info("Button1 has been pushed. Result=" + s + '6');
				}
			});
			but7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					String s = northField.getText();
					northField.setText(s + '7');
					log.info("Button1 has been pushed. Result=" + s + '7');
				}
			});
			but8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = northField.getText();
					northField.setText(s + '8');
					log.info("Button1 has been pushed. Result=" + s + '8');
				}
			});
			but9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = northField.getText();
					northField.setText(s + '9');
					log.info("Button1 has been pushed. Result=" + s + '9');
				}
			});
			but0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = northField.getText();
					northField.setText(s + '0');
					log.info("Button1 has been pushed. Result=" + s + '0');
				}
			});
			butM.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = northField.getText();
					northField.setText(s + '*');
				}
			});
			butAd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = northField.getText();
					northField.setText(s + '+');
				}
			});
			butSub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = northField.getText();
					northField.setText(s + '-');
				}
			});
			butDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = northField.getText();
					northField.setText(s + '/');
				}
			});
		} else {
			System.out.println("Invalid password");
		}

	}
}

	
