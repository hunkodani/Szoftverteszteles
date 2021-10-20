package org.core.exceptions;

import java.time.LocalDate;

public class GyartasiIdoNemMegfelelo extends Exception {

	private static final long serialVersionUID = 1L;

	public GyartasiIdoNemMegfelelo(LocalDate gyartasiIdo) {
		super(gyartasiIdo.toString());
	}

}
