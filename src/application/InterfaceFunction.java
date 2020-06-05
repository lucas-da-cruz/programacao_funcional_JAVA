package application;

import entities.Product;
import util.ProductFunctionUpperCase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterfaceFunction {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Mouse", 80.00));
        list.add(new Product("Fone", 70.00));
        list.add(new Product("Luminária", 50.00));

        /**
         * Desafio: realizar um programa que, a partir da implementação do
         * que retorno a partir de interface Function, os nomes dos produtos em maisculo
         */

        /**
         *Conceitos importantes:
         *  O que é map? é uma função que recebe e aplica uma função a cada elemento da lista, porém a função map
         * não funciona a partir de uma lista, apenas a partir de uma stream()
         * O que é uma stream()? é uma sequência de dados
         * Para converter uma lista para strem, você precisa chamar o método .stream()
         * Para converter um stream para lista, você precisa chamar o método .collect.(Collectors.toList())
         */

        /**
         * 1 - Implementação da interface
         */
        //List<String> nomeCaixaAlta = list.stream().map(new ProductFunctionUpperCase()).collect(Collectors.toList());

        /**
         * 2 - Reference method com método estático
         */
        //List<String> nomeCaixaAlta = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());


        /**
         * 3 - Reference method com método não estático
         */
        //List<String> nomeCaixaAlta = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        /**
         * 4 - expressão lambda declarada
         */
        //Function<Product, String> func = p -> p.getName().toUpperCase();
        //List<String> nomeCaixaAlta = list.stream().map(func).collect(Collectors.toList());

        /**
         * 5 - Expressão lambda inline
         */
        List<String> nomeCaixaAlta = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        nomeCaixaAlta.forEach(System.out::println);
    }
}
