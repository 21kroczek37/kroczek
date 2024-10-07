package pl.krok.szymon;

public class Main {
    public static void main(String[] args) {
        char[][] board = {{'X','X','X'},
                {'X','X','X'},
                {'X','X','X'}};
        printBoard(board);
        System.out.println(checkWinInColumns(board,'X'));
        System.out.println(checkWinInRows(board,'X'));
        System.out.println(checkFirstDiagonal(board, 'X'));
        System.out.println(checkSecondDiagonal(board, 'X'));

    }

    private static boolean checkFirstDiagonal(char[][] board, char activePlayer) {
        int dim = board.length;
        for (int i = 0; i < dim; i++) {
            if (board[i][i] != activePlayer) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkSecondDiagonal(char[][] board, char activePlayer) {
        int dim = board.length;
        for (int i = 0; i < dim; i++) {
            if (board[i][dim - i - 1] != activePlayer) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkWinInColumns(char[][] board, char activePlayer) {
        int dim = board.length;
        // licznik col b�dzie sprawdza� w kolejnych iteracjach
        // kolejne kolumny od 0 a� do dim
        for (int col = 0; col < dim; col++) {
            // zak�adam optymistycznie, �e activePlayer wygra�
            boolean win = true;
            // licznik col b�dzie przesuwa� si� po kolejnych
            // wierszach dla danej kolumny col
            for (int row = 0; row < dim; row++) {
                // je�eli trafi� na pierwsz� kom�rk� w kt�rej
                // nie ma symbolu activePlayer, to wiem, �e
                // w tej kolumnie nie wygra�, wi�c ustawiam
                // flag� win na false i przerywam sprawdzanie
                // kolejnych kom�rek
                if (board[row][col] != activePlayer) {
                    win = false;
                    break;
                }
            }
            // je�eli po sprawdzeniu danej kolumny
            // flaga win dalej ma warto�� true, to znaczy
            // �e gracz wygra� w tej kolumnie
            // przerywam wi�c ca�� metod� zwracaj�c true
            if (win) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkWinInRows(char[][] board, char activePlayer) {
        int dim = board.length;
        for (int col = 0; col < dim; col++) {
            boolean win = true;
            for (int row = 0; row < dim; row++) {
                if (board[col][row] != activePlayer) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }
        return false;
    }

    private static void printBoard(char[][] board) {
        int dim = board.length;
        // nag��wki kolumn
        System.out.print("\t");
        for (int i = 0; i < dim; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int row = 0; row < dim; row++) {
            System.out.print(row + ":\t");
            for (int column = 0; column < dim; column++) {
                System.out.print(board[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
