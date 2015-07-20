package chapter_1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Found chicago? " + Cities.findCityImperative("Chicago"));
        System.out.println("Found chicago? " + Cities.findCityDeclarative("Chicago"));

        System.out.println("Total of discounted prices: " + Discount.discountOver20Imperative());
        System.out.println("Total of discounted prices: " + Discount.discountOver20Declarative());
    }
}
