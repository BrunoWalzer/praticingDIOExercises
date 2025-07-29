package PraticeExamples01;

public record HealthAndWellness(double taxRate, double price) implements TaxMethods {

    @Override
    public double calculateTax(double taxRate) {
        return price - ((taxRate / 100) * price);
    }

    public double getPrice() {
        return price;
    }

    public double getTaxRate() {
        return taxRate;
    }
}
