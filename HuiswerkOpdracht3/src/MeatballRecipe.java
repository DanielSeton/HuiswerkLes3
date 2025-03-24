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
        System.out.println("- Kruid het gehakt eventueel met wat peper, zout en kruiden naar smaak en draai kleine balletjes.");
        System.out.println("- Verhit een koekenpan met een klein beetje olie en bak de balletjes rondom bruin en net gaar. Haal ze uit de pan en zet apart.");
        System.out.println("- Kook ondertussen de rijst volgens de aanwijzingen op de verpakking. Giet af en laat even rusten met de deksel op de pan. Breng een pan met water aan de kook en kook de sperziebonen ca 7 a 8 minuten beetgaar. Giet af.");
        System.out.println("- Doe de pindakaas, ketjap, sambal (naar smaak) en kokosmelk in dezelfde pan en verwarm al roerend tot een gladde saus. Voeg het limoensap toe en ook eventueel wat water als de pindasaus te dik is. Breng de saus op smaak met een snufje zout.");
        System.out.println("- Leg de balletjes terug in de pindasaus en laat ze 5 minuten zachtjes pruttelen zodat de smaken goed intrekken.");
        System.out.println("- Verdeel de rijst over borden en leg de sperziebonen en balletjes in pindasaus erbij. Garneer alles met pinda’s, fijngesneden bosui, gebakken uitjes en eventueel wat extra dunne plakjes rode peper.");
    }

    public void printIngredients() {
        gehakt.printIngredient();
        pindakaas.printIngredient();
        ketjap.printIngredient();
        sambal.printIngredient();
        kokosmelk.printIngredient();
        limoensap.printIngredient();
        sperziebonen.printIngredient();
        rijst.printIngredient();
        pinda.printIngredient();
        gebakkenui.printIngredient();
        bosui.printIngredient();
    }
}
