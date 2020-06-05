package util;

import entities.Product;

import java.util.function.Function;

public class ProductFunctionUpperCase implements Function<Product, String> {
//Functions recebe dois parâmetros, o objeto product(O que ele vai receber) e
//O que será retornado, a string


    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
