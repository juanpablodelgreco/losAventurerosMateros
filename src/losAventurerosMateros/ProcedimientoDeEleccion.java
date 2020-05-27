package losAventurerosMateros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcedimientoDeEleccion {
	private List<Aventurero> aventureros;
	private List<Integer> numSalida;
	private List<Integer>aventurerosQueSalen;
	private int cantAventureros;
	private String path;

	public ProcedimientoDeEleccion(String path) {
		this.path = path;
		aventureros = new ArrayList<Aventurero>();
		numSalida = new ArrayList<Integer>();
		aventurerosQueSalen = new ArrayList<Integer>();
	}

	public void eleccion() {
		int movimientos=0, desde=0;
		for (int i = 0; i < numSalida.size(); i++) {
			movimientos = (movimientos+numSalida.get(i))%aventureros.size();
			System.out.println(aventureros.get(movimientos));
			aventureros.remove(movimientos);
			desde = movimientos;
		}
		System.out.println("CEBADOR->"+aventureros.get(0));
	}
	
	public void cargarAventureros() {
		try {
			Scanner sc = new Scanner(new File(path + ".in"));
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "ProcedimientoDeEleccion [aventureros=" + aventureros + ", numSalida=" + numSalida + ", cantAventureros="
				+ cantAventureros + ", path=" + path + "]";
	}
	
	
}
