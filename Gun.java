import java.util.Random;
import java.util.Scanner;

public class Gun {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int scan;
        int rand = random.nextInt(7);


        Boolean win = false;

        for (int i = 1; i < 7; i++) {

            if (i == 1) System.out.println("Револьвер заряжен одной пулей, вы готовы выстрелить? 1 - да / 0 - нет");
            System.out.println(rand);

            scan = sc.nextInt();
            if (scan == 1) {
                win = false;
            } else if (scan == 0) {
                System.out.println("Вы трус! Но останетесь живы!");
                break;

            }
            if (i != rand) {
                System.out.println("Вы живы! Поздравляю!");
            } else if (i == rand) {
                System.out.println("Мозги на столе, Вы продержались " + (i - 1) +" попыток(ки), неплохо!");
                System.out.println("Повторить игру еще раз 1 - да / 0 - нет");

                win = true;
                scan = sc.nextInt();

                if (scan == 1) {

                    i = 0;
                    win = false;
                    rand = random.nextInt(6);
                } else if (scan == 0) {
                    System.out.println("Вы трус! Но останетесь живы!");
                    break;

                }
            }
            if (i == 7) {
                System.out.println("Вы везунчик! Произошла осечка. Сейчас перезарядим!");
                System.out.println("Повторить игру еще раз 1 - да / 0 - нет");

                win = true;
                scan = sc.nextInt();

                if (scan == 1) {

                    i = 0;
                    win = false;
                    rand = random.nextInt(6);
                } else if (scan == 0) {
                    System.out.println("Вы трус! Но останетесь живы!");
                    break;

                }

            }

        }
    }
}
