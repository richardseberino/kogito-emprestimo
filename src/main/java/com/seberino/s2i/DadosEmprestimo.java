package com.seberino.s2i;

public class DadosEmprestimo {
    
    private double valor;
    private int prazoMeses;
    private Cliente cliente;
    
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getPrazoMeses() {
        return prazoMeses;
    }
    public void setPrazoMeses(int prazoMeses) {
        this.prazoMeses = prazoMeses;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    

    
}
