package Java101;

import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        // Kullanıcıdan mesafe, yaş ve yolculuk tipini alalım
        System.out.print("Please, enter distance: ");
        int distance = user.nextInt();

        System.out.print("Please, enter your age ");
        int age = user.nextInt();

        System.out.print("Please, enter your triptype(1: one trip, 2: round trip) ");
        int triptype =user.nextInt();

        //verilerin degerlerini kontrol ederiz
        if (distance <= 0 || age <= 0 || (triptype != 1 && triptype != 2)){
            System.out.println("Hatalı Veri Girdiniz !");
        }else {
            double unitprice = 0.10;
            double price = distance *0.10;

            if (age < 12){
                price *= 0.50;
            } else if (age >= 12  &&  age <=24) {
                price *=0.9;
            } else if (age >= 65 ){
                price *=0.7;
            }
             if (triptype == 2){
                 price *=0.8;
             }
            System.out.println (price);

        }
        user.close();

    }
}
