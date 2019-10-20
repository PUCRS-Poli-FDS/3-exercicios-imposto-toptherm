package com.fsd.imposto;

import java.math.BigDecimal;

public class ImpostoSimplificado {

	private static ImpostoSimplificado instance;

	private ImpostoSimplificado() {

	}

	public static synchronized ImpostoSimplificado getInstance() {
		if (instance == null)
			instance = new ImpostoSimplificado();
		return instance;
	}

	public BigDecimal calculaImpostoSimplificado(BigDecimal baseCalculo) {
		if (baseCalculo.compareTo(BigDecimal.ZERO) < 0)
			throw new RuntimeException();
		else if (baseCalculo.compareTo(BigDecimal.valueOf(12000)) <= 0)
			return BigDecimal.ZERO;
		else if ((baseCalculo.compareTo(BigDecimal.valueOf(12000)) > 0)
				&& (baseCalculo.compareTo(BigDecimal.valueOf(24000)) < 0))
			return baseCalculo.multiply(BigDecimal.valueOf(1.15));
		else
			return baseCalculo.multiply(BigDecimal.valueOf(1.27));
	}
}