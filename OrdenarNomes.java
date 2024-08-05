import java.util.Collections;
import java.util.List;

public class OrdenarNomes {

    private List<String> nomes;

    public OrdenarNomes(List<String> nomes) {
        this.nomes = nomes;
    }

    public void ordenarNomes() {
        Collections.sort(nomes);
    }

    public void exibirNomesOrdenados() {
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
