import java.util.ArrayList;

public class Turma {

    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
        if (alunos.isEmpty()){
            System.out.println("Nenhum aluno cadastrado!");
        }
        for (int i = 0; i < alunos.size(); i++){
            System.out.println("---------------");
            System.out.println((i + 1) + " - " + alunos.get(i).getNome());
            System.out.println("---------------");
        }
    }

    public void adicionarNota(int qualAluno, ArrayList<Double> notas) {
        if (qualAluno < 1 || qualAluno > alunos.size()){
            System.out.println("Esse aluno não existe");
            return;
        } else {
            alunos.get(qualAluno - 1).setNotas(notas);
        }

    }

    public void calcularMedia(int alunoMedia) {
        if (alunos.get(alunoMedia - 1).getNotas().isEmpty()){
            System.out.println("Aluno não possui notas cadstradas!");
        } else{
            ArrayList<Double> media = alunos.get(alunoMedia - 1).getNotas();
            double mediaFinal = (media.get(0) + media.get(1) + media.get(2) + media.get(3)) / 4;


            System.out.println("---------------");
            System.out.println(alunoMedia + " - " + alunos.get(alunoMedia - 1).getNome());
            System.out.println("Média: " + mediaFinal);
            System.out.println("---------------");
        }
    }

    public void verBoletim(int alunoBoletim) {
        if (alunos.get(alunoBoletim - 1).getNotas().isEmpty()){
            System.out.println("Aluno não possui notas cadstradas!");
        } else{
            double nota1 = alunos.get(alunoBoletim - 1).getNotas().get(0);
            double nota2 = alunos.get(alunoBoletim - 1).getNotas().get(1);
            double nota3 = alunos.get(alunoBoletim - 1).getNotas().get(2);
            double nota4 = alunos.get(alunoBoletim - 1).getNotas().get(3);

            System.out.println("---------------");
            System.out.println(alunoBoletim +" - " + alunos.get(alunoBoletim - 1).getNome());
            System.out.println("Nota 1: " + nota1);
            System.out.println("Nota 2: " + nota2);
            System.out.println("Nota 3: " + nota3);
            System.out.println("Nota 4: " + nota4);
            System.out.println("---------------");
        }
    }

    public void removerAluno(int removerAluno) {
        if (removerAluno <= ( alunos.size()) && removerAluno > 0 && removerAluno != 0) {
            alunos.remove(alunos.get(removerAluno - 1));
            System.out.println("Aluno removido com sucesso!");
        } else {
            System.out.println("Aluno não existe!");
        }
    }

    public boolean existeAluno(int qualAluno) {
        if (qualAluno <= ( alunos.size()) && qualAluno > 0 && qualAluno != 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean estaVazia() {
        if (alunos.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}
