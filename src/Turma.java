import java.util.ArrayList;

public class Turma {

    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado!");
            return;
        }

        for (int i = 0; i < alunos.size(); i++) {
            System.out.println("---------------");
            System.out.println((i + 1) + " - " + alunos.get(i).getNome());
            System.out.println("---------------");
        }
    }

    public void adicionarNota(int qualAluno, ArrayList<Double> notas) {
        if (qualAluno < 1 || qualAluno > alunos.size()) {
            System.out.println("Esse aluno não existe");
            return;
        }

        alunos.get(qualAluno - 1).setNotas(notas);
    }

    public void calcularMedia(int alunoMedia) {

        if (!existeAluno(alunoMedia)) {
            System.out.println("Aluno não existe!");
            return;
        }

        if (alunos.get(alunoMedia - 1).getNotas().isEmpty()) {
            System.out.println("Aluno não possui notas cadastradas!");
            return;
        }

        ArrayList<Double> notas = alunos.get(alunoMedia - 1).getNotas();

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        double mediaFinal = soma / notas.size();

        System.out.println("---------------");
        System.out.println(alunoMedia + " - " + alunos.get(alunoMedia - 1).getNome());
        System.out.println("Média: " + mediaFinal);
        System.out.println("---------------");
    }

    public void verBoletim(int alunoBoletim) {

        if (!existeAluno(alunoBoletim)) {
            System.out.println("Aluno não existe!");
            return;
        }

        if (alunos.get(alunoBoletim - 1).getNotas().isEmpty()) {
            System.out.println("Aluno não possui notas cadastradas!");
            return;
        }

        ArrayList<Double> notas = alunos.get(alunoBoletim - 1).getNotas();

        System.out.println("---------------");
        System.out.println(alunoBoletim + " - " + alunos.get(alunoBoletim - 1).getNome());

        for (int i = 0; i < notas.size(); i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas.get(i));
        }

        System.out.println("---------------");
    }

    public void removerAluno(int removerAluno) {

        if (existeAluno(removerAluno)) {
            alunos.remove(removerAluno - 1);
            System.out.println("Aluno removido com sucesso!");
        } else {
            System.out.println("Aluno não existe!");
        }
    }

    public boolean existeAluno(int qualAluno) {
        return qualAluno >= 1 && qualAluno <= alunos.size();
    }

    public boolean estaVazia() {
        return alunos.isEmpty();
    }
}
