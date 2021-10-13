package org.core;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.core.exceptions.AjtokSzamaNemMegfelelo;
import org.core.exceptions.GyartasiIdoNemMegfelelo;
import org.core.exceptions.RendszamNemMegfelelo;
import org.junit.Before;
import org.junit.Test;

public class AutoTest {
	
	Auto testAuto;
	
	@Before
	public void initAuto() {
		testAuto = new Auto();
	}
	
	@Test
	public void testAjtokSzamaMegfelelo() throws AjtokSzamaNemMegfelelo{
		Auto auto = new Auto();
		auto.setAjtokSzama(3);
	}
	
	@Test(expected = AjtokSzamaNemMegfelelo.class)
	public void testAjtokSzamaTulAlacsony() throws AjtokSzamaNemMegfelelo{
		Auto auto = new Auto();
		auto.setAjtokSzama(-1);
	}
	
	@Test(expected = AjtokSzamaNemMegfelelo.class)
	public void testAjtokSzamaMegfeleloTulMagas() throws AjtokSzamaNemMegfelelo{
		Auto auto = new Auto();
		auto.setAjtokSzama(6);
	}
	
	@Test
	public void testJoRendszam() throws RendszamNemMegfelelo{
		String rendszam = "ABC-123";
		testAuto.setRendszam(rendszam);
	}

	@Test(expected = RendszamNemMegfelelo.class)
	public void testKotojelNelkuliRendszam() throws  RendszamNemMegfelelo{
		String rendszam = "ABC123";
		testAuto.setRendszam(rendszam);
	}
	
	@Test(expected = RendszamNemMegfelelo.class)
	public void testTulBosszuBetusRendszam() throws  RendszamNemMegfelelo{
		String rendszam = "ABCA-123";
		testAuto.setRendszam(rendszam);
	}
	
	@Test(expected = RendszamNemMegfelelo.class)
	public void testTulHoszzuSzamosRendszam() throws  RendszamNemMegfelelo{
		String rendszam = "ABC-1234";
		testAuto.setRendszam(rendszam);
	}
	
	@Test(expected = RendszamNemMegfelelo.class)
	public void testCsakSzamokRendszam() throws  RendszamNemMegfelelo{
		String rendszam = "111-123";
		testAuto.setRendszam(rendszam);
	}
	
	@Test(expected = RendszamNemMegfelelo.class)
	public void testCsakBetukRendszam() throws  RendszamNemMegfelelo{
		String rendszam = "ABC-ABC";
		testAuto.setRendszam(rendszam);
	}
	
	@Test(expected = RendszamNemMegfelelo.class)
	public void testKisBetusRendszam() throws  RendszamNemMegfelelo{
		String rendszam = "abc-123";
		testAuto.setRendszam(rendszam);
	}
	
	@Test(expected = RendszamNemMegfelelo.class)
	public void testQbetuvelRendszam() throws  RendszamNemMegfelelo{
		String rendszam = "ABQ-123";
		testAuto.setRendszam(rendszam);
	}
	
	@Test
	public void testJoGyartasiIdo() throws GyartasiIdoNemMegfelelo {
		String gyartasiIdo = "2021-04-17";
		testAuto.setGyartasiIdo(LocalDate.parse(gyartasiIdo));
	}
	
	@Test(expected = GyartasiIdoNemMegfelelo.class)
	public void testKoraiGyartasiIdo() throws GyartasiIdoNemMegfelelo {
		String gyartasiIdo = "0220-04-17";
		testAuto.setGyartasiIdo(LocalDate.parse(gyartasiIdo));
	}
	
	@Test(expected = GyartasiIdoNemMegfelelo.class)
	public void testKesoiGyartasiIdo() throws GyartasiIdoNemMegfelelo {
		String gyartasiIdo = "2022-04-17";
		testAuto.setGyartasiIdo(LocalDate.parse(gyartasiIdo));
	}
}
