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
		ProcedimientoDeEleccion pe = new ProcedimientoDeEleccion("casoBase1");
		pe.eleccion();
		Scanner esperado = new Scanner(new File("./lote_de_pruebas/Esperado/casoBase1.out"));
		String esp = esperado.useDelimiter("\\A").next();

		Scanner recibido = new Scanner(new File("./lote_de_pruebas/Recibido/casoBase1.out"));
		String rec = recibido.useDelimiter("\\A").next();
		Assert.assertEquals(esp, rec);
		esperado.close();
		recibido.close();
	}
	@Test
	public void testCasoBase2() throws FileNotFoundException {
		ProcedimientoDeEleccion pe = new ProcedimientoDeEleccion("casoBase2");
		pe.eleccion();
		Scanner esperado = new Scanner(new File("./lote_de_pruebas/Esperado/casoBase2.out"));
		String esp = esperado.useDelimiter("\\A").next();

		Scanner recibido = new Scanner(new File("./lote_de_pruebas/Recibido/casoBase2.out"));
		String rec = recibido.useDelimiter("\\A").next();
		Assert.assertEquals(esp, rec);
		esperado.close();
		recibido.close();
	}
	@Test
	public void testcasoCatedra() throws FileNotFoundException {
		ProcedimientoDeEleccion pe = new ProcedimientoDeEleccion("casoCatedra");
		pe.eleccion();
		Scanner esperado = new Scanner(new File("./lote_de_pruebas/Esperado/casoCatedra.out"));
		String esp = esperado.useDelimiter("\\A").next();

		Scanner recibido = new Scanner(new File("./lote_de_pruebas/Recibido/casoCatedra.out"));
		String rec = recibido.useDelimiter("\\A").next();
		Assert.assertEquals(esp, rec);
		esperado.close();
		recibido.close();
	}
	@Test
	public void testcebaElUltimo() throws FileNotFoundException {
		ProcedimientoDeEleccion pe = new ProcedimientoDeEleccion("cebaElUltimo");
		pe.eleccion();
		Scanner esperado = new Scanner(new File("./lote_de_pruebas/Esperado/cebaElUltimo.out"));
		String esp = esperado.useDelimiter("\\A").next();

		Scanner recibido = new Scanner(new File("./lote_de_pruebas/Recibido/cebaElUltimo.out"));
		String rec = recibido.useDelimiter("\\A").next();
		Assert.assertEquals(esp, rec);
		esperado.close();
		recibido.close();
	}
	@Test
	public void testsaleElDeAlLado() throws FileNotFoundException {
		ProcedimientoDeEleccion pe = new ProcedimientoDeEleccion("saleElDeAlLado");
		pe.eleccion();
		Scanner esperado = new Scanner(new File("./lote_de_pruebas/Esperado/saleElDeAlLado.out"));
		String esp = esperado.useDelimiter("\\A").next();

		Scanner recibido = new Scanner(new File("./lote_de_pruebas/Recibido/saleElDeAlLado.out"));
		String rec = recibido.useDelimiter("\\A").next();
		Assert.assertEquals(esp, rec);
		esperado.close();
		recibido.close();
	}
	
	@Test
	public void testCasoFatiga() throws FileNotFoundException {
		ProcedimientoDeEleccion pe = new ProcedimientoDeEleccion("casoFatiga");
		pe.eleccion();
		Scanner esperado = new Scanner(new File("./lote_de_pruebas/Esperado/casoFatiga.out"));
		String esp = esperado.useDelimiter("\\A").next();

		Scanner recibido = new Scanner(new File("./lote_de_pruebas/Recibido/casoFatiga.out"));
		String rec = recibido.useDelimiter("\\A").next();
		Assert.assertEquals(esp, rec);
		esperado.close();
		recibido.close();
	}
	
	@Test
	public void testcebaElPrimero() throws FileNotFoundException {
		ProcedimientoDeEleccion pe = new ProcedimientoDeEleccion("cebaElPrimero");
		pe.eleccion();
		Scanner esperado = new Scanner(new File("./lote_de_pruebas/Esperado/cebaElPrimero.out"));
		String esp = esperado.useDelimiter("\\A").next();

		Scanner recibido = new Scanner(new File("./lote_de_pruebas/Recibido/cebaElPrimero.out"));
		String rec = recibido.useDelimiter("\\A").next();
		Assert.assertEquals(esp, rec);
		esperado.close();
		recibido.close();
	}
	
	public void generadorFatiga() {
		PrintWriter pw;
		try {
			pw = new PrintWriter("lote_de_pruebas/Input/casoFatiga.in");
			Random r = new Random();
			pw.println(9000);
			for(int i=1; i<9000; i++) {
				pw.print(r.nextInt(100000000)+" ");
			}
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
