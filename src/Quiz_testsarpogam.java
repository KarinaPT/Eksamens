import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Quiz_testsarpogam implements ActionListener{
	
		String[] Jautajumi = 	{
				"Kāda būs mainīgā \"c\" vērtības pēc dotā programmas fragmenta izpildes? \n String a = \"900\" \n String b = \"100\" \n String c; \n c= b+a\"",
				"Kura metode nosaka garumu (Simbolu skaitu virknē)?",
				"Ko dara metode - toUpperCase();",
				"Metodē - chatAt(); indeksa numurs sākas no: ",
				"Kura metode salīdzina simbolu virknes?",
				"Kāda būs mainīgā \"c\" vērtības pēc dotā programmas fragmenta izpildes? \n String a = \"eksamens\" \n String b; \n b=a.substring(1,3)",
				
				
			};
		
		String[][] Atbildesizvele = 	{
				{"1000","900100","100900","910"},
				{"length();","concat();","contains();","equals();"},
				{"Maina visus burtus uz mazajiem",
				 "Maina visus burtus uz lielajiem",
				 "Salīdzina simbolu virknes",
				 "Šī metode nav"},
				{"1","2","0","1,5"},
				{"concat();","charAt();","split();","equals();"},
				{"eks","ks","ksa","eksa"}
			
			
			};
		
		char[] Atbildes = 		{
				'B',
				'A',
				'B',
				'C',
				'D',
				'B'
			};
		int sekundes = 15;
		char atbilde;
		int index;
		int izvele;
		int parizvele=0;
		int kopJauSk = Jautajumi.length;
		
		JFrame frame = new JFrame();
		JTextField textfield = new JTextField();
		JTextField numurs = new JTextField();
		JTextField prc = new JTextField();
		JTextField beigas = new JTextField();
		JTextArea textarea = new JTextArea();
		JButton pogaA = new JButton();
		JButton pogaB = new JButton();
		JButton pogaC = new JButton();
		JButton pogaD = new JButton();
		JButton nepareizieRezultati = new JButton();
		JLabel atbildeA = new JLabel();
		JLabel atbildeB = new JLabel();
		JLabel atbildeC = new JLabel();
		JLabel atbildeD = new JLabel();
		JLabel logsLaiks = new JLabel();
		JLabel atlLaiks = new JLabel();
		
		
		Timer timer = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sekundes--;
				atlLaiks.setText(String.valueOf(sekundes));
				if(sekundes<=0) {
					AtbildesLoga();
				}
				}
			});
		
		

	public Quiz_testsarpogam(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(750,830);
		frame.getContentPane().setBackground(new Color(187,157,177));
		frame.setLayout(null);
		frame.setResizable(false);
		
		textfield.setBounds(0,0,750,50);
		textfield.setBackground(new Color(187,160,200));
		textfield.setForeground(new Color(50,50,3));
		textfield.setFont(new Font("Serif",Font.ITALIC,26));
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		
		beigas.setBounds(0,50,750,50);
		beigas.setBackground(new Color(187,160,190));
		beigas.setForeground(new Color(255,255,255));
		beigas.setFont(new Font("Serif",Font.ITALIC,26));
		beigas.setBorder(BorderFactory.createBevelBorder(1));
		beigas.setHorizontalAlignment(JTextField.CENTER);
		beigas.setEditable(false);
			
		textarea.setBounds(0,50,750,250);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(new Color(187,160,190));
		textarea.setForeground(new Color(255,255,255));
		textarea.setFont(new Font("Serif, Bolt",Font.ITALIC,24));
		textarea.setBorder(BorderFactory.createBevelBorder(1));
		textarea.setEditable(false);
		
			
		pogaA.setBounds(0,310,100,100);
		pogaA.setFont(new Font("Serif",Font.ITALIC,50));
		pogaA.setBackground(new Color(187,160,190));
		pogaA.setForeground(new Color(50,50,3));
		pogaA.setBorder(BorderFactory.createBevelBorder(1));
		pogaA.setFocusable(false);
		pogaA.addActionListener(this);
		pogaA.setText("A");
		
		pogaB.setBounds(0,420,100,100);
		pogaB.setFont(new Font("Serif",Font.ITALIC,50));
		pogaB.setBackground(new Color(187,160,190));
		pogaB.setForeground(new Color(255,255,255));
		pogaB.setBorder(BorderFactory.createBevelBorder(1));
		pogaB.setFocusable(false);
		pogaB.addActionListener(this);
		pogaB.setText("B");
	
		pogaC.setBounds(0,530,100,100);
		pogaC.setFont(new Font("Serif",Font.ITALIC,50));
		pogaC.setBackground(new Color(187,160,190));
		pogaC.setForeground(new Color(50,50,3));
		pogaC.setBorder(BorderFactory.createBevelBorder(1));
		pogaC.setFocusable(false);
		pogaC.addActionListener(this);
		pogaC.setText("C");
		
		pogaD.setBounds(0,640,100,100);
		pogaD.setFont(new Font("Serif",Font.ITALIC,50));
		pogaD.setBackground(new Color(187,160,190));
		pogaD.setForeground(new Color(255,255,255));
		pogaD.setBorder(BorderFactory.createBevelBorder(1));
		pogaD.setFocusable(false);
		pogaD.addActionListener(this);
		pogaD.setText("D");
		
		nepareizieRezultati.setBounds(255,635,100,100);
		nepareizieRezultati.setFont(new Font("Serif",Font.ITALIC,16));
		nepareizieRezultati.setBackground(new Color(33,232,19));
		nepareizieRezultati.setForeground(new Color(25,25,25));
		nepareizieRezultati.setBorder(BorderFactory.createBevelBorder(1));
		nepareizieRezultati.setFocusable(false);
		nepareizieRezultati.addActionListener(this);
		nepareizieRezultati.setSize(200, 50);
		nepareizieRezultati.setText("Show wrong answers");
		
		
		
		atbildeA.setBounds(110,305,750,100);
		atbildeA.setBackground(new Color(187,160,190));
		atbildeA.setForeground(new Color(255,255,255));
		atbildeA.setFont(new Font("Serif",Font.ITALIC,30));		
		
		atbildeB.setBounds(110,415,750,100);
		atbildeB.setBackground(new Color(187,160,190));
		atbildeB.setForeground(new Color(50,50,3));
		atbildeB.setFont(new Font("Serif",Font.ITALIC,30));
		
		atbildeC.setBounds(110,525,750,100);
		atbildeC.setBackground(new Color(187,160,190));
		atbildeC.setForeground(new Color(255,255,255));
		atbildeC.setFont(new Font("Serif",Font.ITALIC,30));
		
		atbildeD.setBounds(110,635,750,100);
		atbildeD.setBackground(new Color(187,160,190));
		atbildeD.setForeground(new Color(50,50,3));
		atbildeD.setFont(new Font("Serif",Font.ITALIC,30));
		
		atlLaiks.setBounds(660,725,60,60);
		atlLaiks.setBackground(new Color(187,160,200));
		atlLaiks.setForeground(new Color(50,50,3));
		atlLaiks.setFont(new Font("Serif, Bolt",Font.ITALIC,15));
		atlLaiks.setBorder(BorderFactory.createBevelBorder(2));
		atlLaiks.setOpaque(true);
		atlLaiks.setHorizontalAlignment(JTextField.CENTER);
		atlLaiks.setText(String.valueOf(sekundes));
		logsLaiks.setBounds(650,700,100,15);
		logsLaiks.setBackground(new Color(187,157,177));
		logsLaiks.setForeground(new Color(50,50,3));
		logsLaiks.setFont(new Font("Serif",Font.ITALIC,15));
		logsLaiks.setHorizontalAlignment(JTextField.LEFT);
		logsLaiks.setBorder(BorderFactory.createBevelBorder(4));
		logsLaiks.setText("Atlikuis laiks:");		
		
		numurs.setBounds(0,250,600,550);
		numurs.setBackground(new Color(187,160,190));
		numurs.setForeground(new Color(50,50,3));
		numurs.setFont(new Font("Serif",Font.ITALIC,30));
		numurs.setBorder(BorderFactory.createBevelBorder(4));
		numurs.setHorizontalAlignment(JTextField.CENTER);
		numurs.setEditable(false);
		
		frame.add(textfield);
		frame.add(textarea);
		frame.add(pogaA);
		frame.add(pogaB);
		frame.add(pogaC);
		frame.add(pogaD);
		frame.add(atbildeB);
		frame.add(atbildeA);
		frame.add(atbildeC);
		frame.add(atbildeD);
		frame.add(logsLaiks);
		frame.add(atlLaiks);
		frame.setVisible(true);
		
		NakamajsJautajums();
		
		
	}
	public void NakamajsJautajums() {
		
		if(index>=kopJauSk) {
			Rezultats();
		}
		else {
			textfield.setText("Jautajums No:"+(index+1));
			textarea.setText(Jautajumi[index]);
			atbildeA.setText(Atbildesizvele[index][0]);
			atbildeB.setText(Atbildesizvele[index][1]);
			atbildeC.setText(Atbildesizvele[index][2]);
			atbildeD.setText(Atbildesizvele[index][3]);
			timer.start();
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		pogaA.setEnabled(false);
		pogaB.setEnabled(false);
		pogaC.setEnabled(false);
		pogaD.setEnabled(false);
		
		if(e.getSource()==pogaA) {
			atbilde='A';
			if(atbilde == Atbildes[index]) {
				atbildeA.setForeground(new Color(0,255,255));
				parizvele++;
			}
		}
		if(e.getSource()==pogaB) {
			atbilde= 'B';
			if(atbilde == Atbildes[index]) {
				atbildeB.setForeground(new Color(0,255,255));
				parizvele++;
			}
		}
		if(e.getSource()==pogaC) {
			atbilde= 'C';
			if(atbilde == Atbildes[index]) {
				atbildeC.setForeground(new Color(0,255,255));
				parizvele++;
			}
		}
		if(e.getSource()==pogaD) {
			atbilde= 'D';
			if(atbilde == Atbildes[index]) {
				atbildeD.setForeground(new Color(0,255,255));
				parizvele++;
			}
		}
		AtbildesLoga();
		
	}
	public void AtbildesLoga() {
		timer.stop();
		pogaA.setEnabled(false);
		pogaB.setEnabled(false);
		pogaC.setEnabled(false);
		pogaD.setEnabled(false);

		if(Atbildes[index] != 'A')
			atbildeA.setForeground(new Color(0,0,128));
		if(Atbildes[index] != 'B')
			atbildeB.setForeground(new Color(0,0,128));
		if(Atbildes[index] != 'C')
			atbildeC.setForeground(new Color(0,0,128));
		if(Atbildes[index] != 'D')
			atbildeD.setForeground(new Color(0,0,128));
		
		Timer pause = new Timer(1000,new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				atbildeA.setForeground(new Color(50,50,3));
				atbildeB.setForeground(new Color(255,255,255));
				atbildeC.setForeground(new Color(50,50,3));
				atbildeD.setForeground(new Color(255,255,255));
					
					atbilde = ' ';
					sekundes=15;
					atlLaiks.setText(String.valueOf(sekundes));
					pogaA.setEnabled(true);
					pogaB.setEnabled(true);
					pogaC.setEnabled(true);
					pogaD.setEnabled(true);
					index++;
					NakamajsJautajums();
				}
			});
		pause.setRepeats(false);
		pause.start();
		
	}
	public void Rezultats() {
		pogaA.setEnabled(false);
		pogaB.setEnabled(false);
		pogaC.setEnabled(false);
		pogaD.setEnabled(false);

		textfield.setText("Rezultats!");
		textarea.setText("");
		atbildeA.setText("");
		atbildeB.setText("");
		atbildeC.setText("");
		atbildeD.setText("");
	
		if(parizvele <= 10 || parizvele >=4) {
			beigas.setText("Malacis!");
		}

		numurs.setText("("+parizvele+"/"+kopJauSk+")");
		frame.add(nepareizieRezultati);
		frame.add(numurs);
		frame.add(beigas);
		
		
	

	}
}
