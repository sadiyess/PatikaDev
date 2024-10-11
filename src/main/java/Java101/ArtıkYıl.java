package Java101;

import java.util.Scanner;

public class ArtıkYıl {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yili giriniz");
        int year = scanner.nextInt();

        if (year %4 == 0 || year %400==0 ){
            System.out.println(year + "Artık yıldır");
        }else {
            System.out.println(year + "artık yıl degildir");
        }
    }
}
