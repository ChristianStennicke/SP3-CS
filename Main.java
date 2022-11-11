import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        MovieAccount ma = new MovieAccount();

            ArrayList listOfMovies = ma.getMovieList();
            for(int i = 0; i < listOfMovies.size(); i++){
                System.out.println(listOfMovies.get(i));
            }

        }
    }
