package Model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String cpf;
    private String email;
    private Plano plano;
    private Treino treino;

    public Aluno(String nome, String cpf, String email, Plano plano) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.plano = plano;
    }

    // Função de adicionar Treino
    public void adicionarTreino(Treino treino) {
        this.treino.adicionaExercicio(treino);
    }

    // Função para Agendar Aula
    public void agendarAula(Aula aula) {
        System.out.println("\n" + nome + " agendou aula com " + aula.getInstrutor() + " no horário " + aula.getHorario());
    }

    // Função para fazer checkin
    public void fazerCheckIn() {
        System.out.println("\n" + nome + " fez check-in na academia.");
    }

    // Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public Treino getTreinos() {
        return treino;
    }

    public void setTreinos(Treino treinos) {
        this.treino = treinos;
    }
}
