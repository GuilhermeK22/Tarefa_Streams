import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teste {
    public static void main(String[] args) {
        List<ListaPessoas> lista = new ListaPessoas().listaPessoas();
        System.out.println("Lista de nomes do genêro Feminino\n");
        Stream<ListaPessoas> pessoasGenFeminino = lista.stream()
                .filter(listaPessoas -> listaPessoas.getGenero().startsWith("F"));
        pessoasGenFeminino.forEach(listaPessoas -> System.out.println(listaPessoas));
    }
}
