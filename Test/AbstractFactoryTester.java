package AbstractFactory_Pattern;

public class AbstractFactoryTester {
    public static void main(String[] args) throws Exception {

        abstractFactory factory1 =FactoryProducer.getFactory(false);
        factoriesProduct product1 = factory1.getProducts("table");
        product1.printProduct();
        factoriesProduct product2 = factory1.getProducts("tv");
        product2.printProduct();

        abstractFactory factory2 =FactoryProducer.getFactory(true);
        factoriesProduct product3 = factory2.getProducts("table");
        product3.printProduct();
        factoriesProduct product4 = factory2.getProducts("tv");
        product4.printProduct();

    }

}
