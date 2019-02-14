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


int peepee = 1;


        do {

            Board.printBoard();
            System.out.println();

            System.out.println("Which row?");
            row = input.nextInt();
            board.setRow(row);

            System.out.println("Which column?");
            column = input.nextInt();
            board.setRow(column);

            Board.getTurn(Turn.whosTurn());

            Board.place();
        peepee ++;
        if (peepee == 5) gameWon = true;


            if (Board.gameWon(gameWon)==true) gameWon = true;

        }while(gameWon!=true);











    }





}
