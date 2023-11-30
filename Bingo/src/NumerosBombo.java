import java.util.Scanner;

public class NumerosBombo {
    public static void main(String[] args) {
        int[] carton = new int[10];
        int[] bingo = new int[99];
        int cantarBingo = 0;


        System.out.println();
        for (int i = 0; i < bingo.length && cantarBingo < carton.length; i++) {
            int bomboBingo;
            boolean repetidos;

            do {
                bomboBingo = (int) (Math.random() * 99) + 1;
                repetidos = false;

                for (int j = 0; j < i; j++) {
                    if (bingo[j] == bomboBingo) {
                        repetidos = true;
                        break;
                    }

                }
            } while (repetidos);
            bingo[i] = bomboBingo;

            for (int j = 0; j < carton.length; j++) {
                if (carton[j] == bomboBingo){
                    bomboBingo--;
                }


            }
        }
        System.out.println("Numeros que han salido:"+ " ");
        for (int item : bingo) {
            System.out.print(item + "\t");
        }
    }

}
