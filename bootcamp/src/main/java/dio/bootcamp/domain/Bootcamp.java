package dio.bootcamp.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import lombok.Data;

@Data
public class Bootcamp {
  private String nome;
  private String descricao;
  private LocalDate dataInicial = LocalDate.now();
  private LocalDate dataFinal = dataInicial.plusDays(45);
  private final Set<Dev> devsInscritos = new HashSet<>();
  private final Set<Conteudo> conteudos = new LinkedHashSet<>();
}
