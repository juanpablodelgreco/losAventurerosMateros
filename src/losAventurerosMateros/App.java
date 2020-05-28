package losAventurerosMateros;

public class App extends Aventurero{

	
	public App(int numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ProcedimientoDeEleccion pe = new ProcedimientoDeEleccion("casoFatiga9");
		 long inicio = System.currentTimeMillis();
		pe.eleccion();
		 long fin = System.currentTimeMillis();
		 double tiempo = (double) ((fin - inicio));
		 System.out.println(tiempo +" segundos");
	}
}
