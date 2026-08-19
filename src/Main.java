import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Turma turma = new Turma();
        int opcao = 0;

        while (opcao != 7) {
            System.out.println("====================\n" +
                    "SISTEMA DE NOTAS\n" +
                    "====================\n" +
                    "1 - Cadastrar aluno\n" +
                    "2 - Listar alunos\n" +
                    "3 - Adicionar nota\n" +
                    "4 - Calcular média\n" +
                    "5 - Ver boletim\n" +
                    "6 - Remover aluno\n" +
                    "7 - Sair\n" +
                    "====================");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                System.out.println("Qual o nome do aluno?");
                String nome = scanner.nextLine();

                Aluno aluno = new Aluno(nome);
                turma.cadastrarAluno(aluno);

                System.out.println("Aluno cadastrado com sucesso!");

            } else if (opcao == 2) {

                turma.listarAlunos();

            } else if (opcao == 3) {

                if (turma.estaVazia() == true) {
                    System.out.println("Nenhum aluno cadastrado!");
                } else {

                    System.out.println("Para qual aluno você deseja adicionar uma nota?");
                    turma.listarAlunos();

                    int qualAluno = scanner.nextInt();
                    scanner.nextLine();

                    if (turma.existeAluno(qualAluno) == true) {

                        System.out.println("Quais são as 4 notas dele (a)? (Até 10,0)");

                        double nota1 = scanner.nextDouble();
                        scanner.nextLine();

                        if (nota1 > 10 || nota1 < 0) {
                            System.out.println("Erro! Nota INVÁLIDA");
                        } else {

                            double nota2 = scanner.nextDouble();
                            scanner.nextLine();

                            if (nota2 > 10 || nota2 < 0) {
                                System.out.println("Erro! Nota INVÁLIDA");
                            } else {

                                double nota3 = scanner.nextDouble();
                                scanner.nextLine();

                                if (nota3 > 10 || nota3 < 0) {
                                    System.out.println("Erro! Nota INVÁLIDA");
                                } else {

                                    double nota4 = scanner.nextDouble();
                                    scanner.nextLine();

                                    if (nota4 > 10 || nota4 < 0) {
                                        System.out.println("Erro! Nota INVÁLIDA");
                                    } else {

                                        ArrayList<Double> notas = new ArrayList<>();

                                        notas.add(nota1);
                                        notas.add(nota2);
                                        notas.add(nota3);
                                        notas.add(nota4);

                                        turma.adicionarNota(qualAluno, notas);
                                    }
                                }
                            }
                        }
                    } else {
                        System.out.println("Aluno não existe!");
                    }
                }

            } else if (opcao == 4) {

                if (turma.estaVazia() == true) {
                    System.out.println("Nenhum aluno cadastrado!");
                } else {

                    System.out.println("Para qual aluno você deseja calcular a média?");
                    turma.listarAlunos();

                    int alunoMedia = scanner.nextInt();
                    scanner.nextLine();

                    if (turma.existeAluno(alunoMedia) == true) {
                        turma.calcularMedia(alunoMedia);
                    } else {
                        System.out.println("Aluno não existe!");
                    }
                }

            } else if (opcao == 5) {

                if (turma.estaVazia() == true) {
                    System.out.println("Nenhum aluno cadastrado!");
                } else {

                    System.out.println("De qual aluno deseja ver o boletim?");
                    turma.listarAlunos();

                    int alunoBoletim = scanner.nextInt();
                    scanner.nextLine();

                    if (turma.existeAluno(alunoBoletim) == true) {
                        turma.verBoletim(alunoBoletim);
                    } else {
                        System.out.println("Aluno não existe!");
                    }
                }

            } else if (opcao == 6) {

                System.out.println("Qual aluno deseja remover?");
                turma.listarAlunos();

                int removerAluno = scanner.nextInt();
                scanner.nextLine();

                turma.removerAluno(removerAluno);

            } else if (opcao == 7) {

                System.out.println("Encerrando...");
            }
        }

        scanner.close();
    }
}
