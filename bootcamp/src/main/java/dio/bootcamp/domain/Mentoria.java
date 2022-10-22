package dio.bootcamp.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Mentoria extends Conteudo {
  public Mentoria(String titulo) {
    super(titulo);
  }

  @Override
  public double calcularXp() {
    return super.calcularXp() + 20d;
  }
}
