public class ListaNomes {
    private String genero;
    private String nome;
    public ListaNomes(String genero, String nome) {
        this.genero = genero;
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
