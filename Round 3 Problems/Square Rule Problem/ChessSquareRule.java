import java.util.Scanner;

/* ===================== PIECE ===================== */
abstract class Piece {
    int row;
    int col;
    String color;

    Piece(int row, int col, String color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }
}

/* ===================== PAWN ===================== */
class Pawn extends Piece {

    Pawn(int row, int col, String color) {
        super(row, col, color);
    }

    int getPromotionRow() {
        return color.equals("WHITE") ? 8 : 1;
    }

    boolean isOnStartingRow() {
        return (color.equals("WHITE") && row == 2) ||
               (color.equals("BLACK") && row == 7);
    }

    int getMovesToPromote() {
        int promotionRow = getPromotionRow();

        if (isOnStartingRow()) {
            int afterDoubleStep = color.equals("WHITE") ? row + 2 : row - 2;
            return 1 + Math.abs(afterDoubleStep - promotionRow);
        } else {
            return Math.abs(row - promotionRow);
        }
    }
}

/* ===================== KING ===================== */
class King extends Piece {
    King(int row, int col, String color) {
        super(row, col, color);
    }
}

/* ===================== SQUARE ===================== */
class Square {
    int minRow, maxRow, minCol, maxCol;

    Square(Pawn pawn) {
        int side = pawn.getMovesToPromote();

        minRow = pawn.row;
        maxRow = pawn.color.equals("WHITE")
                ? pawn.row + side
                : pawn.row - side;

        minCol = pawn.col;
        maxCol = pawn.col + side;
    }

    boolean contains(King king) {
        return king.row >= Math.min(minRow, maxRow)
            && king.row <= Math.max(minRow, maxRow)
            && king.col >= minCol
            && king.col <= maxCol;
    }
}

/* ===================== EVALUATOR ===================== */
class SquareRuleEvaluator {

    static boolean isPawnPromoted(Pawn pawn, King king) {
        Square square = new Square(pawn);
        return !square.contains(king);
    }
}

/* ===================== MAIN ===================== */
public class ChessSquareRule {

    static void printBoard(Pawn pawn, King king) {
        char[][] board = new char[8][8];

        // fill board
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                board[i][j] = '.';
            }
        }

        board[8 - pawn.row][pawn.col - 1] = 'O'; // Pawn
        board[8 - king.row][king.col - 1] = 'X'; // King

        System.out.println("\nChess Board:");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Choose Pawn Color (WHITE / BLACK): ");
        String color = sc.next().toUpperCase();

        System.out.print("Enter Pawn Row (1-8): ");
        int pawnRow = sc.nextInt();
        System.out.print("Enter Pawn Col (1-8): ");
        int pawnCol = sc.nextInt();

        System.out.print("Enter King Row (1-8): ");
        int kingRow = sc.nextInt();
        System.out.print("Enter King Col (1-8): ");
        int kingCol = sc.nextInt();

        Pawn pawn = new Pawn(pawnRow, pawnCol, color);
        King king = new King(kingRow, kingCol, color);

        printBoard(pawn, king);

        boolean promoted = SquareRuleEvaluator.isPawnPromoted(pawn, king);

        System.out.println("\nRESULT:");
        if (promoted) {
            System.out.println("PROMOTED ✅");
        } else {
            System.out.println("FAILED ❌ (King catches pawn)");
        }

        sc.close();
    }
}
