package ticTacToe;

public class board extends ticTacToeMain{



    public static char[][] boardd = {{'-', '-', '-'},
                                {'-', '-', '-'},
                                {'-', '-', '-'}};


    board() {




   }

    /**
     * Prints Board
     * Run after every turn
     */


    public void printBoard() {

       for(int i = 0; i < 3; i++){
           for(int j = 0; j < 3; j++) {
               System.out.print(boardd[i][j]+" ");
           }
           System.out.println();

       }

       /**
        * a(0,0) b(0) c(0,2)
        * d,0) e) f,2)
        * g(2,0) h(2) i(2,2)
        *
        */

   }


    static int Row;
    static int Column;
    public static void setRow(int row){
        Row = row;
    }

    public static void setColumn(int column){
        Column = column;
    }

    public static int getRow(){
        return Row;
    }


    public static int getColumn(){
        return Column;
    }



    static boolean gameIsWon;
    public static boolean gameWon(boolean isWon) {
        gameIsWon = isWon;
        return gameIsWon;
    }

    public static char turn;
    public static void getTurn(char whosTurn){
        turn = whosTurn;
    }





    public static boolean canGoThere = true;
    public static boolean canGoThere(int row, int column){

        if (row >= 1 && row <= 3 && column >= 1 && column <= 3) {
            if (boardd[row-1][column-1]=='-' ) {
                canGoThere = true;
                return canGoThere;
            } else {
                canGoThere = false;
                return canGoThere;
            }
        } else {
            canGoThere = false;
            return canGoThere;
        }


    }



    public static void place(){
        if (turn == 'x') {
            boardd[Row-1][Column-1] = 'x';
        } else {
            boardd[Row-1][Column-1] = 'o';
        }




    }




}
