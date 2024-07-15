import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria do Java");
        mentoria.setDescricao("Descrição mentoria do Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEmerson = new Dev();
        devEmerson.setNome("Emerson");
        devEmerson.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos Inscritos Emerson" + devEmerson.getConteudosInscritos());
        devEmerson.progredir();
        devEmerson.progredir();
        System.out.println("---");
        System.out.println("Contéudos Inscritos Emerson" + devEmerson.getConteudosInscritos());
        System.out.println("Contéudos Concluídos Emerson" + devEmerson.getConteudosConcluidos());
        System.out.println("XP:" + devEmerson.calcularXp());
        System.out.println("---------------");

        Dev devLuciene = new Dev();
        devLuciene.setNome("Luciene");
        devLuciene.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos Inscritos Luciene" + devLuciene.getConteudosInscritos());
        devLuciene.progredir();
        devLuciene.progredir();
        devLuciene.progredir();
        System.out.println("---");
        System.out.println("Contéudos Inscritos Luciene" + devLuciene.getConteudosInscritos());
        System.out.println("Contéudos Concluídos Luciene" + devLuciene.getConteudosConcluidos());
        System.out.println("XP:" + devLuciene.calcularXp());
        System.out.println("---------------");









    }
}