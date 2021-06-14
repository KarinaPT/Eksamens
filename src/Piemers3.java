
public class Piemers3 {
	
	public static void main(String[] args) {
		//definē mainīgos
		String vards = "eksamens";
		String vardadala;
		//atgriež simbolu virknes apakšvirkni - (1,3)
		vardadala = vards.substring(1, 3);
		//izvada ekrānā  paziņojumu ar iegūto apakšvirkni
		System.out.println("Apakšvirkns : "+vardadala);
		
	}
}
