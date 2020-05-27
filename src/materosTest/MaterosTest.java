package materosTest;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
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

}
