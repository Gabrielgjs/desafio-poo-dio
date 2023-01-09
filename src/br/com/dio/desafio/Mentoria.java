package br.com.dio.desafio;

import java.time.LocalDate;

public class Mentoria {

    String titutlo;
    String descricao;
    LocalDate data;

    public Mentoria(){}
    public Mentoria(String titutlo, String descricao, LocalDate data) {
        this.titutlo = titutlo;
        this.descricao = descricao;
        this.data = data;
    }

    public String getTitutlo() {
        return titutlo;
    }
    public String getDescricao() {
        return descricao;
    }
    public LocalDate getData() {
        return data;
    }
    public void setTitutlo(String titutlo) {
        this.titutlo = titutlo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "Mentoria{" +
                "titutlo='" + titutlo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
