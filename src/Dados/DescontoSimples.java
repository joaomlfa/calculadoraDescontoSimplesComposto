/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

/**
 *
 * @author Suporte
 */
public class DescontoSimples {
    private double valorTitulo;
    private double taxa;
    private double desconto;
    private double periodo;
    private double valorCreditado;

    public DescontoSimples(double valorTitulo, double taxa, double desconto, double periodo, double valorCreditado) {
        this.valorTitulo = valorTitulo;
        this.taxa = taxa;
        this.desconto = desconto;
        this.periodo = periodo;
        this.valorCreditado = valorCreditado;
    }

    public DescontoSimples() {
    }

    public double getValorTitulo() {
        return valorTitulo;
    }

    public void setValorTitulo(double valorTitulo) {
        this.valorTitulo = valorTitulo;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getPeriodo() {
        return periodo;
    }

    public void setPeriodo(double periodo) {
        this.periodo = periodo;
    }

    public double getValorCreditado() {
        return valorCreditado;
    }

    public void setValorCreditado(double valorCreditado) {
        this.valorCreditado = valorCreditado;
    }
    
    
        
}
