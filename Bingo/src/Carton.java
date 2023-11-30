import java.util.Scanner;

public class Carton {
    public static void main(String[] args) {

        int[] carton = new int[10];
        int[] bingo = new int[99];

        for (int i = 0; i < carton.length ; i++) {
            int bomboBingo;
            boolean repetidos;



            do{
                bomboBingo = (int) (Math.random() * 99) +1;
                repetidos = false;

                for (int j = 0; j < i; j++){
                    if (bingo[j] == bomboBingo){
                        repetidos = true;
                        break;
                    }
                }

            }while (repetidos);
            carton[i] = bomboBingo;

        }
        System.out.println("Numeros de tu carton:"+"  ");
        for (int item : carton) {
            System.out.print(item + "\t");
        }
    }
}
