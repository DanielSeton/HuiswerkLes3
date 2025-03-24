public class Ingredient {
    private double amount;
    private String unit;
    private String name;

    public Ingredient(){
        this.amount = 0;
        this.unit = "";
        this.name = "";
    }

    public Ingredient(double amount, String unit, String name){
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printIngredient(){
        double amountCheck = this.amount * 10;

        if (amountCheck %10 == 0){
            System.out.println((int)this.amount + " " + this.unit + " " + this.name);
        }
        else {
            System.out.println(this.amount + " " + this.unit + " " + this.name);
        }
    }
}
