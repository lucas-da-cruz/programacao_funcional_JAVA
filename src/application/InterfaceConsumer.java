package application;

import entities.Product;
import util.ProductConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class InterfaceConsumer {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Mouse", 80.00));
        list.add(new Product("Fone", 70.00));
        list.add(new Product("Luminária", 50.00));

        /**
         * Desafio: realizar um programa que, a partir de uma lista de produtos,
         * aumente o preço dos produtos em 10%
         */

        /**
         * 1 - implementação da interface
         * Método que vai percorrer cada item da list, recebendo um
         * um consumer como argumento, ou seja, ela vai aplicar o a classe
         * product consumer a cada elemento da lista
         */
        //list.forEach(new ProductConsumer());

        //2 - Reference method com método estáatico
        //list.forEach(Product::staticPriceUpdate);

        //3 - Reference method com método não estático
        //list.forEach(Product::nonStaticPriceUpdate);

        //4 - expressão lambda declarada
        double factor = 1.1;
        /*Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * factor);
        };
        list.forEach(cons);*/

        //5 - Expressão lambda inline
        list.forEach(p -> p.setPrice(p.getPrice() * factor));

        /**
         * Para imprimir os products, eu vou utilizar tbm o método forEach
         * para imprimir, fazendo uma reference method ao método println da classe
         * System.out
         */
        list.forEach(System.out::println);
    }



}
