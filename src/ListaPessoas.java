import java.util.List;
import java.util.Objects;

public class ListaPessoas {
    private String genero;
    private String nome;
    public ListaPessoas() {

    }

    public ListaPessoas(String genero, String nome) {
        this.genero = genero;
        this.nome = nome;
    }
    public ListaPessoas(ListaPessoas pessoas) {
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

    public List<ListaPessoas> listaPessoas() {
        ListaPessoas pessoa1 = new ListaPessoas("M", "João");
        ListaPessoas pessoa2 = new ListaPessoas("M", "Antonio");
        ListaPessoas pessoa3 = new ListaPessoas("F", "Lúcia");
        ListaPessoas pessoa4 = new ListaPessoas("M", "Pedro");
        ListaPessoas pessoa5 = new ListaPessoas("M", "Mateus");
        ListaPessoas pessoa6 = new ListaPessoas("F", "Ana");
        ListaPessoas pessoa7 = new ListaPessoas("F", "Sabrina");
        ListaPessoas pessoa8 = new ListaPessoas("M", "Guto");
        ListaPessoas pessoa9 = new ListaPessoas("M", "Ricardo");
        ListaPessoas pessoa10 = new ListaPessoas("F", "Maria");
        ListaPessoas pessoa11 = new ListaPessoas("M", "Diego");
        ListaPessoas pessoa12 = new ListaPessoas("F", "Renata");
        ListaPessoas pessoa13 = new ListaPessoas("F", "Vera");
        ListaPessoas pessoa14 = new ListaPessoas("F", "Carla");
        ListaPessoas pessoa15 = new ListaPessoas("F", "Aline");
        ListaPessoas pessoa17 = new ListaPessoas("F", "Carol");

        return List.of(pessoa1,pessoa2,pessoa3,pessoa4,pessoa5,pessoa6,pessoa7,pessoa8,pessoa9,pessoa10,pessoa11,pessoa12,pessoa13,pessoa14,pessoa15,pessoa17);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListaPessoas that = (ListaPessoas) o;
        return Objects.equals(genero, that.genero) && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genero, nome);
    }

    @Override
    public String toString() {
        return "ListaPessoas{" +
                "genero='" + genero + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
