import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kies een recept: \n1. Appeltaart \n2. Gehaktballen");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                applePie();
                break;
            case 2:
                meatBall();
                break;
            default:
        }
    }

    public static void applePie(){
        ApplePieRecipe recept = new ApplePieRecipe();
        recept.printIngredients();
        recept.printStappen();
    }

    public static void meatBall(){
        MeatballRecipe ballrecept = new MeatballRecipe();
        ballrecept.printIngredients();
        ballrecept.printStappen();
    }

}
