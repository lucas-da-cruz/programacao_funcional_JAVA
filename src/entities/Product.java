package entities;

public class Product {

    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static boolean staticProductPredicate(Product p){
        return p.getPrice() >= 100;
    }

    //Mesmo método que o de cima, porém esse é um não static,
    //ou seja, não conseguimos fazer ele ser receber um objeto diretamente
    //Método da instância
    public boolean nonStaticProductPredicate(){
        return price >= 100;
    }

    public static void staticPriceUpdate(Product p){
        p.setPrice(p.getPrice() * 1.1);
    }

    public void nonStaticPriceUpdate(){
        setPrice(getPrice() * 1.1);
        //Ou poderia ser
        //price = price * 1.1;
    }

    public static String staticUpperCaseName(Product p){
        return p.getName().toUpperCase();
    }

    public String nonStaticUpperCaseName(){
        return getName().toUpperCase();
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
}
