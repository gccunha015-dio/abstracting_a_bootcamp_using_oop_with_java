package dio.bootcamp;

import java.time.LocalDate;

import dio.bootcamp.domain.Atividade;
import dio.bootcamp.domain.Bootcamp;
import dio.bootcamp.domain.Dev;
import dio.bootcamp.domain.Mentoria;

public class App {
    public static void main(String[] args) {
        Atividade atividade1 = new Atividade();
        atividade1.setTitulo("curso java");
        atividade1.setDescricao("descrição curso java");
        atividade1.setCargaHoraria(8);

        Atividade atividade2 = new Atividade();
        atividade2.setTitulo("curso js");
        atividade2.setDescricao("descrição curso js");
        atividade2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(atividade1);
        bootcamp.getConteudos().add(atividade2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverNoBootcamp(bootcamp);
        devCamila.exibirConteudosInscritos();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        devCamila.exibirConteudos();
        devCamila.mostrarXpTotal();

        System.out.println("-------");

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverNoBootcamp(bootcamp);
        devGabriel.exibirConteudosInscritos();
        devGabriel.progredir();
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("-");
        devGabriel.exibirConteudos();
        devGabriel.mostrarXpTotal();
    }
}
