public class FurnitureItemImpl {
    public static void main(String[] args) {

        //here is the declaration
        FurnitureItem obj;
        //here is the initialization
        obj = new FurnitureItem();

        System.out.println("obj.furnitureType = " + obj.furnitureType);
        System.out.println("obj.furnitureCode = " + obj.furnitureCode);
        System.out.println("obj.furnitureGrade = " + obj.furnitureGrade);
        System.out.println("obj.furnitureUsage = " + obj.furnitureUsage);
        System.out.println("obj.color = " + obj.color);
        System.out.println("Main price = " + obj.price);
        double afterDiscountbill = obj.calculateDiscount(5);
        System.out.println("After Discount bill = " + afterDiscountbill);
    }
}
