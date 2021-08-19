package services;

import models.Desempenho;
import models.Funcionario;

public class ReajusteService {
    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        double reajuste;
        switch(desempenho){
            case A_DESEJAR:
                reajuste = 0.03;
                break;
            case BOM:
                reajuste = 0.15;
                break;
            case OTIMO:
                reajuste = 0.20;
                break;
            default:
                reajuste = 0;
                break;
        }        
        funcionario.reajustarSalario(reajuste);
    }
}
