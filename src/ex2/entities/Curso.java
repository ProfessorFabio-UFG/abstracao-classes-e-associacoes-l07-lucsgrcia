package ex2.entities;

public class Curso {

    private String nome, sigla;
    private Departamento depto;

    public Curso(String nome, String sigla, Departamento depto) {
        this.nome = nome;
        this.sigla = sigla;
        this.depto = depto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Departamento getDepto() {
        return depto;
    }

    public void setDepto(Departamento depto) {
        this.depto = depto;
    }

    @Override
    public String toString() {
        return nome + " (" + sigla + ")" + "\nDepartamento: " + depto;
    }
}
