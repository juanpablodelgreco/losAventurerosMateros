package losAventurerosMateros;

public class App {

	public static void main(String[] args) {
		ProcedimientoDeEleccion pe = new ProcedimientoDeEleccion("casoBase3");
		pe.cargarAventureros();
		System.out.println(pe);
		pe.eleccion();
	}
}
