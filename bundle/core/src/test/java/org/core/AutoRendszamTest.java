package org.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.core.exceptions.RendszamNemMegfelelo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AutoRendszamTest {
	
	@Parameters
	public static Collection<String> data() {
		List<String> data = new ArrayList<String>();
		data.add("AAAA-123");
		data.add("AAA123");
		data.add("aaa123");
		data.add("AAA-1234");
		data.add("AAQ-123");
		data.add("AAA-AAA");
		data.add("234-123");
		return data;
	}
	
	String rendszam;
	
	public AutoRendszamTest(String rendszam) {
		this.rendszam = rendszam;
	}
	
	@Test(expected = RendszamNemMegfelelo.class)
	public void testRosszRendszam() throws RendszamNemMegfelelo {
		Auto auto = new Auto();
		System.out.println("A vizsgált rendszám: "+rendszam);
		auto.setRendszam(rendszam);
	}

}
