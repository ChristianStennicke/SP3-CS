import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class UserLogin {

    static Scanner s = new Scanner(System.in);
    static String filename = "C:/Users/csten/OneDrive/Datamatikker/account.txt";

    public static String Userlogin() {
String returnUsername;
        try {
            Path path = Paths.get(filename.toString());
            InputStream input = Files.newInputStream(path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            System.out.println("\nL O G I N \n ");
            System.out.print("Enter username : ");
            String username = s.nextLine();
            returnUsername = username;
            System.out.print("Enter password : ");
            String password = s.nextLine();
            String _temp = null;
            String _user;
            String _pass;
            boolean found = false;
            while ((_temp = reader.readLine()) != null) {
                String[] account = _temp.split(" ");
                _user = account[0];
                _pass = account[1];
                if (_user.equals(username) && _pass.equals(password)) {
                    found = true;

                }

            }

            if (found == true) {
                System.out.println("Acesss granted!");
            } else {

                System.out.println("Acess denied username or password incorrect! ");

            }
            reader.close();
            System.out.println("Please press a key to continue");
            String proc = s.nextLine();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return returnUsername;
    }

}





