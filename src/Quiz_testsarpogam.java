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
		frame.setSize(600,600);
		frame.getContentPane().setBackground(new Color(187,157,177));
		frame.setLayout(null);
		frame.setResizable(false);
		
		textfield.setBounds(0,0,600,50);
		textfield.setBackground(new Color(187,160,190));
		textfield.setForeground(new Color(255,255,255));
		textfield.setFont(new Font("Serif",Font.ITALIC,26));
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		textfield.setText("Text");
		
		frame.add(textfield);
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
