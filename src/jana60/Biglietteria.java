package jana60;

import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double chilometri;
		int anniPasseggero;
		double prezzoBiglietto;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserisci il numero di chilometri da percorrere: ");
		chilometri = Double.parseDouble(scan.nextLine());
		System.out.print("Inserisci la tua etá: ");
		anniPasseggero = Integer.parseInt(scan.nextLine());
		
		Biglietto ticket = new Biglietto(chilometri, anniPasseggero);
		prezzoBiglietto = ticket.calcPrezzo(chilometri, anniPasseggero);
		
		System.out.println("Il prezzo del biglietto é: " + prezzoBiglietto + "€");
		
		scan.close();
	}

}
