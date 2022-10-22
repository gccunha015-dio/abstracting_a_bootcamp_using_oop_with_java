package dio.bootcamp.domain;

import lombok.Data;

@Data
public abstract class Conteudo {
  private static final double XP_PADRAO = 10d;

  private String titulo;
  private String descricao;

  public double calcularXp() {
    return XP_PADRAO;
  }
}
