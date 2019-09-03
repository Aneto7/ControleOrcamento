/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleorcamento.objeto;

/**
 *
 * @author rosaan
 */
public class Combustivel {
    private int id;
    private String placa;
    private String cartao;
    private String dataab;
    private Double valor;
    private Double litros;
    private Double km;
    private String centro;
    private String condutor;

    public Combustivel() {
    }

    public Combustivel(int id, String placa, String cartao, String dataab, Double valor, Double litros, Double km, String centro, String condutor) {
        this.id = id;
        this.placa = placa;
        this.cartao = cartao;
        this.dataab = dataab;
        this.valor = valor;
        this.litros = litros;
        this.km = km;
        this.centro = centro;
        this.condutor = condutor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public String getDataab() {
        return dataab;
    }

    public void setDataab(String dataab) {
        this.dataab = dataab;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }

    public Double getKm() {
        return km;
    }

    public void setKm(Double km) {
        this.km = km;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getCondutor() {
        return condutor;
    }

    public void setCondutor(String condutor) {
        this.condutor = condutor;
    }

    
}
