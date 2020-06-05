package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class PrimeiraOrdem {

        public static int compareProducts(Product p1, Product p2) {
            return p1.getPrice().compareTo(p2.getPrice());
        }

        public static void main(String[] args) {
            List<Product> list = new ArrayList<>();
            list.add(new Product("TV", 900.00));
            list.add(new Product("Notebook", 1200.00));
            list.add(new Product("Tablet", 450.00));
            /**
             * Funções de primeira ordem ou primeira classe,
             * são quando um função é objeto de primeira classe
             * ou primeira ordem, ou seja, significa que ele pode
             * ser passado como objeto dentro de um método
             * No exemplo abaixo podemos ver a sintaxe do java, fazendo referência
             * a classe::método (PrimeiraOrdem::compareProducts), método esse que
             * acontece a implementação do compareProducts via preço.
             */
            list.sort(PrimeiraOrdem::compareProducts);
            list.forEach(System.out::println);
        }

}
