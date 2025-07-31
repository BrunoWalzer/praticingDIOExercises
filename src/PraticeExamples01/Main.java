package PraticeExamples01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an item type to calculate tax:");
        System.out.println("1 - Food");
        System.out.println("2 - Clothing");
        System.out.println("3 - Health and Wellness");
        System.out.println("4 - Culture");

        while (true) {
            int opcao = scanner.nextInt();
            ItemsTypes tipo = ItemsTypes.fromCode(opcao);

            switch (tipo) {
                case FOOD:
                    double[] foodData = enterPriceAndTaxRate();
                    Food food = new Food(foodData[0], foodData[1]);
                    System.out.println("Food Tax: " + food.calculateTax(food.getTaxRate()));
                    break;
                case CLOTHING:
                    double[] clothingData = enterPriceAndTaxRate();
                    Clothing clothing = new Clothing(clothingData[0], clothingData[1]);
                    System.out.println("Clothing Tax: " + clothing.calculateTax(clothing.getTaxRate()));
                    break;
                case HEALTH_AND_WELLNESS:
                    double[] healthAndWellnessData = enterPriceAndTaxRate();
                    HealthAndWellness healthAndWellness = new HealthAndWellness(healthAndWellnessData[0], healthAndWellnessData[1]);
                    System.out.println("Health and Wellness Tax: " + healthAndWellness.calculateTax(healthAndWellness.getTaxRate()));
                    break;
                case CULTURE:
                    double[] cultureData = enterPriceAndTaxRate();
                    Culture culture = new Culture(cultureData[0], cultureData[1]);
                    System.out.println("Culture Tax: " + culture.calculateTax(culture.getTaxRate()));
                    break;
            }
        }
    }


    public static double[] enterPriceAndTaxRate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter tax rate:");
        double taxRate = scanner.nextDouble();
        System.out.println("Enter price:");
        double price = scanner.nextDouble();
        return new double[]{taxRate, price};
    }
}