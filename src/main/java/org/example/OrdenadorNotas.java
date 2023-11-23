package org.example;

import java.util.List;

public abstract class OrdenadorNotas {

    public List<Disciplina> ordenarNotas(Aluno aluno) {
        validarLista(aluno.getHistoricoAluno());
        List<Disciplina> historicoOrdenado = realizarComparacao(aluno.getHistoricoAluno());
        return historicoOrdenado;
    }

    protected abstract List<Disciplina> realizarComparacao(List<Disciplina> disciplinas);

    private void validarLista(List<Disciplina> disciplinas) {
        if (disciplinas == null || disciplinas.size() == 0) {
            throw new IllegalArgumentException("A lista de notas não pode ser vazia ou nula.");
        }
    }
}
