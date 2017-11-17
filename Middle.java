/**
 * Created by Skobelsky on 15.11.2017.
 */
public class Middle implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(350);
            System.out.println("Middle: Хмхм…\n");
            Thread.sleep(350);
            System.out.println("Middle: Ик…\n");
            Thread.sleep(650);
            System.out.println("Middle: Эхх…\n");
            Thread.sleep(700);
            System.out.println("Middle: Угу.\n");
            Thread.sleep(800);
            System.out.println("Middle: Да.\n");
        }
        catch (InterruptedException ex) {ex.printStackTrace();}
    }
}
