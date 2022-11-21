import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class FileIO{
    public static ArrayList<String[]> readInfo()
    {
        //for testing
        String file = "C:/Users/csten/OneDrive/Datamatikker/movielist.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            ArrayList<String[]> info = new ArrayList<>();
            String[] movieInfo = new String[4];

            String currentLine = reader.readLine();
            while (currentLine != null) {
                movieInfo = currentLine.split("; ");
                /*for(int i = 0; i < movieInfo.length; i++){
                    System.out.println(movieInfo[i] + " splittet ");
                }*/
                info.add(movieInfo);
                currentLine =reader.readLine();
            }


            return info;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static String getMovieList(ArrayList<String[]> list, String search){
        String movieInfo = "";
        //list movies
        /*
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i)[0]);
        }
        */

        //search movie
        for(int j = 0; j < list.size(); j++){
            if(search.equalsIgnoreCase((list.get(j)[0]))){
                movieInfo = list.get(j)[0];
                movieInfo += " "+list.get(j)[1];
                movieInfo += " "+list.get(j)[2];
                movieInfo += " "+list.get(j)[3];
                break;
            }
            else{
                movieInfo = "Movie Not Found";

            }
        }
        return movieInfo;
    }


    public static ArrayList getCategoryList(ArrayList<String[]> list, String search){
        ArrayList<String[]> movies = new ArrayList<>();
        String movieCat = "";

        for(int j = 0; j < list.size(); j++){
            if(list.get(j)[2].contains(",")) {
                movieCat = list.get(j)[2];
                String[] movieCatSplit = movieCat.split(",");
                for (int i = 0; i < movieCatSplit.length; i++) {
                    if (search.equalsIgnoreCase(movieCatSplit[i])) {
                        movies.add(list.get(j));
                    }
                }
            }
            else{
                if(list.get(j)[2].equalsIgnoreCase(search)){
                    movies.add(list.get(j));
                }
                else{
                    continue;
                }
            }
        }
        if(movies.isEmpty()){
            System.out.println("Category Not Found");
        }
        return movies;
    }
    public static String getInput(){
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        return inputString;
    }
    static String file = "C:/Users/csten/OneDrive/Datamtikker/watchedMedia";
    public void playMovie() throws IOException {
FileWriter writer = new FileWriter (file);

    }

}








