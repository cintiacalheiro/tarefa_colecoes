/**
 * @author cintia
 */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String dados = "Ana Paula-Feminino, Dolores-Feminino, Alexandre-Masculino, Claudia-Feminino";

        List<String> nomesFemininos = new ArrayList<>();
        List<String> nomesMasculinos = new ArrayList<>();

        String[] entradas = dados.split(",\\s*");

        for (String entrada : entradas) {
            String[] partes = entrada.split("-");
            if (partes.length == 2) {
                String nome = partes[0];
                String genero = partes[1];
                if (genero.equalsIgnoreCase("Feminino")) {
                    nomesFemininos.add(nome);
                } else if (genero.equalsIgnoreCase("Masculino")) {
                    nomesMasculinos.add(nome);
                }
            }
        }

        OrdenarNomes ordenadorFeminino = new OrdenarNomes(nomesFemininos);
        OrdenarNomes ordenadorMasculino = new OrdenarNomes(nomesMasculinos);

        ordenadorFeminino.ordenarNomes();
        System.out.println("Nomes femininos ordenados em ordem alfabética:");
        ordenadorFeminino.exibirNomesOrdenados();

        ordenadorMasculino.ordenarNomes();
        System.out.println("Nomes masculinos ordenados em ordem alfabética:");
        ordenadorMasculino.exibirNomesOrdenados();
    }
}
