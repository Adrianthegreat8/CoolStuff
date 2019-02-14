package ticTacToe;
import java.util.Scanner;

public class ticTacToeMain {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        board Board = new board();
        turn Turn = new turn();

        boolean gameWon = false;

        int row;
        int column;

        boolean canGoThere = true;



        do {



                Board.printBoard();
                System.out.println();

            System.out.println("It is " + turn.whosTurn() + "'s turn");

                System.out.println("Which column?");
                column = input.nextInt();
                board.setColumn(column);

                System.out.println("Which row?");
                row = input.nextInt();
                board.setRow(row);

                canGoThere=Board.canGoThere(row, column);

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");

                if (canGoThere==true) {
                    Board.getTurn(Turn.whosTurn());

                    Board.place();

                    Turn.nextTurn();
                } else {
                    System.out.println("You cannot go there try again");
                    System.out.println("");
                }


            if (Board.gameWon(gameWon)==true) gameWon = true;

        }while(gameWon!=true);











    }





}
