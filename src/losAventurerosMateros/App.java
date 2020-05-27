package losAventurerosMateros;

public class App extends Aventurero{

	
	public App(int numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ProcedimientoDeEleccion pe = new ProcedimientoDeEleccion("caso2");
		pe.eleccion();
	}
}
