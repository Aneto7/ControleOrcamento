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
public class Infracoes {
    private int id;
    private String data;
    private String placa;
    private String locadora;
    private int ponto;
    private String gravidade;
    private String codigo;
    private String descricao;
    private Double valor;
    private String autoinfra;
    private String prazorecurso;
    private String condutor;
    private String nchamado;
    private String condutoridentificado;
    private boolean reembolso;
    private String obs;

    public Infracoes() {
    }

    public Infracoes(int id, String data, String placa, String locadora, int ponto, String gravidade, String codigo, String descricao, Double valor, String autoinfra, String prazorecurso, String condutor, String nchamado, String condutoridentificado, boolean reembolso, String obs) {
        this.id = id;
        this.data = data;
        this.placa = placa;
        this.locadora = locadora;
        this.ponto = ponto;
        this.gravidade = gravidade;
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.autoinfra = autoinfra;
        this.prazorecurso = prazorecurso;
        this.condutor = condutor;
        this.nchamado = nchamado;
        this.condutoridentificado = condutoridentificado;
        this.reembolso = reembolso;
        this.obs = obs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getLocadora() {
        return locadora;
    }

    public void setLocadora(String locadora) {
        this.locadora = locadora;
    }

    public int getPonto() {
        return ponto;
    }

    public void setPonto(int ponto) {
        this.ponto = ponto;
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getAutoinfra() {
        return autoinfra;
    }

    public void setAutoinfra(String autoinfra) {
        this.autoinfra = autoinfra;
    }

    public String getPrazorecurso() {
        return prazorecurso;
    }

    public void setPrazorecurso(String prazorecurso) {
        this.prazorecurso = prazorecurso;
    }

    public String getCondutor() {
        return condutor;
    }

    public void setCondutor(String condutor) {
        this.condutor = condutor;
    }

    public String getNchamado() {
        return nchamado;
    }

    public void setNchamado(String nchamado) {
        this.nchamado = nchamado;
    }

    public String getCondutoridentificado() {
        return condutoridentificado;
    }

    public void setCondutoridentificado(String condutoridentificado) {
        this.condutoridentificado = condutoridentificado;
    }

    public boolean isReembolso() {
        return reembolso;
    }

    public void setReembolso(boolean reembolso) {
        this.reembolso = reembolso;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    
}
