import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("curso java");
        curso.setDescricao("descrição curso java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso python");
        curso2.setDescricao("descrição Curso python ");
        curso2.setCargaHoraria(10);

        System.out.println(curso);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitutlo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
    }
}