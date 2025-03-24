public class Ingredient {
    private Integer amount;
    private String unit;
    private String name;

    public Ingredient(){
        this.amount = 0;
        this.unit = "";
        this.name = "";
    }

    public Ingredient(int amount, String unit, String name){
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
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
}
