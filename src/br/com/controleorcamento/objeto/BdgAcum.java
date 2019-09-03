/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleorcamento.objeto;

import br.com.controleorcamento.formularios.AnaliseOrcamento;

/**
 *
 * @author rosaan
 */
public class BdgAcum {

    private String messelecionado;
    private String janeiro;
    private String fevereiro;
    private String marco;
    private String abril;
    private String maio;
    private String junho;
    private String julho;
    private String agosto;
    private String setembro;
    private String outubro;
    private String novembro;
    private String dezembro;

    public BdgAcum() {
    }

    public BdgAcum(String messelecionado, String janeiro, String fevereiro, String marco, String abril, String maio, String junho, String julho, String agosto, String setembro, String outubro, String novembro, String dezembro) {
        this.messelecionado = messelecionado;
        this.janeiro = janeiro;
        this.fevereiro = fevereiro;
        this.marco = marco;
        this.abril = abril;
        this.maio = maio;
        this.junho = junho;
        this.julho = julho;
        this.agosto = agosto;
        this.setembro = setembro;
        this.outubro = outubro;
        this.novembro = novembro;
        this.dezembro = dezembro;
    }

    public String getMesselecionado() {
        return messelecionado;
    }

    public void setMesselecionado(String messelecionado) {
        this.messelecionado = messelecionado;
    }

    public String getJaneiro() {
        return janeiro;
    }

    public void setJaneiro(String janeiro) {
        this.janeiro = janeiro;
    }

    public String getFevereiro() {
        return fevereiro;
    }

    public void setFevereiro(String fevereiro) {
        this.fevereiro = fevereiro;
    }

    public String getMarco() {
        return marco;
    }

    public void setMarco(String marco) {
        this.marco = marco;
    }

    public String getAbril() {
        return abril;
    }

    public void setAbril(String abril) {
        this.abril = abril;
    }

    public String getMaio() {
        return maio;
    }

    public void setMaio(String maio) {
        this.maio = maio;
    }

    public String getJunho() {
        return junho;
    }

    public void setJunho(String junho) {
        this.junho = junho;
    }

    public String getJulho() {
        return julho;
    }

    public void setJulho(String julho) {
        this.julho = julho;
    }

    public String getAgosto() {
        return agosto;
    }

    public void setAgosto(String agosto) {
        this.agosto = agosto;
    }

    public String getSetembro() {
        return setembro;
    }

    public void setSetembro(String setembro) {
        this.setembro = setembro;
    }

    public String getOutubro() {
        return outubro;
    }

    public void setOutubro(String outubro) {
        this.outubro = outubro;
    }

    public String getNovembro() {
        return novembro;
    }

    public void setNovembro(String novembro) {
        this.novembro = novembro;
    }

    public String getDezembro() {
        return dezembro;
    }

    public void setDezembro(String dezembro) {
        this.dezembro = dezembro;
    }

    public void buscaMes() {
        this.janeiro = "UPDATE orcamentocontrole SET "+this.messelecionado+"_ACUM = "+this.messelecionado+"_JAN";
        this.fevereiro = "UPDATE orcamentocontrole SET "+this.messelecionado+"_ACUM = "+this.messelecionado+"_JAN+"+this.messelecionado+"_FEV";
        this.marco = "UPDATE orcamentocontrole SET "+this.messelecionado+"_ACUM = "+this.messelecionado+"_JAN+"+this.messelecionado+"_FEV+"+this.messelecionado+"_MAR";
        this.abril = "UPDATE orcamentocontrole SET "+this.messelecionado+"_ACUM = "+this.messelecionado+"_JAN+"+this.messelecionado+"_FEV+"+this.messelecionado+"_MAR+"+this.messelecionado+"_ABR";
        this.maio = "UPDATE orcamentocontrole SET "+this.messelecionado+"_ACUM = "+this.messelecionado+"_JAN+"+this.messelecionado+"_FEV+"+this.messelecionado+"_MAR+"+this.messelecionado+"_ABR+"+this.messelecionado+"_MAI";
        this.junho = "UPDATE orcamentocontrole SET "+this.messelecionado+"_ACUM = "+this.messelecionado+"_JAN+"+this.messelecionado+"_FEV+"+this.messelecionado+"_MAR+"+this.messelecionado+"_ABR+"+this.messelecionado+"_MAI+"+this.messelecionado+"_JUN";
        this.julho = "UPDATE orcamentocontrole SET "+this.messelecionado+"_ACUM = "+this.messelecionado+"_JAN+"+this.messelecionado+"_FEV+"+this.messelecionado+"_MAR+"+this.messelecionado+"_ABR+"+this.messelecionado+"_MAI+"+this.messelecionado+"_JUN+"+this.messelecionado+"_JUL";
        this.agosto = "UPDATE orcamentocontrole SET "+this.messelecionado+"_ACUM = "+this.messelecionado+"_JAN+"+this.messelecionado+"_FEV+"+this.messelecionado+"_MAR+"+this.messelecionado+"_ABR+"+this.messelecionado+"_MAI+"+this.messelecionado+"_JUN+"+this.messelecionado+"_JUL+"+this.messelecionado+"_AGO";
        this.setembro = "UPDATE orcamentocontrole SET "+this.messelecionado+"_ACUM = "+this.messelecionado+"_JAN+"+this.messelecionado+"_FEV+"+this.messelecionado+"_MAR+"+this.messelecionado+"_ABR+"+this.messelecionado+"_MAI+"+this.messelecionado+"_JUN+"+this.messelecionado+"_JUL+"+this.messelecionado+"_AGO+"+this.messelecionado+"_SET";
        this.outubro = "UPDATE orcamentocontrole SET "+this.messelecionado+"_ACUM = "+this.messelecionado+"_JAN+"+this.messelecionado+"_FEV+"+this.messelecionado+"_MAR+"+this.messelecionado+"_ABR+"+this.messelecionado+"_MAI+"+this.messelecionado+"_JUN+"+this.messelecionado+"_JUL+"+this.messelecionado+"_AGO+"+this.messelecionado+"_SET+"+this.messelecionado+"_OUT";
        this.novembro = "UPDATE orcamentocontrole SET "+this.messelecionado+"_ACUM = "+this.messelecionado+"_JAN+"+this.messelecionado+"_FEV+"+this.messelecionado+"_MAR+"+this.messelecionado+"_ABR+"+this.messelecionado+"_MAI+"+this.messelecionado+"_JUN+"+this.messelecionado+"_JUL+"+this.messelecionado+"_AGO+"+this.messelecionado+"_SET+"+this.messelecionado+"_OUT+"+this.messelecionado+"_NOV";
        this.dezembro = "UPDATE orcamentocontrole SET "+this.messelecionado+"_ACUM = "+this.messelecionado+"_JAN+"+this.messelecionado+"_FEV+"+this.messelecionado+"_MAR+"+this.messelecionado+"_ABR+"+this.messelecionado+"_MAI+"+this.messelecionado+"_JUN+"+this.messelecionado+"_JUL+"+this.messelecionado+"_AGO+"+this.messelecionado+"_SET+"+this.messelecionado+"_OUT+"+this.messelecionado+"_NOV+"+this.messelecionado+"_DEZ";
    }

}
