package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class InterfacePredicate {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Mouse", 80.00));
        list.add(new Product("Fone", 70.00));
        list.add(new Product("Luminária", 50.00));

        /**
         * Desafio: remover da minha lista de produtos,
         * todos os produtos que tiverem um preço maior que 100 reais
         */
        //Uma boa solução seria criar a função anônima diretamente
        /*list.removeIf(p -> p.getPrice() >= 100);
        */

        //1 - Implementação da interface
        //Outro jeito de fazer, nó poderiamos criar uma classe com a interface ao Predicate,
        //Fazendo o overide do método test, que é o único método abstrato da interface funcional
        //list.removeIf(new ProductPredicate());

        //2 - Reference method com método estático
        //Reference method com método não estático
        //Outra forma é criar um método na minha classe model de product,
        //e fazer referência ao metodo do tipo methodReference (nomeClass::nomeMethod)
        //list.removeIf(Product::staticProductPredicate);

        //3 - Reference method com método não estático
        //Outra forma é instancia um método não static na minha classe model e
        //e chamar ele por aqui, ou seja, o método vai mudar a instância
        //list.removeIf(Product::nonStaticProductPredicate);

        //4 - Expressão lambda declarada
        //Nosso quarto modo, é criar uma variavel Predicate, passando uma lambda para ela
        //Predicate<Product> pred = p -> p.getPrice() >= 100.0;
        //list.removeIf(pred);

        //5 - expressão lambda inline
        double min = 100.0;
        list.removeIf(p -> p.getPrice() >= min);

        for(Product p : list){
            System.out.println(p);
        }


    }
}
