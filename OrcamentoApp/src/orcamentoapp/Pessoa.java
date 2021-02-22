/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orcamentoapp;

import java.math.BigDecimal;

public class Pessoa {
    private String nome;
    private int idade;
    private double renda;
    private double gastos;
    private double rendaMes;
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }
    
    
    public double calculaRenda(){
        rendaMes = renda - gastos;
        if(rendaMes>0){
            System.out.println("Terminou o mês no azul!");
        }
        if(rendaMes<0){
            System.out.println("Terminou o mês no vermelho!");
        }
        return rendaMes;
}

    public double getRendaMes() {
        return rendaMes;
    }

    public void setRendaMes(double rendaMes) {
        this.rendaMes = rendaMes;
    }
    
    
}
