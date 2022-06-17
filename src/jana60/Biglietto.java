package jana60;

public class Biglietto {

	private double chilometri;
	private int anniPasseggero;
	private double prezzoBigliettoAlChilometro = 0.21;
	
	public Biglietto(double chilometri, int anniPasseggero) {
		this.anniPasseggero = anniPasseggero;
		this.chilometri = chilometri;
	}

	public void setChilometri(double chilometri) {
		this.chilometri = chilometri;
	}

	public void setAnniPasseggero(int anniPasseggero) {
		this.anniPasseggero = anniPasseggero;
	}
	
	public double calcPrezzo(double chilometri, int anniPasseggero) {
		
		double prezzoBiglietto = chilometri * prezzoBigliettoAlChilometro;
		
		if (anniPasseggero < 18) {
			prezzoBiglietto = prezzoBiglietto - (prezzoBiglietto * 20) / 100;
		} else if (anniPasseggero >= 65) {
			prezzoBiglietto = prezzoBiglietto - (prezzoBiglietto * 40) / 100;
		}
		
		return prezzoBiglietto;
	}
}
