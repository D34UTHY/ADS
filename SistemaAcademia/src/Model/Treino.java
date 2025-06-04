package Model;

import java.util.ArrayList;
import java.util.List;

public class Treino {
    private String objetivo;
    private List<Treino> exercicios;

    public Treino(String objetivo, int i, int i1) {
        this.objetivo = objetivo;
        this.exercicios = new ArrayList<Treino>();
    }

    // Função que adiciona exercícios
    public void adicionaExercicio(Treino exercicio) {
        this.exercicios.add(exercicio);
    }

    // Getters and Setters

    public List<Treino> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<Treino> exercicios) {
        this.exercicios = exercicios;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
}
