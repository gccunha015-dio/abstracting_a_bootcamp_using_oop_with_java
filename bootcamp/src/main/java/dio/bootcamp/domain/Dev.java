package dio.bootcamp.domain;

import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;

import lombok.Data;

@Data
public class Dev {
  private String nome;
  private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
  private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

  public void inscreverNoBootcamp(Bootcamp bootcamp) {
    conteudosInscritos.addAll(bootcamp.getConteudos());
    bootcamp.getDevsInscritos().add(this);
  }

  public void progredir() {
    try {
      Conteudo conteudo = conteudosInscritos.stream().findFirst().get();
      conteudosConcluidos.add(conteudo);
      conteudosInscritos.remove(conteudo);
    } catch (NoSuchElementException __) {
      System.err.println("Você não está matriculado em nenhum conteúdo!");
    }
  }

  public void mostrarXpTotal() {
    System.out.println(String.format("XP: %.2f", calcularXpTotal()));
  }

  public double calcularXpTotal() {
    return conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
  }

  public void exibirConteudosInscritos() {
    System.out.println(String.format("Conteúdos Inscritos %s", nome));
    exibirConteudos(conteudosInscritos);
  }

  public void exibirConteudosConcluidos() {
    System.out.println(String.format("Conteúdos Concluídos %s", nome));
    exibirConteudos(conteudosConcluidos);
  }

  public void exibirConteudos() {
    exibirConteudosInscritos();
    exibirConteudosConcluidos();
  }

  private void exibirConteudos(Set<Conteudo> conteudos) {
    conteudos.stream().forEach((conteudo) -> System.out.println(conteudo.getTitulo()));
  }
}
