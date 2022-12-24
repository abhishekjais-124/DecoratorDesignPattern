public class Main {
    public static void main(String[] args) {

        BasePizza pizza = new Mushroom(new VegDelight());
        System.out.println(pizza.cost());
    }
}