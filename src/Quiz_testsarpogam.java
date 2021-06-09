import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Quiz_testsarpogam implements ActionListener{
	
		String[] Jautajumi = 	{
				"Jautajums1",
				"Jautajums2",
				"Jautajums3",
				"Jautajums4",
				"Jautajums5"
				
				
			};
		
		String[][] Atbildesizvele = 	{
				{"ATB","ATB","ATB","ATB"},
				{"ATB","ATB","ATB","ATB"},
				{"ATB","ATB","ATB","ATB"},
				{"ATB","ATB","ATB","ATB"},
				{"ATB","ATB","ATB","ATB"}
			
			
			};
		
		char[] Atbildes = 		{
				'A',
				'B',
				'C',
				'D',
				'D'
			};
		int sekundes = 15;
		int rezultats;
		char atbilde;
		int index;
		int izvele;
		int parizvele=0;
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
		JLabel LogsLaiks = new JLabel();
		JLabel AtlLaiks = new JLabel();
		JTextField Numurs = new JTextField();
		JTextField prc = new JTextField();
		
		Timer timer = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sekundes--;
				AtlLaiks.setText(String.valueOf(sekundes));
				if(sekundes<=0) {
					AtbildesLoga();
				}
				}
			});
		
		

	public Quiz_testsarpogam(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,575);
		frame.getContentPane().setBackground(new Color(187,157,177));
		frame.setLayout(null);
		frame.setResizable(false);
		
		textfield.setBounds(0,0,600,50);
		textfield.setBackground(new Color(187,160,200));
		textfield.setForeground(new Color(50,50,3));
		textfield.setFont(new Font("Serif",Font.ITALIC,26));
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		
		
		textarea.setBounds(0,50,600,40);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(new Color(187,160,190));
		textarea.setForeground(new Color(255,255,255));
		textarea.setFont(new Font("Serif",Font.ITALIC,24));
		textarea.setBorder(BorderFactory.createBevelBorder(1));
		textarea.setEditable(false);
		
		
		PogaA.setBounds(0,100,100,100);
		PogaA.setFont(new Font("Serif",Font.ITALIC,50));
		PogaA.setBackground(new Color(187,160,190));
		PogaA.setForeground(new Color(50,50,3));
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
		PogaC.setForeground(new Color(50,50,3));
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
		
		AtbildeA.setBounds(110,100,300,100);
		AtbildeA.setBackground(new Color(187,160,190));
		AtbildeA.setForeground(new Color(255,255,255));
		AtbildeA.setFont(new Font("Serif",Font.ITALIC,30));
		
		
		AtbildeB.setBounds(110,210,300,100);
		AtbildeB.setBackground(new Color(187,160,190));
		AtbildeB.setForeground(new Color(50,50,3));
		AtbildeB.setFont(new Font("Serif",Font.ITALIC,30));
		
		
		AtbildeC.setBounds(110,320,300,100);
		AtbildeC.setBackground(new Color(187,160,190));
		AtbildeC.setForeground(new Color(255,255,255));
		AtbildeC.setFont(new Font("Serif",Font.ITALIC,30));
		
		
		AtbildeD.setBounds(110,430,300,100);
		AtbildeD.setBackground(new Color(187,160,190));
		AtbildeD.setForeground(new Color(50,50,3));
		AtbildeD.setFont(new Font("Serif",Font.ITALIC,30));
		
		
		
		AtlLaiks.setBounds(552,95,30,30);
		AtlLaiks.setBackground(new Color(255,255,255));
		AtlLaiks.setForeground(new Color(50,50,3));
		AtlLaiks.setFont(new Font("Serif",Font.ITALIC,15));
		AtlLaiks.setBorder(BorderFactory.createBevelBorder(1));
		AtlLaiks.setOpaque(true);
		AtlLaiks.setHorizontalAlignment(JTextField.CENTER);
		AtlLaiks.setText(String.valueOf(sekundes));
		LogsLaiks.setBounds(449,102,100,15);
		LogsLaiks.setBackground(new Color(187,157,177));
		LogsLaiks.setForeground(new Color(50,50,3));
		LogsLaiks.setFont(new Font("Serif",Font.ITALIC,15));
		LogsLaiks.setHorizontalAlignment(JTextField.LEFT);
		LogsLaiks.setBorder(BorderFactory.createBevelBorder(4));
		LogsLaiks.setText("Atlikuis laiks:");
		
		
		Numurs.setBounds(0,90,585,200);
		Numurs.setBackground(new Color(255,255,255));
		Numurs.setForeground(new Color(50,50,3));
		Numurs.setFont(new Font("Serif",Font.ITALIC,30));
		Numurs.setBorder(BorderFactory.createBevelBorder(1));
		Numurs.setHorizontalAlignment(JTextField.CENTER);
		Numurs.setEditable(false);
		prc.setBounds(0,290,585,300);
		prc.setBackground(new Color(255,255,255));
		prc.setForeground(new Color(50,50,3));
		prc.setFont(new Font("Serif",Font.ITALIC,30));
		prc.setBorder(BorderFactory.createBevelBorder(1));
		prc.setHorizontalAlignment(JTextField.CENTER);
		prc.setEditable(false);
		
		
		frame.add(textfield);
		frame.add(textarea);
		frame.add(PogaA);
		frame.add(PogaB);
		frame.add(PogaC);
		frame.add(PogaD);
		frame.add(AtbildeB);
		frame.add(AtbildeA);
		frame.add(AtbildeC);
		frame.add(AtbildeD);
		frame.add(LogsLaiks);
		frame.add(AtlLaiks);
		frame.setVisible(true);
		
		NakamajsJautajums();
		
		
	}
	public void NakamajsJautajums() {
		
		if(index>=KopJauSk) {
			Rezultats();
		}
		else {
			textfield.setText("	JAUTAJUMS: "+(index+1));
			textarea.setText(Jautajumi[index]);
			AtbildeA.setText(Atbildesizvele[index][0]);
			AtbildeB.setText(Atbildesizvele[index][1]);
			AtbildeC.setText(Atbildesizvele[index][2]);
			AtbildeD.setText(Atbildesizvele[index][3]);
			timer.start();
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		PogaA.setEnabled(false);
		PogaB.setEnabled(false);
		PogaC.setEnabled(false);
		PogaD.setEnabled(false);
		
		if(e.getSource()==PogaA) {
			atbilde='A';
			if(atbilde == Atbildes[index]) {
				AtbildeA.setForeground(new Color(0,255,255));
				parizvele++;
			}
		}
		if(e.getSource()==PogaB) {
			atbilde= 'B';
			if(atbilde == Atbildes[index]) {
				AtbildeB.setForeground(new Color(0,255,255));
				parizvele++;
			}
		}
		if(e.getSource()==PogaC) {
			atbilde= 'C';
			if(atbilde == Atbildes[index]) {
				AtbildeC.setForeground(new Color(0,255,255));
				parizvele++;
			}
		}
		if(e.getSource()==PogaD) {
			atbilde= 'D';
			if(atbilde == Atbildes[index]) {
				AtbildeD.setForeground(new Color(0,255,255));
				parizvele++;
			}
		}
		AtbildesLoga();
		
	}
	public void AtbildesLoga() {
		timer.stop();
		PogaA.setEnabled(false);
		PogaB.setEnabled(false);
		PogaC.setEnabled(false);
		PogaD.setEnabled(false);

		if(Atbildes[index] != 'A')
			AtbildeA.setForeground(new Color(0,0,128));
		if(Atbildes[index] != 'B')
			AtbildeB.setForeground(new Color(0,0,128));
		if(Atbildes[index] != 'C')
			AtbildeC.setForeground(new Color(0,0,128));
		if(Atbildes[index] != 'D')
			AtbildeD.setForeground(new Color(0,0,128));
		
		Timer pause = new Timer(1000,new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				AtbildeA.setForeground(new Color(50,50,3));
				AtbildeB.setForeground(new Color(255,255,255));
				AtbildeC.setForeground(new Color(50,50,3));
				AtbildeD.setForeground(new Color(255,255,255));
					
					atbilde = ' ';
					sekundes=15;
					AtlLaiks.setText(String.valueOf(sekundes));
					PogaA.setEnabled(true);
					PogaB.setEnabled(true);
					PogaC.setEnabled(true);
					PogaD.setEnabled(true);
					index++;
					NakamajsJautajums();
				}
			});
		pause.setRepeats(false);
		pause.start();
		
	}
	public void Rezultats() {
		PogaA.setEnabled(false);
		PogaB.setEnabled(false);
		PogaC.setEnabled(false);
		PogaD.setEnabled(false);

		rezultats = (int)((parizvele/(double)KopJauSk)*100);

		textfield.setText("Rezultats!");
		textarea.setText("");
		AtbildeA.setText("");
		AtbildeB.setText("");
		AtbildeC.setText("");
		AtbildeD.setText("");
	

		Numurs.setText("("+parizvele+"/"+KopJauSk+")");
		prc.setText(rezultats+"%");

		frame.add(Numurs);
		frame.add(prc);
	

	}
}
