package application;

import delete.ProductService;
import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class UsaServiceProduct {

    public static void main(String[] args) {
        ProductService ps = new ProductService();

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Mouse", 80.00));
        list.add(new Product("Fone", 70.00));
        list.add(new Product("Luminária", 50.00));

        /**
         * Desafio: criar um método que receba outro método
         * que realize a soma do preço de todos produtos que comecem com T
         */
        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');

        // Uma vantagem desse implementação, é que eu posso
        //usar a mesma função e mudar o filtro lambda
        //Ex:
        double sumPrice = ps.filteredSum(list, p -> p.getPrice() < 100.0);

        System.out.println("Sum = " + String.format("%.2f", sum));
        System.out.println("Sum < 100 = " + String.format("%.2f", sumPrice));

    }
}
