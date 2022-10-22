package dio.bootcamp.domain;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Mentoria extends Conteudo {
  private LocalDate data;

  @Override
  public double calcularXp() {
    return super.calcularXp() + 20d;
  }
}
