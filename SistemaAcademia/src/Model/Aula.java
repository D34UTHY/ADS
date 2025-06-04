package Model;

public class Aula {
    private String horario;
    private String instrutor;

    public Aula(String horario, String instrutor) {
        this.horario = horario;
        this.instrutor = instrutor;
    }

    // Getters and Setters

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }
}
