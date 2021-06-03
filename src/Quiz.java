import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Quiz implements ActionListener{
	
	String[] jautajums = {
			"Kura metode atgriež simbolu virknes garumu vardam",
			"Kura metode izmanto, lai salīdzinātu divas simbolu virknes vards1 un vards2?"
	};
	
	String [][] izvele = {
			{
			 "toUpperCase",
			 "vards.substring(0,3)",
			 "vards.length()",
			 "vards.split()"		
			}
			
	};
	
	int[] atbildi = {
			1,
			2,
			3,
			4
	};
	
	char jaut;
	int atb;
	int pareizaatbilde = 0;
	int cipars;
	int musujautajums = jautajums.length;
	int rezultats;
	int taimeris = 15;
	
	JFrame frame = new JFrame();
	JTextField textfield = new JTextField();
	JTextField ciparsL = new JTextField();
	JTextField procents = new JTextField();
	JTextArea textarea = new JTextArea();
	JButton poga1 = new JButton();
	JButton poga2 = new JButton();
	JButton poga3 = new JButton();
	JButton poga4 = new JButton();
	JLabel atbilde1 = new JLabel();
	JLabel atbilde2 = new JLabel();
	JLabel atbilde3 = new JLabel();
	JLabel atbilde4 = new JLabel();
	JLabel laiks = new JLabel();
	JLabel atllaiks = new JLabel();
	
	
	public Quiz() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.setVisible(true);
	}
	public void Jautajums() {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	public void Atbildes() {
		
	}
	
	public void Rezultats() {
		
	}

}
