package dio.bootcamp.domain;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
public class Dev {
  private String nome;
  private Set<Conteudo> conteudos = new HashSet<>();

  public Dev(String nome) {
    this.nome = nome;
  }

  public void inscreverNoBootcamp(Bootcamp bootcamp) {
    bootcamp.getDevsInscritos().add(this);
  }

  public void progredir() {
  }

  public double calcularXpTotal() {
    return conteudos.stream().mapToDouble(Conteudo::calcularXp).sum();
  }

  public void exibirAtividades() {
    conteudos.stream().forEach((conteudo) -> System.out.println(conteudo.getTitulo()));
  }
}
