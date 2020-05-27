package losAventurerosMateros;

public class Aventurero {
	private int numero;
	
	public Aventurero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Aventurero [numero=" + numero + "]";
	}
}
