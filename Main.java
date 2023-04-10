import src.br.com.dio.desafio.dominio.Bootcamp;
import src.br.com.dio.desafio.dominio.Curso;
import src.br.com.dio.desafio.dominio.Dev;
import src.br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao do curso com spring");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descricao do curso com js com node");
        curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("descrição sobre curso java");
        mentoria.setDate(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java DEVELOPER");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVinicius = new Dev();
        devVinicius.setNome("Vinicius Carlos");
        devVinicius.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Vinicius " + devVinicius.getConteudosInscritos());
        devVinicius.progredir();
        devVinicius.progredir();
        System.out.println("------------------");
        System.out.println("Conteudos Inscritos Vinicius " + devVinicius.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Vinicius " + devVinicius.getConteudosConcluidos());
        System.out.println("XP:" + devVinicius.calcularTotalXp());

        System.out.println("------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao Carlos");
        System.out.println("Conteudos Inscritos Joao " + devJoao.getConteudosInscritos());


    }
}
