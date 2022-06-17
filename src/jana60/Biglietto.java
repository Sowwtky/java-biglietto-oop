package jana60;

public class Biglietto {

	private double chilometri;
	private int anniPasseggero;
	
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
	
	
}
