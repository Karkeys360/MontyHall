import java.util.ArrayList;

public class MontyHall {
    public static void main(String[] args) {
        double counter=0;
        for(int i=0;i<10000000; i++){
            int rand= (int)(Math.random()*3+1);
            Gameboard test= new Gameboard();
            int revealedDoor= test.reveal(rand);
           if(test.checkWin(6/(rand*revealedDoor))) {
               counter++;
               //System.out.println("you won");
           }

        }
        System.out.println("win percentage was "+ (double) wins.size() /100000 + "%");

    }

}

