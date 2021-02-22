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
public enum DiaSemana {
    DOMINGO(1), SEGUNDA(2), TERÇA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);
    
    private int valor;
    
    DiaSemana(int valor){
        this.valor = valor;
    }
    public int getValor() {
        return this.valor;
    }
    
}
