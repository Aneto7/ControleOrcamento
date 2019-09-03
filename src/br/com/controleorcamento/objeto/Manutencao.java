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
public class Manutencao {
    private int id;
    private String placa;
    private String datainicio;
    private String datafim;
    private String grupomanutencao;
    private Double valor;
    private String responsavel;
    private String orcamento;
    private String detalhe;
    private boolean carroreserva;

    public Manutencao() {
    }

    public Manutencao(int id, String placa, String datainicio, String datafim, String grupomanutencao, Double valor, String responsavel, String orcamento, String detalhe, boolean carroreserva) {
        this.id = id;
        this.placa = placa;
        this.datainicio = datainicio;
        this.datafim = datafim;
        this.grupomanutencao = grupomanutencao;
        this.valor = valor;
        this.responsavel = responsavel;
        this.orcamento = orcamento;
        this.detalhe = detalhe;
        this.carroreserva = carroreserva;
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

    public String getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(String datainicio) {
        this.datainicio = datainicio;
    }

    public String getDatafim() {
        return datafim;
    }

    public void setDatafim(String datafim) {
        this.datafim = datafim;
    }

    public String getGrupomanutencao() {
        return grupomanutencao;
    }

    public void setGrupomanutencao(String grupomanutencao) {
        this.grupomanutencao = grupomanutencao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(String orcamento) {
        this.orcamento = orcamento;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public boolean isCarroreserva() {
        return carroreserva;
    }

    public void setCarroreserva(boolean carroreserva) {
        this.carroreserva = carroreserva;
    }

    
    
}
