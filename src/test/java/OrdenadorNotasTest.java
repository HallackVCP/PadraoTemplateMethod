import org.example.Aluno;
import org.example.Disciplina;
import org.example.OrdenadorNotasAscendente;
import org.example.OrdenadorNotasDescendente;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrdenadorNotasTest {


    @Test
    void deveRetornarNotasOrdenadasAscendente(){
        List<Disciplina> disciplinas = new ArrayList<>();
        Disciplina disciplina1 = new Disciplina("Matemática", 8);
        Disciplina disciplina2 = new Disciplina("História", 7);
        Disciplina disciplina3 = new Disciplina("Inglês", 9);
        disciplinas.add(disciplina1);
        disciplinas.add(disciplina2);
        disciplinas.add(disciplina3);
        List<Disciplina> ordenadas = Arrays.asList(disciplina2, disciplina1, disciplina3);
        OrdenadorNotasAscendente ordenador = new OrdenadorNotasAscendente();
        Aluno aluno = new Aluno(disciplinas, ordenador);

        assertEquals(ordenadas, aluno.ordenarNotas());
    }

    @Test
    void deveRetornarNotasOrdenadasDescendente(){
        List<Disciplina> disciplinas = new ArrayList<>();
        Disciplina disciplina1 = new Disciplina("Matemática", 8);
        Disciplina disciplina2 = new Disciplina("História", 7);
        Disciplina disciplina3 = new Disciplina("Inglês", 9);
        disciplinas.add(disciplina1);
        disciplinas.add(disciplina2);
        disciplinas.add(disciplina3);
        List<Disciplina> ordenadas = Arrays.asList(disciplina3, disciplina1, disciplina2);
        OrdenadorNotasDescendente ordenador = new OrdenadorNotasDescendente();
        Aluno aluno = new Aluno(disciplinas, ordenador);

        assertEquals(ordenadas, aluno.ordenarNotas());
    }
}
