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
public class CartaoCar {

    private int id;
    private String cartao;
    private String veiculo;
    private String descricao;
    private String responsavel;
    private String status;
    private String centro_de_custo;

    public CartaoCar() {
    }

    public CartaoCar(int id, String cartao, String veiculo, String descricao, String responsavel, String status, String centro_de_custo) {
        this.id = id;
        this.cartao = cartao;
        this.veiculo = veiculo;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.status = status;
        this.centro_de_custo = centro_de_custo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCentro_de_custo() {
        return centro_de_custo;
    }

    public void setCentro_de_custo(String centro_de_custo) {
        this.centro_de_custo = centro_de_custo;
    }

}
