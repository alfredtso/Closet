import java.time.LocalDate;

public class Items extends Stuff{

    private double price;
    private LocalDate purchaseDay;
    private String description;
    private Wardrobe type;

    public Items(String description, double price, int year, int month, int day)
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

    public Wardrobe getType() {
        return type;
    }

    public void setType(Wardrobe type) {
        this.type = type;
    }

    public String toString() {
        return getClass().getName() + "\n"
                +"Id: " + getId()+ "\n"
                +"Type: " + getType()+ "\n"
                +"Purchased at: " + getPurchaseDay();
    }
}
