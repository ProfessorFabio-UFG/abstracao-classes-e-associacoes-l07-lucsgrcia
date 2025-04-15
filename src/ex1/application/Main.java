package ex1.application;

import ex1.entities.Musica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Musica[] musica = new Musica[5];

        musica[0] = new Musica("Impressionando os Anjos", "Sertanejo", 2017);
        musica[0].adicionarCompositor("Gustavo Mioto", "Brasileiro");
        musica[1] = new Musica("Mockingbird", "Rap", 2004);
        musica[1].adicionarCompositor("Eminem", "Americano");

        int num = 2;

        boolean loop = true;
        while (loop) {
            System.out.println("Escolha uma das opções:" +
                    "\n(1) Cadastrar musica" +
                    "\n(2) Ver cadastro de musica" +
                    "\n(3) Sair");

            int opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Cadastrando Musica:");
                    System.out.println("Nome da musica:");
                    String nome = sc.nextLine();
                    System.out.println("Genero:");
                    String genero = sc.nextLine();
                    System.out.println("Ano:");
                    int ano = sc.nextInt();
                    System.out.println("Numero de compositores:");
                    int numCompositores = sc.nextInt();
                    sc.nextLine();


                    musica[num] = new Musica(nome, genero, ano);

                    for (int i = 0; i < numCompositores; i++) {
                        System.out.println("Nome:");
                        String nomeCompositor = sc.nextLine();
                        System.out.println("Nacionalidade:");
                        String nacionalidade = sc.nextLine();
                        musica[num].adicionarCompositor(nomeCompositor, nacionalidade);
                    }
                    num++;
                    break;
                case 2:
                    System.out.println("Ver cadastro de musica");
                    System.out.println("Nome da musica:");
                    nome = sc.nextLine();
                    for (int i = 0; i < musica.length; i++) {
                        if (musica[i] != null && musica[i].getNome().equals(nome)) {
                            System.out.println(musica[i].toString());
                        }

                    }
                    break;
                case 3:
                    loop = false;
                    break;

            }
        }
    }
}