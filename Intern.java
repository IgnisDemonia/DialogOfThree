/**
 * Created by Skobelsky on 15.11.2017.
 */
public class Intern implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Новичок: Существует тысяча и один способ разбогатеть, и ни один из них, чёрт подери, не даёт гарантий!\n");
            Thread.sleep(150);
            System.out.println("Новичок: Именно.\n");
            Thread.sleep(350);
            System.out.println(new StringBuilder("Новичок: Ну как же… Без образования и тяжкого физического труда можно за год дойти")
                    .append(" до зарплаты в четыре,\n а то и в пять тысяч долларов, просто")
                    .append(" стуча по клавишам и тратя полтора-два часа в день! Вы только научите меня.\n"));
            Thread.sleep(350);
            System.out.println("Новичок: Ну, интернет.\n");
            Thread.sleep(250);
            System.out.println("Новичок: Да я пытался, но там как-то непонятно объясняют, очень сложно. \n");
            Thread.sleep(350);
            System.out.println(new StringBuilder("Новичок: Вроде того, если честно. Знаете, мне кажется, что вы над мной подшучиваете.")
                    .append(" А ведь вы бы могли уже сейчас чему-то меня обучать.\n"));
            Thread.sleep(250);
            System.out.println(new StringBuilder("Новичок: Ну вы сравнили. Для того, чтобы прилично зарабатывать в этих профессиях")
                    .append(" нужны годы обучения,\n и годы опыта!\n"));
            System.out.println();
            Thread.sleep(250);
            System.out.println("Новичок: Вы мне сейчас взрываете мозг.\n");
            Thread.sleep(350);
            System.out.println("Новичок: Я весь во внимании! Спасибо!\n");
            Thread.sleep(250);
            System.out.println("Новичок: …\n");
        }
        catch (InterruptedException ex) {ex.printStackTrace();}
    }
}
