package losAventurerosMateros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcedimientoDeEleccion {
	private String path;
	private List<Aventurero> aventureros;
	private List<Integer> numSalida;
	private List<Integer>aventurerosQueSalen;
	private int cantAventureros;

	public ProcedimientoDeEleccion(String path) {
		this.path = path;
		aventureros = new ArrayList<Aventurero>();
		numSalida = new ArrayList<Integer>();
		aventurerosQueSalen = new ArrayList<Integer>();
	}

	public void eleccion() {
		cargarAventureros();
		int movimientos=0;
		for (int i = 0; i < numSalida.size(); i++) {
			movimientos = (movimientos+numSalida.get(i))%aventureros.size();
			aventurerosQueSalen.add(aventureros.get(movimientos).getNumero());
			aventureros.remove(movimientos);
		}
		grabarResultados();
	}
		
	private void cargarAventureros() {
		try {
			Scanner sc = new Scanner(new File("./lote_de_pruebas/Input/"+path+".in"));
			Aventurero aventurero;
			int i;
			this.cantAventureros = sc.nextInt();
			for (i = 1; i < cantAventureros+1; i++) {
				aventurero = new Aventurero(i);
				aventureros.add(aventurero);
			}
			while (sc.hasNext()) {
				numSalida.add(sc.nextInt());
			}
			sc.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private void grabarResultados() {
		try {
			PrintWriter pw = new PrintWriter(new File("./lote_de_pruebas/Recibido/"+path+".out"));
			for(Integer aventurero: aventurerosQueSalen)
				pw.print(aventurero+" ");
			pw.println();
			pw.print(aventureros.get(0).getNumero());
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
