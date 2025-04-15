package ex2.application;

import ex2.entities.Aluno;
import ex2.entities.Curso;
import ex2.entities.Departamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno[] aluno = new Aluno[5];

        aluno[0] = new Aluno("Lucas Garcia", 202501057, 2025,
                new Curso("Ciencia da Computacao", "CC",
                        new Departamento("Instituto de Informatica", "INF")));

        int cont = 1;

        boolean loop = true;

        while (loop) {

            System.out.println("\nEscolha uma das opcoes:" +
                    "\n(1)Cadastrar aluno" +
                    "\n(2)Ver cadastro de aluno" +
                    "\n(3)Sair");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar aluno:");
                    System.out.println("Nome:");
                    String nomeAluno = sc.nextLine();
                    System.out.println("Matricula:");
                    int matriculaAluno = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ano:");
                    int anoAluno = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Curso: ");
                    String cursoAluno = sc.nextLine();
                    System.out.println("Sigla do Curso:");
                    String siglaCurso = sc.nextLine();
                    System.out.println("Departamento: ");
                    String departamentoCurso = sc.nextLine();
                    System.out.println("Sigla do Departamento: ");
                    String siglaDepartamento = sc.nextLine();

                    aluno[cont] = new Aluno(nomeAluno, matriculaAluno, anoAluno, new Curso(cursoAluno, siglaCurso, new Departamento(departamentoCurso, siglaDepartamento)));
                    cont++;
                    break;

                case 2:
                    System.out.println("Alunos cadastrados:");
                    for (Aluno aluno1 : aluno) {
                        if (aluno1 != null) {
                            System.out.println(aluno1.getNome());
                        }
                    }
                    System.out.println("Digite o nome do aluno:");
                    String nome = sc.nextLine();

                    int index = -1;
                    for (int i = 0; i < aluno.length; i++) {
                        if (aluno[i] != null && aluno[i].getNome().equals(nome)) {
                            System.out.println(aluno[i]);
                            index = i;
                        }
                    }

                    if (index == -1) {
                        System.out.println("Aluno nao encontrado");
                    } else {
                        System.out.println("\n(1)Alterar cadastro de aluno" +
                                "\n(2)Sair");
                        int opcao2 = sc.nextInt();
                        sc.nextLine();
                        switch (opcao2) {
                            case 1:
                                System.out.println("Motivo da alteracao:" +
                                        "\n(1)Transferencia interna/externa" +
                                        "\n(2)Cancelamento de curso");
                                int opcao3 = sc.nextInt();
                                sc.nextLine();
                                switch (opcao3) {
                                    case 1:
                                        System.out.println("Novo curso:");
                                        String nomeCurso = sc.nextLine();
                                        System.out.println("Sigla:");
                                        String sigla = sc.nextLine();
                                        System.out.println("Departamento:");
                                        String departamento = sc.nextLine();
                                        System.out.println("Sigla do Departamento:");
                                        siglaDepartamento = sc.nextLine();

                                        aluno[index].setCurso(new Curso(nomeCurso, sigla, new Departamento(departamento, siglaDepartamento)));
                                        System.out.println("Cadastro Atualizado\n" + aluno[index]);
                                        break;
                                    case 2:
                                        aluno[index] = null;
                                        System.out.println("Cadastro excluido com sucesso!");
                                        break;
                                }
                            case 2:
                                break;
                        }
                        break;
                    }
                    break;
                case 3:
                    loop = false;
                    break;
            }
        }
    }
}
