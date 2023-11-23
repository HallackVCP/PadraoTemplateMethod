package org.example;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private List<Disciplina> historicoAluno;

    private OrdenadorNotas ordenadorNotas;

    public Aluno(List<Disciplina> historicoAluno, OrdenadorNotas ordenadorNotas) {
        this.historicoAluno = historicoAluno;
        this.ordenadorNotas = ordenadorNotas;
    }

    public Aluno() {
        this.historicoAluno = new ArrayList<>();
    }

    public List<Disciplina> getHistoricoAluno() {
        return historicoAluno;
    }

    public void setHistoricoAluno(List<Disciplina> historicoAluno) {
        this.historicoAluno = historicoAluno;
    }

    public List<Disciplina>ordenarNotas(){
        return this.ordenadorNotas.ordenarNotas(this);
    }
}
