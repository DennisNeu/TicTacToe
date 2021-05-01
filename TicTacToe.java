import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class TicTacToe {
//	this should be the game board

    /*String [] 0, 2, 4, 10, 12, 14, 20, 22, 24 are the interesting fields
     *		1 2 3 4 5 6 7 8 9
     */
    static String[] board =
            {" ", "|", " ", "|", " ",
                    "-", "-", "-", "-", "-",
                    " ", "|", " ", "|", " ",
                    "-", "-", "-", "-", "-",
                    " ", "|", " ", "|", " "};
    static boolean win = false;
    static boolean full = false;

    //	this is the method to print the game board
    public static void drawGameBoard() {

        for (int a = 0; a <= 4; a++) {
            System.out.print(board[a]);
        }
        System.out.println();
        for (int a = 5; a <= 9; a++) {
            System.out.print(board[a]);
        }
        System.out.println();
        for (int a = 10; a <= 14; a++) {
            System.out.print(board[a]);
        }
        System.out.println();
        for (int a = 15; a <= 19; a++) {
            System.out.print(board[a]);
        }
        System.out.println();
        for (int a = 20; a <= 24; a++) {
            System.out.print(board[a]);
        }
        System.out.println();
    }

    @SuppressWarnings("resource")
    public static void turnX() {
        System.out.println("Spieler X ist am Zug");
        while (true) {
            switch (new java.util.Scanner(System.in).next()) {
                case "1": {
                    String a = board[0];
                    if (a.equals("X")) {
                        System.out.println("Hier steht schon ein X");
                        break;
                    }
                    if (a.equals("O")) {
                        System.out.println("Hier steht schon ein O");
                        break;
                    } else
                        board[0] = "X";
                    return;
                }
                case "2": {
                    String a = board[2];
                    if (a.equals("X")) {
                        System.out.println("Hier steht schon ein X");
                        break;
                    }
                    if (a.equals("O")) {
                        System.out.println("Hier steht schon ein O");
                        break;
                    } else
                        board[2] = "X";
                    return;
                }
                case "3": {
                    String a = board[4];
                    if (a.equals("X")) {
                        System.out.println("Hier steht schon ein X");
                        break;
                    }
                    if (a.equals("O")) {
                        System.out.println("Hier steht schon ein O");
                        break;
                    } else
                        board[4] = "X";
                    return;
                }
                case "4": {
                    String a = board[10];
                    if (a.equals("X")) {
                        System.out.println("Hier steht schon ein X");
                        break;
                    }
                    if (a.equals("O")) {
                        System.out.println("Hier steht schon ein O");
                        break;
                    } else
                        board[10] = "X";
                    return;
                }
                case "5": {
                    String a = board[12];
                    if (a.equals("X")) {
                        System.out.println("Hier steht schon ein X");
                        break;
                    }
                    if (a.equals("O")) {
                        System.out.println("Hier steht schon ein O");
                        break;
                    } else
                        board[12] = "X";
                    return;
                }
                case "6": {
                    String a = board[14];
                    if (a.equals("X")) {
                        System.out.println("Hier steht schon ein X");
                        break;
                    }
                    if (a.equals("O")) {
                        System.out.println("Hier steht schon ein O");
                        break;
                    } else
                        board[14] = "X";
                    return;
                }
                case "7": {
                    String a = board[20];
                    if (a.equals("X")) {
                        System.out.println("Hier steht schon ein X");
                        break;
                    }
                    if (a.equals("O")) {
                        System.out.println("Hier steht schon ein O");
                        break;
                    } else
                        board[20] = "X";
                    return;
                }
                case "8": {
                    String a = board[22];
                    if (a.equals("X")) {
                        System.out.println("Hier steht schon ein X");
                        break;
                    }
                    if (a.equals("O")) {
                        System.out.println("Hier steht schon ein O");
                        break;
                    } else
                        board[22] = "X";
                    return;
                }
                case "9": {
                    String a = board[24];
                    if (a.equals("X")) {
                        System.out.println("Hier steht schon ein X");
                        break;
                    }
                    if (a.equals("O")) {
                        System.out.println("Hier steht schon ein O");
                        break;
                    } else
                        board[24] = "X";
                    return;
                }
                default: {
                    System.out.println("Keine gültige Eingabe!");
                    System.out.println("Geb eine Zahl von 1-9 ein.");
                }
            }
        }
    }

    @SuppressWarnings("resource")
    public static void turnO() {
        System.out.println("Spieler O ist am Zug");
        while (true) {
            switch (new java.util.Scanner(System.in).next()) {
                case "1": {
                    String a = board[0];
                    if (a.equals("X")) {
                        System.out.println("Hier steht schon ein X");
                        break;
                    }
                    if (a.equals("O")) {
                        System.out.println("Hier steht schon ein O");
                        break;
                    } else
                        board[0] = "O";
                    return;
                }
                case "2": {
                    String a = board[2];
                    if (a.equals("X")) {
                        System.out.println("Hier steht schon ein X");
                        break;
                    }
                    if (a.equals("O")) {
                        System.out.println("Hier steht schon ein O");
                        break;
                    } else
                        board[2] = "O";
                    return;
                }
                case "3": {
                    String a = board[4];
                    if (a.equals("X")) {
                        System.out.println("Hier steht schon ein X");
                        break;
                    }
                    if (a.equals("O")) {
                        System.out.println("Hier steht schon ein O");
                        break;
                    } else
                        board[4] = "O";
                    return;
                }
                case "4": {
                    String a = board[10];
                    if (a.equals("X")) {
                        System.out.println("Hier steht schon ein X");
                        break;
                    }
                    if (a.equals("O")) {
                        System.out.println("Hier steht schon ein O");
                        break;
                    } else
                        board[10] = "O";
                    return;
                }
                case "5": {
                    String a = board[12];
                    if (a.equals("X")) {
                        System.out.println("Hier steht schon ein X");
                        break;
                    }
                    if (a.equals("O")) {
                        System.out.println("Hier steht schon ein O");
                        break;
                    } else
                        board[12] = "O";
                    return;
                }
                case "6": {
                    String a = board[14];
                    if (a.equals("X")) {
                        System.out.println("Hier steht schon ein X");
                        break;
                    }
                    if (a.equals("O")) {
                        System.out.println("Hier steht schon ein O");
                        break;
                    } else
                        board[14] = "O";
                    return;
                }
                case "7": {
                    String a = board[20];
                    if (a.equals("X")) {
                        System.out.println("Hier steht schon ein X");
                        break;
                    }
                    if (a.equals("O")) {
                        System.out.println("Hier steht schon ein O");
                        break;
                    } else
                        board[20] = "O";
                    return;
                }
                case "8": {
                    String a = board[22];
                    if (a.equals("X")) {
                        System.out.println("Hier steht schon ein X");
                        break;
                    }
                    if (a.equals("O")) {
                        System.out.println("Hier steht schon ein O");
                        break;
                    } else
                        board[22] = "O";
                    return;
                }
                case "9": {
                    String a = board[24];
                    if (a.equals("X")) {
                        System.out.println("Hier steht schon ein X");
                        break;
                    }
                    if (a.equals("O")) {
                        System.out.println("Hier steht schon ein O");
                        break;
                    } else
                        board[24] = "O";
                    return;
                }
                default: {
                    System.out.println("Keine gültige Eingabe!");
                    System.out.println("Geb eine Zahl von 1-9 ein.");
                }
            }
        }
    }

    public static void checkWinX() {
        String a1 = board[0];
        String a2 = board[2];
        String a3 = board[4];
        String a4 = board[10];
        String a5 = board[12];
        String a6 = board[14];
        String a7 = board[20];
        String a8 = board[22];
        String a9 = board[24];
        if (a1.equals("X") && a2.equals("X") && a3.equals("X")) {
            System.out.println("X hat gewonnen!");
            win = true;
        }
        if (a4.equals("X") && a5.equals("X") && a6.equals("X")) {
            System.out.println("X hat gewonnen!");
            win = true;
        }
        if (a7.equals("X") && a8.equals("X") && a9.equals("X")) {
            System.out.println("X hat gewonnen!");
            win = true;
        }
        if (a1.equals("X") && a4.equals("X") && a7.equals("X")) {
            System.out.println("X hat gewonnen!");
            win = true;
        }
        if (a2.equals("X") && a5.equals("X") && a8.equals("X")) {
            System.out.println("X hat gewonnen!");
            win = true;
        }
        if (a3.equals("X") && a6.equals("X") && a9.equals("X")) {
            System.out.println("X hat gewonnen!");
            win = true;
        }
        if (a1.equals("X") && a5.equals("X") && a9.equals("X")) {
            System.out.println("X hat gewonnen!");
            win = true;
        }
        if (a3.equals("X") && a5.equals("X") && a7.equals("X")) {
            System.out.println("X hat gewonnen!");
            win = true;
        }
    }

    public static void checkWinO() {
        String a1 = board[0];
        String a2 = board[2];
        String a3 = board[4];
        String a4 = board[10];
        String a5 = board[12];
        String a6 = board[14];
        String a7 = board[20];
        String a8 = board[22];
        String a9 = board[24];
        if (a1.equals("O") && a2.equals("O") && a3.equals("O")) {
            System.out.println("O hat gewonnen!");
            win = true;
        }
        if (a4.equals("O") && a5.equals("O") && a6.equals("O")) {
            System.out.println("O hat gewonnen!");
            win = true;
        }
        if (a7.equals("O") && a8.equals("O") && a9.equals("O")) {
            System.out.println("O hat gewonnen!");
            win = true;
        }
        if (a1.equals("O") && a4.equals("O") && a7.equals("O")) {
            System.out.println("O hat gewonnen!");
            win = true;
        }
        if (a2.equals("O") && a5.equals("O") && a8.equals("O")) {
            System.out.println("O hat gewonnen!");
            win = true;
        }
        if (a3.equals("O") && a6.equals("O") && a9.equals("O")) {
            System.out.println("O hat gewonnen!");
            win = true;
        }
        if (a1.equals("O") && a5.equals("O") && a9.equals("O")) {
            System.out.println("O hat gewonnen!");
            win = true;
        }
        if (a3.equals("O") && a5.equals("O") && a7.equals("O")) {
            System.out.println("O hat gewonnen!");
            win = true;
        }
    }

    public static void checkIfFull() {
        List<String> list = Arrays.asList(board);
        if (!list.contains(" ")) {
            full = true;
            System.out.println("Das Spielbrett ist voll. Es ist unentschieden!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Dies ist ein zwei-Spieler TicTacToe Spiel!");
        System.out.println("Die Spieler tragen nacheinander ihr Symbol ein.");
        System.out.println("Die Positionen des Spielfeldes sind mit 1 (oben links) bis 9 (unten rechts) bezeichnet");
        System.out.println("Viel Spaß!");
        System.out.println();

        while (true) {
            drawGameBoard();
            checkWinO();
            if (win == true)
                break;
            checkIfFull();
            if (full == true)
                break;

            turnX();

            drawGameBoard();

            checkWinX();
            if (win == true)
                break;

            checkIfFull();
            if (full == true)
                break;

            turnO();

        }
    }
}
	



