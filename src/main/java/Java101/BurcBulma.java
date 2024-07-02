package Java101;


import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum gününüzü girin: ");
        int day = scanner.nextInt();

        System.out.print("Doğum ayınızı girin: ");
        int month = scanner.nextInt();

            if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
                System.out.println("Koç");
            } else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
                System.out.println("Boğa");
            } else if ((month == 5 && day >= 22) || (month == 6 && day <= 22)) {
                System.out.println("İkizler");
            } else if ((month == 6 && day >= 23) || (month == 7 && day <= 22)) {
                System.out.println("Yengeç");
            } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
                System.out.println("Aslan");
            } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
                System.out.println("Başak");
            } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
                System.out.println("Terazi");
            } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
                System.out.println("Akrep");
            } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
                System.out.println("Yay");
            } else if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
                System.out.println("Oğlak");
            } else if ((month == 1 && day >= 22) || (month == 2 && day <= 19)) {
                System.out.println("Kova");
            } else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
                System.out.println("Balık");
            } else {
                System.out.println("Geçersiz tarih");
            }




    }
}
