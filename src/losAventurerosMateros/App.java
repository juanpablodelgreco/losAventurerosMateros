package losAventurerosMateros;

public class App {

	public static void main(String[] args) {
		ProcedimientoDeEleccion pe = new ProcedimientoDeEleccion("casoBase1");
		pe.cargarAventureros();
		System.out.println(pe);

	}

}
