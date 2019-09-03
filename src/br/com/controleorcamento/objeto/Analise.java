/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleorcamento.objeto;

import java.util.Date;

/**
 *
 * @author rosaan
 */
public class Analise {

    private int id;
    private String magnitude;
    private String regiao;
    private String filial;
    private String conta;
    private String descconta;
    private String centrocusto;
    private String desccentrocusto;
    private String plataforma;
    private String borr;
    private String mes;
    private String analise;
    private Double bdgmes;
    private Double realmes;
    private Double bdgacum;
    private Double realacum;
    private String user;
    private String datareg;
    private String responsavel;
    private String situacao;
    private String tipoanalise;
    private String area;

    public Analise() {
    }

    public Analise(int id, String magnitude, String regiao, String filial, String conta, String descconta, String centrocusto, String desccentrocusto, String plataforma, String borr, String mes, String analise, Double bdgmes, Double realmes, Double bdgacum, Double realacum, String user, String datareg, String responsavel, String situacao, String tipoanalise, String area) {
        this.id = id;
        this.magnitude = magnitude;
        this.regiao = regiao;
        this.filial = filial;
        this.conta = conta;
        this.descconta = descconta;
        this.centrocusto = centrocusto;
        this.desccentrocusto = desccentrocusto;
        this.plataforma = plataforma;
        this.borr = borr;
        this.mes = mes;
        this.analise = analise;
        this.bdgmes = bdgmes;
        this.realmes = realmes;
        this.bdgacum = bdgacum;
        this.realacum = realacum;
        this.user = user;
        this.datareg = datareg;
        this.responsavel = responsavel;
        this.situacao = situacao;
        this.tipoanalise = tipoanalise;
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getDescconta() {
        return descconta;
    }

    public void setDescconta(String descconta) {
        this.descconta = descconta;
    }

    public String getCentrocusto() {
        return centrocusto;
    }

    public void setCentrocusto(String centrocusto) {
        this.centrocusto = centrocusto;
    }

    public String getDesccentrocusto() {
        return desccentrocusto;
    }

    public void setDesccentrocusto(String desccentrocusto) {
        this.desccentrocusto = desccentrocusto;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getBorr() {
        return borr;
    }

    public void setBorr(String borr) {
        this.borr = borr;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnalise() {
        return analise;
    }

    public void setAnalise(String analise) {
        this.analise = analise;
    }

    public Double getBdgmes() {
        return bdgmes;
    }

    public void setBdgmes(Double bdgmes) {
        this.bdgmes = bdgmes;
    }

    public Double getRealmes() {
        return realmes;
    }

    public void setRealmes(Double realmes) {
        this.realmes = realmes;
    }

    public Double getBdgacum() {
        return bdgacum;
    }

    public void setBdgacum(Double bdgacum) {
        this.bdgacum = bdgacum;
    }

    public Double getRealacum() {
        return realacum;
    }

    public void setRealacum(Double realacum) {
        this.realacum = realacum;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDatareg() {
        return datareg;
    }

    public void setDatareg(String datareg) {
        this.datareg = datareg;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getTipoanalise() {
        return tipoanalise;
    }

    public void setTipoanalise(String tipoanalise) {
        this.tipoanalise = tipoanalise;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    
}
