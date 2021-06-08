import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Quiz_testsarpogam implements ActionListener{
	
		String[] Jautajumi = 	{
				"Jautajums",
				"Jautajums",
				"Jautajums",
				"Jautajums",
				"Jautajums",
				"Jautajums",
				"Jautajums",
				"Jautajums",
				"Jautajums",
				"Jautajums"
				
			};
		
		String[][] Atbildesizvele = 	{
				{"Atbildes"},
				{"Atbildes"},
				{"Atbildes"},
				{"Atbildes"},
				{"Atbildes"},
				{"Atbildes"},
				{"Atbildes"},
				{"Atbildes"},
				{"Atbildes"},
				{"Atbildes"},
			
			};
		
		char[] Atbildes = 		{
				'A',
				'B',
				'C',
				'D'
			};
		int sekundes = 20;
		int rezultats = 0;
		char atbilde;
		int index;
		int minejumi;
		int parminejumi;
		int KopJauSk = Jautajumi.length;
		
		JFrame frame = new JFrame();
		JTextField textfield = new JTextField();
		JTextArea textarea = new JTextArea();
		JButton PogaA = new JButton();
		JButton PogaB = new JButton();
		JButton PogaC = new JButton();
		JButton PogaD = new JButton();
		JLabel AtbildeA = new JLabel();
		JLabel AtbildeB = new JLabel();
		JLabel AtbildeC = new JLabel();
		JLabel AtbildeD = new JLabel();
		JLabel Laiks = new JLabel();
		JLabel AtlLaiks = new JLabel();
		JTextField Numurs = new JTextField();
		JTextField prc = new JTextField();

	public Quiz_testsarpogam(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,575);
		frame.getContentPane().setBackground(new Color(187,157,177));
		frame.setLayout(null);
		frame.setResizable(false);
		
		textfield.setBounds(0,0,600,50);
		textfield.setBackground(new Color(187,160,200));
		textfield.setForeground(new Color(255,255,255));
		textfield.setFont(new Font("Serif",Font.ITALIC,26));
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		textfield.setText("Text");
		
		textarea.setBounds(0,50,600,40);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(new Color(187,160,190));
		textarea.setForeground(new Color(255,255,255));
		textarea.setFont(new Font("Serif",Font.ITALIC,24));
		textarea.setBorder(BorderFactory.createBevelBorder(1));
		textarea.setEditable(false);
		textarea.setText("Jautajumi");
		
		PogaA.setBounds(0,100,100,100);
		PogaA.setFont(new Font("Serif",Font.ITALIC,50));
		PogaA.setBackground(new Color(187,160,190));
		PogaA.setForeground(new Color(255,255,255));
		PogaA.setBorder(BorderFactory.createBevelBorder(1));
		PogaA.setFocusable(false);
		PogaA.addActionListener(this);
		PogaA.setText("A");
		
		PogaB.setBounds(0,210,100,100);
		PogaB.setFont(new Font("Serif",Font.ITALIC,50));
		PogaB.setBackground(new Color(187,160,190));
		PogaB.setForeground(new Color(255,255,255));
		PogaB.setBorder(BorderFactory.createBevelBorder(1));
		PogaB.setFocusable(false);
		PogaB.addActionListener(this);
		PogaB.setText("B");
		
		PogaC.setBounds(0,320,100,100);
		PogaC.setFont(new Font("Serif",Font.ITALIC,50));
		PogaC.setBackground(new Color(187,160,190));
		PogaC.setForeground(new Color(255,255,255));
		PogaC.setBorder(BorderFactory.createBevelBorder(1));
		PogaC.setFocusable(false);
		PogaC.addActionListener(this);
		PogaC.setText("C");
		
		PogaD.setBounds(0,430,100,100);
		PogaD.setFont(new Font("Serif",Font.ITALIC,50));
		PogaD.setBackground(new Color(187,160,190));
		PogaD.setForeground(new Color(255,255,255));
		PogaD.setBorder(BorderFactory.createBevelBorder(1));
		PogaD.setFocusable(false);
		PogaD.addActionListener(this);
		PogaD.setText("D");
		
		
		
		frame.add(textfield);
		frame.add(textarea);
		frame.add(PogaA);
		frame.add(PogaB);
		frame.add(PogaC);
		frame.add(PogaD);
		frame.setVisible(true);
		
		
	}
	public void NakamajsJautajums() {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	public void Atbildes() {
		
	}
	public void Rezultats() {
		
	}
	

}
