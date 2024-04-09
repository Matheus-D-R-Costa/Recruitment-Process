package candidatura;

import java.util.Random;

public class HR_Department {

    public static void call(String candidate) {

        int numberOfAttempts = 1;
        boolean answered = false;
        boolean calling = true;

        do {
            answered = toCall();
            calling = !answered;
            if (calling) {
                numberOfAttempts++;
            } else {
                System.out.println("RH: Conseguimos contato com o candidato " + candidate + " na tentativa de número " + numberOfAttempts);
            }
        } while (calling && numberOfAttempts < 3);

        if (calling) {
            System.out.println("RH: conseguimos contato com o candidato " + candidate + " na " + numberOfAttempts + " tentativa");
        }
    }

    static boolean toCall() {
        return new Random().nextInt(3) == 1;
    }
}
