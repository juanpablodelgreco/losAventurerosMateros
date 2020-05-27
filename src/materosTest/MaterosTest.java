package materosTest;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import losAventurerosMateros.ProcedimientoDeEleccion;

public class MaterosTest {

	@Test
	public void testCasoBase1() throws FileNotFoundException {
		ProcedimientoDeEleccion pe = new ProcedimientoDeEleccion("caso1");
		pe.eleccion();
		Scanner esperado = new Scanner(new File("./lote_de_pruebas/Esperado/caso1.out"));
		String esp = esperado.useDelimiter("\\A").next();

		Scanner recibido = new Scanner(new File("./lote_de_pruebas/Recibido/caso1.out"));
		String rec = recibido.useDelimiter("\\A").next();
		Assert.assertEquals(esp, rec);
		esperado.close();
		recibido.close();
	}
	@Test
	public void testCasoBase2() throws FileNotFoundException {
		ProcedimientoDeEleccion pe = new ProcedimientoDeEleccion("caso2");
		pe.eleccion();
		Scanner esperado = new Scanner(new File("./lote_de_pruebas/Esperado/caso2.out"));
		String esp = esperado.useDelimiter("\\A").next();

		Scanner recibido = new Scanner(new File("./lote_de_pruebas/Recibido/caso2.out"));
		String rec = recibido.useDelimiter("\\A").next();
		Assert.assertEquals(esp, rec);
		esperado.close();
		recibido.close();
	}
	@Test
	public void testCasoBase3() throws FileNotFoundException {
		ProcedimientoDeEleccion pe = new ProcedimientoDeEleccion("caso3");
		pe.eleccion();
		Scanner esperado = new Scanner(new File("./lote_de_pruebas/Esperado/caso3.out"));
		String esp = esperado.useDelimiter("\\A").next();

		Scanner recibido = new Scanner(new File("./lote_de_pruebas/Recibido/caso3.out"));
		String rec = recibido.useDelimiter("\\A").next();
		Assert.assertEquals(esp, rec);
		esperado.close();
		recibido.close();
	}
	@Test
	public void testCasoBase4() throws FileNotFoundException {
		ProcedimientoDeEleccion pe = new ProcedimientoDeEleccion("caso4");
		pe.eleccion();
		Scanner esperado = new Scanner(new File("./lote_de_pruebas/Esperado/caso4.out"));
		String esp = esperado.useDelimiter("\\A").next();

		Scanner recibido = new Scanner(new File("./lote_de_pruebas/Recibido/caso4.out"));
		String rec = recibido.useDelimiter("\\A").next();
		Assert.assertEquals(esp, rec);
		esperado.close();
		recibido.close();
	}
	@Test
	public void testCasoBase5() throws FileNotFoundException {
		ProcedimientoDeEleccion pe = new ProcedimientoDeEleccion("caso5");
		pe.eleccion();
		Scanner esperado = new Scanner(new File("./lote_de_pruebas/Esperado/caso5.out"));
		String esp = esperado.useDelimiter("\\A").next();

		Scanner recibido = new Scanner(new File("./lote_de_pruebas/Recibido/caso5.out"));
		String rec = recibido.useDelimiter("\\A").next();
		Assert.assertEquals(esp, rec);
		esperado.close();
		recibido.close();
	}
	@Test
	public void testCasoFatiga() {
//		generadorFatiga();
		ProcedimientoDeEleccion pe = new ProcedimientoDeEleccion("casoFatiga");
		pe.eleccion();
	}
	
	public void generadorFatiga() {
		PrintWriter pw;
		try {
			pw = new PrintWriter("lote_de_pruebas/Input/casoFatiga.in");
			Random r = new Random();
			pw.println(400000);
			for(int i=1; i<400000; i++) {
				pw.print(r.nextInt(100000000)+" ");
			}
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
