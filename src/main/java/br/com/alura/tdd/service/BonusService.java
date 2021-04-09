package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
//			valor = BigDecimal.ZERO;
			throw new IllegalArgumentException("Funcion�rio com sal�rio mair que R$ 10.000,00 n�o pode receber b�nus");
		}
		return valor.setScale(2,RoundingMode.HALF_UP );
	}

}
