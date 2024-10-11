package Java101;

import java.util.Scanner;

public class ÇinZodyagı {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen dogum yılınızı giriniz");
        int tarih = scanner.nextInt();
        switch (tarih % 12)
        {
            case 0:
                System.out.print("Zodyak Burcunuz:Maymun");
                break;
            case 1:
                System.out.print("Zodyak Burcunuz:Horoz");
                break;
            case 2:
                System.out.print("Zodyak Burcunuz:Köpek");
                break;
            case 3:
                System.out.print("Zodyak Burcunuz:Domuz");
                break;
            case 4:
                System.out.print("Zodyak Burcunuz:Fare");
                break;
            case 5:
                System.out.print("Zodyak Burcunuz:Öküz");
                break;
            case 6:
                System.out.print("Zodyak Burcunuz:Kaplan");
                break;
            case 7:
                System.out.print("Zodyak Burcunuz:Tavşan");
                break;
            case 8:
                System.out.print("Zodyak Burcunuz:Ejderha");
                break;
            case 9:
                System.out.print("Zodyak Burcunuz:Yılan");
                break;
            case 10:
                System.out.print("Zodyak Burcunuz:At");
                break;
            case 11:
                System.out.print("Zodyak Burcunuz:Koyun");
                break;
            default:
                System.out.print("Hatalı girdiniz.");
                break;
        }
    }
}
