
public class Piemers9 {

	public static void main(String[] args) {
		//definē mainīgo
		String vards1 = "Eksamens";
		String vards2 = "EKSAMENS";
		boolean rezultats;
		//salidzina  divas simbolu virknes un neņem vērā burtu lielumu 
		rezultats = vards1.equalsIgnoreCase(vards2);
		//izvada ekrānā paziņojumu ar rezultātu
		System.out.println("Vai virknes ir vienādas? "+rezultats);
		
	}

}
