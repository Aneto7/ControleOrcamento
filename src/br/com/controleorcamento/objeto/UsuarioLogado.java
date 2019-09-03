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
public class UsuarioLogado {

    private int idusuario;
    public static String usuario;
    private String filial;
    private String regiao;
    private String senha;
    public static String perfil;
    private String email;
    private String nome;
    public static String area;

    public UsuarioLogado() {
    }

    public UsuarioLogado(int idusuario, String filial, String regiao, String senha, String email, String nome) {
        this.idusuario = idusuario;
        this.filial = filial;
        this.regiao = regiao;
        this.senha = senha;
        this.email = email;
        this.nome = nome;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        UsuarioLogado.usuario = usuario;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public static String getPerfil() {
        return perfil;
    }

    public static void setPerfil(String perfil) {
        UsuarioLogado.perfil = perfil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static String getArea() {
        return area;
    }

    public static void setArea(String area) {
        UsuarioLogado.area = area;
    }
    
    
    
}
