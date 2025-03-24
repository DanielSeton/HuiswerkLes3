import org.w3c.dom.ls.LSOutput;

public class MeatballRecipe {

    Ingredient gehakt = new Ingredient(300, "gram", "gehaktballetjes (vega)");
    Ingredient pindakaas = new Ingredient(4, "eetlepels", "pindakaas");
    Ingredient ketjap = new Ingredient(3, "eetlepels", "ketjap");
    Ingredient sambal = new Ingredient(2, "theelepels", "sambal");
    Ingredient kokosmelk = new Ingredient(200, "ml", "kokosmelk");
    Ingredient limoensap = new Ingredient(2, "eetlepels", "limoensap");
    Ingredient sperziebonen = new Ingredient(600, "gram", "sperziebonen");
    Ingredient rijst = new Ingredient(300, "gram", "rijst");
    Ingredient pinda = new Ingredient(2, "eetlepels", "pinda's");
    Ingredient gebakkenui = new Ingredient(2, "eetlepels", "gebakken uitjes");
    Ingredient bosui = new Ingredient(2, "", "bosuien");

    public void printStappen(){
        System.out.println("- Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken.");
    }
}
