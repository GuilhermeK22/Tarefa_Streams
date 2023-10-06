import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<ListaNomes> pessoa = new ArrayList<>();
        pessoa.add(new ListaNomes("M", "João"));
        pessoa.add(new ListaNomes("M", "Antonio"));
        pessoa.add(new ListaNomes("F", "Lúcia"));
        pessoa.add(new ListaNomes("M", "Pedro"));
        pessoa.add(new ListaNomes("M", "Mateus"));
        pessoa.add(new ListaNomes("F", "Ana"));
        pessoa.add(new ListaNomes("F","Sabrina"));
        pessoa.add(new ListaNomes("M", "Guto"));
        pessoa.add(new ListaNomes("M","Ricardo"));
        pessoa.add(new ListaNomes("F","Maria"));
        pessoa.add(new ListaNomes("M","Diego"));
        pessoa.add(new ListaNomes("F","Renata"));
        pessoa.add(new ListaNomes("M","Sabino"));
        pessoa.add(new ListaNomes("F","Vera"));
        pessoa.add(new ListaNomes("M","Rui"));
        pessoa.add(new ListaNomes("F","Carla"));
        pessoa.add(new ListaNomes("F","Aline"));
        pessoa.add(new ListaNomes("F","Jaqueline"));
        pessoa.add(new ListaNomes("F","Duda"));

        List<ListaNomes> m = pessoa.stream()
                .filter(listaNomes -> listaNomes.getGenero().equals("F"))
                .collect(Collectors.toList());
        m.forEach(listaNomes -> System.out.println(listaNomes.getNome()));
    }
}
