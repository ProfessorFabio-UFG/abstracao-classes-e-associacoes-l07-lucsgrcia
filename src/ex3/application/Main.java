package ex3.application;

import java.util.Scanner;

import ex3.entities.Cliente;
import ex3.entities.Endereco;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cliente[] cliente = new Cliente[5];

        cliente[0] = new Cliente("Lucas Garcia", "111333222", new Endereco("das Acacias", "Goiania 2", "Qd 54 Lt 11 C4", "Goiania", "GO", 0));
        cliente[1] = new Cliente("Joao Gabriel", "238748234", new Endereco("R1", "Bairro 2", "Quadra 3 Lote 4", "Goiania", "GO", 21));

        boolean loop = true;
        int cont = 2;

        while (loop) {

            System.out.println("\nDigite a opcao que deseja:" +
                    "\n(1) Cadastrar um Cliente" +
                    "\n(2) Ver cadastro do Cliente" +
                    "\n(3) Sair");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Cadastro de Cliente");
                    System.out.println("Nome: ");
                    String nome = sc.nextLine();
                    System.out.println("CPF: ");
                    String cpf = sc.nextLine();
                    System.out.println("Rua: ");
                    String rua = sc.nextLine();
                    System.out.println("Bairro: ");
                    String bairro = sc.nextLine();
                    System.out.println("Complemento: ");
                    String comp = sc.nextLine();
                    System.out.println("Numero: ");
                    int num = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Cidade: ");
                    String cidade = sc.nextLine();
                    System.out.println("Estado: ");
                    String estado = sc.nextLine();

                    cliente[cont] = new Cliente(nome, cpf, new Endereco(rua, bairro, comp, cidade, estado, num));
                    cont++;
                    break;

                case 2:
                    System.out.println("Selecione o cliente:");

                    for (int i = 0; i < cliente.length; i++) {
                        if (cliente[i] != null) {
                            System.out.println("(" + (i + 1) + ")" + " " + cliente[i].getNome());
                        }
                    }

                    int numC = sc.nextInt();
                    sc.nextLine();

                    System.out.println(cliente[numC - 1]);
                    break;

                case 3:
                    loop = false;
                    break;
            }
        }
    }
}

