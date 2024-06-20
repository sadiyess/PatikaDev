package Java101;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        Scanner UserLogin = new Scanner(System.in);

        String correctPassword = "j1j2j3";

        System.out.println("Please,login password");
        String userPassword = UserLogin.nextLine();

        if ( !userPassword.equals(correctPassword)){
            System.out.println("Password is incorrect.Do you want to create a new password?");
            String answer = UserLogin.nextLine();

            if (answer.equalsIgnoreCase("Yes")) {
                System.out.print("Please, new password entry : ");
                String newPassword = UserLogin.nextLine();

                if (newPassword.equals(correctPassword)){
                    System.out.println("Password could not be created");
                }else {
                    System.out.println("Password created");
                    correctPassword = newPassword ;
                }
            }if (answer.equalsIgnoreCase("No")) {
                System.out.println("Password could not new password");
            }
        }if (userPassword.equals(correctPassword)){
            System.out.println("Password is correct");
        }
    }
}
