import java.util.Scanner;
public class LoginSimulator {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        System.out.print("enter username:");
        String username = input.nextLine();
        System.out.print("enter your password:");
        String password = input.nextLine();
        if (username.equals("admin")&& password.equals("admin123")) {
        System.out.print("Login Successful!");
    
    } else {
        System.out.print("Invalid Credentials. Please try again");
    }
    
    input.close();
    }
}
    
