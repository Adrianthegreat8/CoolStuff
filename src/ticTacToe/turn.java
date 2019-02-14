package ticTacToe;

public class turn extends ticTacToeMain {


    public static char current = 'x';


    turn() {


    }

    public static char whosTurn() {

        return current;

    }

    public void nextTurn() {

        if (this.whosTurn() == 'x') {
            current = 'o';
        } else {
            current = 'x';
        }


    }



}
