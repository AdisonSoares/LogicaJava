package br.geekuniversity.secao21;
import java.util.LinkedList;
import java.util.List;

/**
 * @LinkedList
 */
public class Programa58 {
    public static void main(String[] args) {
        List<String> lista = new LinkedList<String>();
        System.out.println(lista.size());

        lista.add("Jose");
        lista.add("Marcos");
        System.out.println(lista);

        lista.add(0, "Maria");
        System.out.println(lista);
    }
}
