import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("cuantos 10 centavos tienes?");
        Scanner scanner = new Scanner(System.in);
        double diezCentavos = scanner.nextDouble();
        System.out.println("cuantos 20 centavos tienes?");
        double veinteCentavos = scanner.nextDouble();
        System.out.println("Cuantos 50 centavos tienes?");
        double cincuentaCentavos = scanner.nextDouble();
        scanner.close();
        String monedasDiez = "";
        String monedasVeinte = "";
        String monedasCincuenta = "";

        double total = (diezCentavos * 10) + (veinteCentavos * 20) + (cincuentaCentavos * 50);
        if (total == 100) {
            System.out.println("Ganaste tienes un peso, "+ (int)total+" Centavos");
        } else {
            if (total < 100) {
                System.out.println("Necesitas mas monedas, te falta: " + (int) (100 - total) + " centavos para completar el peso");
            } else {
                if (diezCentavos > 10)
                {
                     monedasDiez = "tienes"+((int)diezCentavos - 10) + " monedas en exceso de 10 centavos";
                }
                if (veinteCentavos > 5)
                {
                     monedasVeinte = "tienes"+((int)veinteCentavos - 5) + " monedas en exceso de 20 centavos";
                }
                if (cincuentaCentavos > 2)
                {
                     monedasCincuenta = "tienes"+((int)cincuentaCentavos - 2) + " monedas en exceso de 50 centavos";
                }
                System.out.println("Tienes mas que un Boliviano, tienes: "+(int)(total -100)+"\n"+" y tienes mas monedas"+"\n"+ monedasDiez +"\n"+monedasVeinte +"\n"+monedasCincuenta);
            }
        }
    }
}
