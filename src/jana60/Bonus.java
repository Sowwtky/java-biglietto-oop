package jana60;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {

		double chilometri;
		int anniPasseggero;
		double prezzoBiglietto;
		boolean continua = true;
		int risposta;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
			System.out.println("Vuoi comprare un nuovo biglietto? Digita 1 per continuare o 2 per annullare");
			risposta = Integer.parseInt(scan.nextLine());
			if (risposta == 1) {
				System.out.print("Inserisci il numero di chilometri da percorrere: ");
				chilometri = Double.parseDouble(scan.nextLine());
				System.out.print("Inserisci la tua etá: ");
				anniPasseggero = Integer.parseInt(scan.nextLine());
				Biglietto ticket = new Biglietto(chilometri, anniPasseggero);
				prezzoBiglietto = ticket.calcPrezzo(chilometri, anniPasseggero);
				System.out.println("Il prezzo del biglietto é: " + prezzoBiglietto + "€");
				continua = false;
			} else {
				System.out.println("Arrivederci!");
				continua = true;
			}
			
		} while (continua == false);
		
		
		scan.close();
		
	}

}
