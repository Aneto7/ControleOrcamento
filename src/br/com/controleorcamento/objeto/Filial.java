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
public class Filial {
    private int id;
    private String filial;
    private String regiao;
    private String tipo;
    private String status;
    private String gestorsub;
    private String gestorrg;
    private String gestordiv;

    public Filial() {
    }

    public Filial(int id, String filial, String regiao, String tipo, String status, String gestorsub, String gestorrg, String gestordiv) {
        this.id = id;
        this.filial = filial;
        this.regiao = regiao;
        this.tipo = tipo;
        this.status = status;
        this.gestorsub = gestorsub;
        this.gestorrg = gestorrg;
        this.gestordiv = gestordiv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGestorsub() {
        return gestorsub;
    }

    public void setGestorsub(String gestorsub) {
        this.gestorsub = gestorsub;
    }

    public String getGestorrg() {
        return gestorrg;
    }

    public void setGestorrg(String gestorrg) {
        this.gestorrg = gestorrg;
    }

    public String getGestordiv() {
        return gestordiv;
    }

    public void setGestordiv(String gestordiv) {
        this.gestordiv = gestordiv;
    }
    
    
}
