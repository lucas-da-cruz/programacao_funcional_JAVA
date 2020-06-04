package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        /**
         * Definindo um objeto do tipo Comparator<Product>
         * Implementando uma classe anônima
         * Aqui preciso definir qual é a regra que ele vai realizar essa ordenação
         * No exemplo abaixo estamos ordenando via o nome de cada product da lista, de forma
         * alfabetica
         */
        /*Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };
        list.sort(comp);*/

        /**
         * Apesar de ser funcional, o exemplo de cima é
         * algo muito verboso, a solução correta é criar uma solução LAMBDA
         * Criando uma função anônima(ArrowFunction)
         * Não preciso declarar o tio do meu objeto
         */
        /*Comparator<Product> comp = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };
        //or
        //Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        list.sort(comp);
        */

        /**
         * Simplicando tudo em uma única linha
         */
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
