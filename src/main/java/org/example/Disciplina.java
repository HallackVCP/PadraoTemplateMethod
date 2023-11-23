package org.example;

public class Disciplina implements Comparable<Disciplina>{

    private String nmMateria;

    private Integer nota;

    public Disciplina(String nmMateria, Integer nota) {
        this.nmMateria = nmMateria;
        this.nota = nota;
    }

    public String getNmMateria() {
        return nmMateria;
    }

    public void setNmMateria(String nmMateria) {
        this.nmMateria = nmMateria;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public int compareTo(Disciplina outraDisciplina) {
        // Comparação com base nas notas
        return Double.compare(this.nota, outraDisciplina.nota);
    }
}
