package assignments;

import java.util.Scanner;


public class atmPin {
    
    public static void main(String[] args) 
    {
        final String PASSWORD = "1234";
        Scanner sc = new Scanner(System.in);
        int attempts = 3;
        String password = "";
        while (attempts-- > 0 && !PASSWORD.equals(password)) //compares and then decrements
        {
            System.out.print("Enter your password: ");
            password = sc.nextLine();
            if (password.equals(PASSWORD)) 
                System.out.println("Welcome");
            else
                System.out.println("Incorrect. Number of attempts remaining: " + attempts); 
            
        }
        System.out.println("Your ATM card has been blocked"); 
        
    }

}
