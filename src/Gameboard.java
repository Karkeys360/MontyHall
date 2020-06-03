public class Gameboard {
    private int door1;
    private int door2;
    private int door3;
    final int carIndex = (int) ( Math.random() * 3 + 1 );

    public Gameboard( ) {
        //System.out.println("the car is behind door"+ random);
        switch (carIndex) {
            case 1:
                door1 = 1;
                door2 = 0;
                door3 = 0;
                break;
            case 2:
                door1 = 0;
                door2 = 1;
                door3 = 0;
                break;
            default:
                door1 = 0;
                door2 = 0;
                door3 = 1;
                break;
        }
    }

    public int reveal(int guess) {
        switch (carIndex) {
            case 1:
                if (guess == 1 || guess == 2) {
                   // System.out.println("there is a goat behind door 3");
                    return 3;
                }
                else {
                   // System.out.println("there is a goat behind door 2");
                    return 2;
                }
            case 2:
                if (guess == 1 || guess == 2) {
                   // System.out.println("there is a goat behind door 3");
                    return 3;
                } else {
                    //System.out.println("there is a goat behind door 1");
                    return 1;
                }


            case 3:
                if (guess == 3 || guess == 2) {
                    //System.out.println("there is a goat behind door 1");
                    return 1;
                } else {
                    //System.out.println("there is a goat behind door 2");
                    return 2;
                }

            default:
                throw new IllegalStateException("Unexpected value: " + carIndex);
        }
    }

    public boolean checkWin(int NewGuess) {
        switch (NewGuess) {
            case 1:
                return door1 == 1;
            case 2:
                return door2 == 1;
            case 3:
                return door3 == 1;
            default:
                return false;
        }


    }
}

