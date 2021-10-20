package org.core.exceptions;

public class RendszamNemMegfelelo extends Exception {

	private static final long serialVersionUID = 1L;

	public RendszamNemMegfelelo(String rendszam) {
		super(rendszam);
	}

}
