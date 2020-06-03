import java.util.ArrayList;

public class MontyHall {
    public static void main(String[] args) {
        ArrayList<Boolean> wins= new ArrayList<Boolean>();
        for(int i=0;i<10000000; i++){
            int rand= (int)(Math.random()*3+1);
            Gameboard test= new Gameboard();
            int tester= test.reveal(rand);
           if(test.checkWin(6/(rand*tester))) {
               wins.add(true);
               //System.out.println("you won");
           }

        }
        System.out.println("win percentage was "+ (double) wins.size() /100000 + "%");

    }

}

