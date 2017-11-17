import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Skobelsky on 15.11.2017.
 */
public class DialogOfThree {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Вывести логически построенный диалог? ('Y' для согласия).");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String answer = reader.readLine();
            if (answer.toLowerCase().equals("y")) {

                Thread senior = new Thread(new Senior());
                Thread middle = new Thread(new Middle());
                Thread intern = new Thread(new Intern());

                long before = System.currentTimeMillis();

                intern.start();
                senior.start();
                middle.start();

                intern.join();
                senior.join();
                middle.join();

                long after = System.currentTimeMillis();
                System.out.println("Продолжительность вывода диалога ms : " + (after - before));
                System.out.println("Приз за лучшую актёрскую роль : Middle");
            }
            else {
                System.out.println("Не очень - то и хотелось!");
            }
        }
        catch (IOException exc) {exc.printStackTrace();}
    }
}
