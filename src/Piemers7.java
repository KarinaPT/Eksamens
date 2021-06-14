
public class Piemers7 {

	public static void main(String[] args) {
		//definē mainīgos
		String vards1 = "EKSAMENS";
		String vards2 = "eksamens";
		int salidzinat;
		//salīdzina divas simbolu virknes un neņem vērā burtu lielumu
		salidzinat = vards1.compareToIgnoreCase(vards2);
		//izvada ekrānā paziņojumu ar rezultātu
		System.out.println("Salīdzinājam divas simbolu virknes vards1 un vards2. Rezultats: "+salidzinat);
		

	}

}
