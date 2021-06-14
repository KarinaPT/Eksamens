import java.util.Arrays; 
public class Piemers12 {

	public static void main(String[] args) {
		//definē mainīgos
		String vards1 = "Eksamens";
		//definē masīvu, kas tālāk satur simbolus no vards1
		char [] masivs;  
		masivs = vards1.toCharArray();
		//izvada ekrānā paziņojumu ar vards1
		System.out.println("Vards: "+vards1);
		//izvada ekrānā paziņojumu ar simboliem no masīva (katru burtu atdala atstarpe un komats)
		System.out.println("Simbols: "+Arrays.toString(masivs));
		}

	}


