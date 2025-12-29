
import boundary.MainMenuBoundary;
import db.fakedb;
public class Main {

    public static void main(String[] args) {
        new fakedb().load(); //chay fake db
        new MainMenuBoundary().run();
    }
}
