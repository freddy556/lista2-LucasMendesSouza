/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orcamentoapp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author max_p
 */
public class OrcamentoApp {

    
    public static void main(String[] args) {
        LocalTime horaAgora = LocalTime.now();
        LocalDate dataHoje = LocalDate.now();
        
        Mes m1 = Mes.MARCO;
        Pessoa p1 = new Pessoa();
        p1.setNome("Vance");
        p1.setIdade(30);
        p1.setRenda(1980.56);
        p1.setGastos(3999.95);
        p1.calculaRenda();
        BigDecimal _renda = new BigDecimal("1980.56");
        BigDecimal _gastos = new BigDecimal("3999.95");
        BigDecimal _rendaMes = _renda.subtract(_gastos);
        System.out.println(p1.getNome() + " - " + p1.getIdade()+ " anos");
        System.out.println("Consulta referente ao mês de "+m1.toString() + " - " + m1.getValor());
        System.out.println("Consulta realizada as " + horaAgora + " No dia " + dataHoje);
        System.out.println("Valor total da renda no mês: R$"+ _rendaMes+"\n");
        Pessoa p2 = new Pessoa();
        p1.setNome("Oliver");
        p1.setIdade(29);
        p1.setRenda(31980.56);
        p1.setGastos(23999.95);
        p1.calculaRenda();
        BigDecimal _renda1 = new BigDecimal("31980.56");
        BigDecimal _gastos1 = new BigDecimal("23999.95");
        BigDecimal _rendaMes1 = _renda1.subtract(_gastos1);
        System.out.println(p1.getNome() + " - " + p1.getIdade()+ " anos");
        System.out.println("Consulta referente ao mês de "+m1.toString() + " - " + m1.getValor());
        System.out.println("Consulta realizada as " + horaAgora + " No dia " + dataHoje);
        System.out.println("Valor total da renda no mês: R$"+ _rendaMes1+"\n");
    }
    
}
