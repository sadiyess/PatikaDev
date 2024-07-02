package Java101;

import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int heat;
        heat = input.nextInt();

        if(heat < 5){
            System.out.println("Kayak yapabilirsin");
        } else if (heat>= 5 && heat<=25) {
            if (heat<=15){
                System.out.println("Sinemaya gidebilirsin");
            }if (heat>=10){
                System.out.println("Pikniğe gidebilirsiniz");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }

    }
}
