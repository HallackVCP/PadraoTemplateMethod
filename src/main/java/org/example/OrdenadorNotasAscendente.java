package org.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenadorNotasAscendente extends OrdenadorNotas {
    @Override
    protected List<Disciplina> realizarComparacao(List<Disciplina> disciplinas) {
        Collections.sort(disciplinas, Comparator.comparing(Disciplina::getNota));
        return disciplinas;
    }
}
