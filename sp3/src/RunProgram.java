
    import java.io.IOException;

    public class RunProgram
    {
        User currentUser;
        private Object media;


        public void startProgram() throws IOException {
            String name = TextUI.startMenu();

            currentUser = new User(name);
            try{
                if(currentUser.getUserName().equals(null))
                {
                    System.exit(0);
                }
                else {
                    TextUI.mainMenu(currentUser);

                    TextUI.playOrSaveMedia(currentUser);
                }
            }
            catch (Exception e){
                System.out.println(e);

            }

        }
    }

