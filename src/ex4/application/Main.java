package ex4.application;

import ex4.entities.Endereco;
import ex4.entities.Empregado;
import ex4.entities.Empresa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Empregado[] empregado = new Empregado[15];
        Empresa[] empresa = new Empresa[5];

        Endereco enderecoEmpresa = new Endereco("Rua 2", "Setor Central", "Qd 11 Lt 20 Sala 5", "Goiania", "GO", 0);
        empresa[0] = new Empresa("15.234.0001-83", "Logitech", enderecoEmpresa);

        Endereco enderecoEmpregado = new Endereco("Rua das Acacias", "Goiania 2", "Qd 53 Lt 15", "Goiania", "GO", 10);
        empregado[0] = new Empregado("Lucas Garcia", 255, enderecoEmpregado, empresa[0]);

        boolean loop = true;
        int contadorEmpregado = 1, contadorEmpresa = 1;
        while (loop) {

            System.out.println("\n1 - Cadastrar empresa");
            System.out.println("2 - Cadastrar empregado na empresa" +
                    "\n3 - Visualizar empresas" +
                    "\n4 - Visualizar empregados" +
                    "\n5 - Sair");

            switch (sc.nextInt()) {
                case 1:
                    sc.nextLine();
                    System.out.println("Nome:");
                    String empresaNome = sc.nextLine();
                    System.out.println("CNPJ:");
                    String cnpj = sc.nextLine();
                    System.out.println("Endereco Empresarial");
                    System.out.println("Rua:");
                    String ruaEmp = sc.nextLine();
                    System.out.println("Bairro:");
                    String bairroEmp = sc.nextLine();
                    System.out.println("Complemento:");
                    String complementoEmp = sc.nextLine();
                    System.out.println("Numero:");
                    int numeroEmp = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Cidade:");
                    String cidadeEmp = sc.nextLine();
                    System.out.println("Estado:");
                    String estadoEmp = sc.nextLine();

                    empresa[contadorEmpresa] = new Empresa(cnpj, empresaNome, new Endereco(ruaEmp, bairroEmp, complementoEmp, cidadeEmp, estadoEmp, numeroEmp));
                    contadorEmpresa++;
                    break;
                case 2:
                    int contador = 1;

                    System.out.println("Em qual empresa deseja fazer o cadastro?");
                    for (Empresa e : empresa) {
                        if (e != null) {
                            System.out.println(contador + " " + e.getRazao());
                            contador++;
                        }
                    }
                    int np = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Qual a quantidade de funcionarios que serao cadastrados?");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < quantidade; i++) {
                        System.out.println("Nome:");
                        String nome = sc.nextLine();
                        System.out.println("Matricula:");
                        int matricula = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Endereco:");
                        System.out.println("Rua:");
                        String rua = sc.nextLine();
                        System.out.println("Bairro:");
                        String bairro = sc.nextLine();
                        System.out.println("Complemento:");
                        String complemento = sc.nextLine();
                        System.out.println("Numero:");
                        int numero = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Cidade:");
                        String cidade = sc.nextLine();
                        System.out.println("Estado:");
                        String estado = sc.nextLine();

                        Endereco endereco = new Endereco(rua, bairro, complemento, cidade, estado, numero);
                        empregado[contadorEmpregado] = new Empregado(nome, matricula, endereco, empresa[contadorEmpresa]);
                        contadorEmpregado++;

                    }
                    System.out.println("Empregados cadastrados com sucesso!");

                    break;
                case 3:
                    contador = 1;
                    for (Empresa e : empresa) {
                        if (e != null) {
                            System.out.println("\n" + contador + " - " + e);
                            contador++;
                        }
                    }
                    break;
                case 4:
                    contador = 1;
                    for (Empregado e : empregado) {
                        if (e != null) {
                            System.out.println("\n" + contador + " - " + e.toString());
                            contador++;
                        }
                    }
                    break;
                default:
                    loop = false;
                    break;
            }
        }
    }
}
