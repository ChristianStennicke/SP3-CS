import java.io.IOException;

public class RunProgram
{
    User currentUser;
    private Object media;


    public void startProgram() throws IOException {
        String name = TextUI.startMenu();

        currentUser = new User(name);

        TextUI.mainMenu(currentUser);

        TextUI.playOrSaveMedia(currentUser);
    }
}


