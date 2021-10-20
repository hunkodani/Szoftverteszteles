package org.core.exceptions;

public class AjtokSzamaNemMegfelelo extends Exception {

	private static final long serialVersionUID = 1L;

	public AjtokSzamaNemMegfelelo(int ajtokSzama) {
		super(String.valueOf(ajtokSzama));
	}

}
