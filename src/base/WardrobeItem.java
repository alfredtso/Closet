package base;

import factory.SimpleWardrobeFactory;

import java.time.LocalDate;
/* TODO
- Scan receipt and get price, purchase day, description and thus type
 */
public class WardrobeItem extends Stuff{

    public enum WardrobeItemType {
        DRESS, SHORTS, BLAZER, SHOES
    }

    private double price;
    private LocalDate purchaseDay;
    private String description;
    private WardrobeItemType type;

    public WardrobeItem(String description, double price, int year, int month, int day)
    {
        super();
        this.description = description;
        this.price = price;
        this.purchaseDay = LocalDate.of(year, month, day);
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getPurchaseDay() {
        return purchaseDay;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPurchaseDay(LocalDate purchaseDay) {
        this.purchaseDay = purchaseDay;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WardrobeItemType getType() {
        return type;
    }

    public void setType(WardrobeItemType type) {
        this.type = type;
    }

    public String toString() {
        return getClass().getName() + "\n"
                +"Id: " + getUuid()+ "\n"
                +"Type: " + getType()+ "\n"
                +"Purchased at: " + getPurchaseDay();
    }

    public static void main(String[] args) {
        SimpleWardrobeFactory factory = new SimpleWardrobeFactory();
        WardrobeItem dress = factory.createWardrobeItem(WardrobeItemType.DRESS, "Black",
                500, 2021, 3, 8, "M");
        System.out.println(dress.getDescription());
        System.out.println(dress.getUuid());
    }
}
