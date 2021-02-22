/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orcamentoapp;

/**
 *
 * @author max_p
 */
public enum Mes {
    JANEIRO(1), FEVEREIRO(2), MARCO(3), ABRIL(4), MAIO(5), JUNHO(6), JULHO(7), AGOSTO(8), SETEMBRO(9),
    OUTUBRO(10), NOVEMBRO(11), DEZEMBRO(12);
    
    private int valor;
    
    Mes(int valor){
        this.valor = valor;
    }
    public int getValor() {
        return this.valor;
    }
}
