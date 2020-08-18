package application;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import application.Program;

public class ProgramTest {

	private static ByteArrayOutputStream baOut;
	private static PrintStream psOut;

	@BeforeClass
	public static void beforeClassInit() {
		baOut = new ByteArrayOutputStream();
		psOut = new PrintStream(baOut);
		System.setOut(psOut);
	}

	@AfterClass
	public static void afterClassFinalize() {
		psOut.close();
	}

	@Before
	public void setUp() {
		baOut.reset();
	}

	@Test
	public void testeValido01() {
		Program.main(new String[] { "a1" });
		String output = baOut.toString();

		assertEquals("Valido", output);
	}

	@Test
	public void testeInvalido02() {
		Program.main(new String[] { "2b3" });
		String output = baOut.toString();

		assertEquals("Invalido", output);
	}

	@Test
	public void testeInvalido03() {
		Program.main(new String[] { "z-12" });
		String output = baOut.toString();

		assertEquals("Invalido", output);
	}

	@Test
	public void testeInvalido04() {
		Program.main(new String[] { "a1b2c3d" });
		String output = baOut.toString();

		assertEquals("Invalido", output);
	}

}
