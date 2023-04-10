package src.br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

     //como passamos os atributos abaixo na classe mae conteudo não precisamos ter na
    //classe filha porque ja vai vir de la as informacoes que será passada
    //private String titulo;
    //private String descricao;

    private LocalDate date;

    public Mentoria() {

    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", date=" + date +
                '}';
    }



}
