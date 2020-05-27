package losAventurerosMateros;

public class Aventurero {
	private int numero;
	private boolean salio;
	
	public Aventurero(int numero) {
		this.numero = numero;
		this.salio = false;
	}

	public int getNumero() {
		return numero;
	}

	public boolean isSalio() {
		return salio;
	}

	@Override
	public String toString() {
		return "Aventurero [numero=" + numero + ", salio=" + salio + "]";
	}
	
}
