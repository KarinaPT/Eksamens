import java.util.Scanner;
public class tests {

	public static void main(String[] args) {
		String jaut1 = "Jautajums1? \n"
				+ "A - ...\nB - ...\nC - ...\nD - ...";
		String jaut2 = "Jautajums1? \n"
				+ "A - ...\nB - ...\nC - ...\nD - ...";
		String jaut3 = "Jautajums1? \n"
				+ "A - ...\nB - ...\nC - ...\nD - ...";
		String jaut4 = "Jautajums1? \n"
				+ "A - ...\nB - ...\nC - ...\nD - ...";
		String jaut5 = "Jautajums1? \n"
				+ "A - ...\nB - ...\nC - ...\nD - ...";
		String jaut6 = "Jautajums1? \n"
				+ "A - ...\nB - ...\nC - ...\nD - ...";
		String jaut7 = "Jautajums1? \n"
				+ "A - ...\nB - ...\nC - ...\nD - ...";
		String jaut8 = "Jautajums1? \n"
				+ "A - ...\nB - ...\nC - ...\nD - ...";
		String jaut9 = "Jautajums1? \n"
				+ "A - ...\nB - ...\nC - ...\nD - ...";
		String jaut10 = "Jautajums1? \n"
				+ "A - ...\nB - ...\nC - ...\nD - ...";
		
		Jautajumi[] jautajums = {
				new Jautajumi(jaut1, "A"),
				new Jautajumi(jaut2, "A"),
				new Jautajumi(jaut3, "A"),
				new Jautajumi(jaut4, "A"),
				new Jautajumi(jaut5, "A"),
				new Jautajumi(jaut6, "A"),
				new Jautajumi(jaut7, "A"),
				new Jautajumi(jaut8, "A"),
				new Jautajumi(jaut9, "A"),
				new Jautajumi(jaut10, "B")
		};
		veiktparbaudi(jautajums);

	}
	
	public static void veiktparbaudi(Jautajumi[] jautajums) {
		int rezultats = 0;
		Scanner keyboardInput = new Scanner(System.in);
		for( int i = 0; i < jautajums.length; i++) {
			System.out.println(jautajums[i].par);
			String atbilde = keyboardInput.nextLine();
			if(atbilde.equals(jautajums[i].atbilde)) {
				rezultats++;
				
			}
		}
		System.out.println("jūs atbildējāt uz: "+rezultats+"/"+jautajums.length);
		
	}

}
