package ex4.entities;

public class Empregado {

    private String nome;
    private int matricula;
    private Endereco endereco;
    private Empresa empresa;

    public Empregado(String nome, int matricula, Endereco endereco, Empresa empresa) {
        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;
        this.empresa = empresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                " ("+ matricula + ")" +
                "\nEndereco: " + endereco +
                "\nEmpresa: \n" + empresa;
    }
}
