package ex1.entities;

public class Musica {

    private String nome, tipo;
    private int ano, contador = 0;
    private Compositor[] compositores;

    public Musica(String nome, String tipo, int ano) {
        this.nome = nome;
        this.tipo = tipo;
        this.ano = ano;
        compositores = new Compositor[5];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Compositor[] getCompositores() {
        return compositores;
    }

    public void adicionarCompositor(String nome, String nacionalidade) {
        compositores[contador] = new Compositor(nome, nacionalidade);
        contador++;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Música: ").append(nome).append(" (").append(ano).append(") - ").append(tipo).append("\n");
        sb.append("Compositor(es):");

        for (Compositor c : compositores) {
            if (c != null) {
                sb.append(c.toString());
            }
        }

        return sb.toString();
    }
}
