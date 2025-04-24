package de.bsohef;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float Tankinhalt = 0;
        float Verbrauch = 0;
        float ValueKilometers= 0;
        float PricePerLiter = 0;

        Scanner listener = new Scanner(System.in);

        float tankinhalt = -1;

        while (tankinhalt < 0){
            System.out.println("Tankinhalt in Liter angeben:");
            tankinhalt = listener.nextFloat();
        }

        float verbrauch = -1;

        while (verbrauch < 0){
            System.out.println("Der Verbrauch pro 100 km");
            verbrauch =  listener.nextFloat();
        }

        float gefahreneKilometer = -1;

        while (gefahreneKilometer < 0) {
            System.out.println("Anzahl der gefahrenen Kilometer");
            gefahreneKilometer = listener.nextFloat();
        }

        float preisProLiter = -1;
        while (preisProLiter < 0) {
            System.out.println("Preis pro Liter Benzin");
            preisProLiter = listener.nextFloat();
        }

        float restlicherTankinhalt = tankinhalt - (verbrauch * gefahreneKilometer/100);
        System.out.println("Der restliche Tankinhalt beträgt: " + restlicherTankinhalt);

        if (restlicherTankinhalt < 0){
            System.out.println("Der Tankinhalt reicht nicht aus");
        }

        float fahrtKosten = preisProLiter * (verbrauch * gefahreneKilometer/100);
        System.out.println("Die Fahrtkosten betragen: " + fahrtKosten);

    }
}
