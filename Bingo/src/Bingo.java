import java.util.Scanner;


public class Bingo {

    public static void main(String[] args) {
        int cantarBingo = 0;
        int cantarLinea = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de numeros en la que vas a acertar el bingo");
        int aciertos = scanner.nextInt();

        int[] carton = new int[10];
        System.out.println("¿Cuantos puntos desea apostar?");
        int apuesta = scanner.nextInt();

        int intentosLinea = 0;
        int intentosBingo = 0;
        int[] bingo = new int[99];

        for (int i = 0; i < carton.length; i++) {
            int bomboBingo;
            boolean repetidos;

            //carton
            do {
                bomboBingo = (int) (Math.random() * 99) + 1;
                repetidos = false;

                for (int j = 0; j < i; j++) {
                    if (carton[j] == bomboBingo) {
                        repetidos = true;
                        break;
                    }
                }

            } while (repetidos);
            carton[i] = bomboBingo;

        }
        System.out.println("Numeros de tu carton:" + "  ");
        for (int item : carton) {
            System.out.print(item + "\t");
        }





        //Numeros salidos del bombo:




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
                if (carton[j] == bomboBingo) {
                    cantarLinea++;
                    if (cantarLinea == 5) { intentosLinea = i;
                    }

                    cantarBingo++;
                    if (cantarBingo == 10){ intentosBingo = i;

                    }

                    //codigo utilizado para ver el recorido.
                     System.out.println("Numero cantando " + bomboBingo);
                     System.out.println("CantarLinea " + cantarLinea);
                     System.out.println("CantarBingo " + cantarBingo);
                }


            }


        }
        System.out.println("Numeros que han salido:" + " ");
        for (int item : bingo) {
            System.out.print(item + "\t");
        }
        System.out.println();



        System.out.println("BINGO salio en : "+ intentosBingo+ " intentos");

        System.out.println("LINEA en : "+ intentosLinea+ " intentos");
        if (intentosBingo == aciertos){
            System.out.println("Enhorambuena su apuesta ha sido premiada :"+ apuesta*10 +" puntos");

        }else {
            System.out.println("La apuesta no ha sido premiada, sigue intentandolo");
        }

    }
}