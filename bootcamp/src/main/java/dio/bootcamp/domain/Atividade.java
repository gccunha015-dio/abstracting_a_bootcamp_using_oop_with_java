package dio.bootcamp.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Atividade extends Conteudo {
  private int cargaHoraria;

  public Atividade(String titulo) {
    super(titulo);
  }

  @Override
  public double calcularXp() {
    return super.calcularXp() * cargaHoraria;
  }
}