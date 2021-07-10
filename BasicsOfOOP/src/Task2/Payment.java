package Task2;

public class Payment {

    Product [] products;

    Payment(Product [] products){

        this.products = products;
    }

    void productNames(Product [] products){

        System.out.println("Names of products: ");

        for (int i = 0; i < products.length; i++){
            System.out.println(products[i].productName);

        }

    }

    void productPrices(Product [] products){

        System.out.println("Prices of products: ");

        for (int i = 0; i < products.length; i++){

            System.out.println(products[i].productPrice);

        }
    }

    public String toString(){

        return "Count of products: " + products.length;
    }

    static class Product{

       private String productName;
       private double productPrice;

        Product(String productName, double productPrice){
           this.productName = productName;
           this.productPrice = productPrice;
        }
    }

    public static void main(String[] args) {
        Payment payment = new Payment(new Product[]{new Product("Solt", 1.2),
                new Product("Soap", 0.99),
                new Product("Bread", 1.08)});
        System.out.println(payment.toString());
        payment.productNames(payment.products);
        payment.productPrices(payment.products);
    }

}
