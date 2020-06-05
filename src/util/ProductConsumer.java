package util;

import entities.Product;

import java.util.function.Consumer;

//PriceUpdate
public class ProductConsumer implements Consumer<Product> {

    /**
     * Aqui realizo importação do método
     * accept, ele apenas realiza uma ação, não retornando nada,
     * a modificação realizada é o aumento do preço em 10%
     * @param p
     */
    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
