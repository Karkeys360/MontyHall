import java.util.ArrayList;

public class MontyHall {
    public static void main(String[] args) {
        double counter = 0;
        double NoChangeCounter=0;
        for (int i = 0; i < 10000000; i++) {
            int rand = (int) ( Math.random() * 3 + 1 );
            Gameboard test = new Gameboard();
            int revealedDoor = test.reveal(rand);
            if (test.checkWin(6 / ( rand * revealedDoor ))) {
                counter++;
                //System.out.println("you won");
            }
            if(test.checkWin(rand)) {
                NoChangeCounter++;
                //System.out.println("you won");
            }


            }

        System.out.println("win percentage was " + counter / 100000 + "%");
        System.out.println("if you didnt switch your win percentage would be"+ NoChangeCounter/100000+"%");

    }

}

