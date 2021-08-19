package services;

import java.math.BigDecimal;

import models.Funcionario;
import models.Funcionario;

public class BonusService {

    public double calcularBonus(Funcionario funcionario) {
        double valor = funcionario.getSalario() * 0.1;
        if (valor > 1000.00) {
            valor = 0.00;
        }
        return valor;
    }
}
