import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Double> notas;

    public Aluno(String nome){
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
}
