import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class MovieAccount {

    Scanner m = new Scanner(System.in);

    String filename = "C:/Users/csten/OneDrive/Datamatikker/movielist.txt";

    public MovieAccount() {
        try {

            System.out.println("Main menu");
            System.out.println("--------------------------");
            System.out.println("1. Search");
            System.out.println("2. Search for movies in a category");
            System.out.println("3. List of watched movies");
            System.out.println("4. List of saved movies");
            System.out.println("--------------------------");
            System.out.print("Enter choice");
            String choice = m.nextLine();
            if (choice.equals("1")) {
                getMovieList();
                searchMovie();

            }
           /* else if(choice.equals("2"))
            {
                searchCategory();
            }
            else if(choice.equals("3"))
            {
                watchedMovies();
            }
            else if(choice.equals("4"))
            {
                savedMovies();
            }*/
        } catch (Exception ex) {

        }

    }

    public ArrayList<String> getMovieList() throws IOException {

        ArrayList<String> movies = new ArrayList<>();
        Path path = Paths.get(filename.toString());
        InputStream input = Files.newInputStream(path);
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));

        String currentLine = reader.readLine();
        while (currentLine != null)
        {

            currentLine = reader.readLine();
        }
        System.out.println(movies);
        return movies;
    }

    void searchMovie() {
        try {

            System.out.println("\nSearch Movie: \n ");
            System.out.print("Enter title: ");
            String title = m.nextLine();

            ArrayList list = getMovieList();
            for ()
            if(list.equals(title))
            {
                System.out.println("Found movie: " + title);
            }
        }
        catch (Exception ex){
            System.out.println("OOPS " + ex);
        }

    }

    public static void main(String[] args) {
        new MovieAccount();

    }

}





