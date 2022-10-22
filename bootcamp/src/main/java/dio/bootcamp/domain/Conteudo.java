package dio.bootcamp.domain;

import lombok.Data;
import lombok.NonNull;

@Data
public abstract class Conteudo {
  private static final double XP_PADRAO = 10d;

  @NonNull
  private String titulo;

  private String descricao;

  public double calcularXp() {
    return XP_PADRAO;
  }
}
