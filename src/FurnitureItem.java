public class FurnitureItem {
    int furnitureCode;
    String furnitureType;
    char furnitureGrade;
    String color;
    String furnitureUsage;
    double price;

    FurnitureItem() {
        furnitureCode = 210;
        furnitureType = "Chairs";
        furnitureGrade = 'A';
        color = "Red";
        furnitureUsage = "Outdoor";
        price = 500;
    }

    double calculateDiscount(double discount) {
        double discountPaidAmount = 0.0;
        if (furnitureUsage.equals("Outdoor")) {
            discountPaidAmount = price - (price * discount) / 100;
        }
        return discountPaidAmount;
    }
}
