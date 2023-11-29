import java.util.Random;

public class Bingo {

    public static void main(String[] args) {
        

        //carton con 10 numeros
        int[] carton = new int[10];
        int i = 0, n;
        Random r = new Random();

        // numeros alatorios del carton de 1 al 100
        while (i < 10) {
            n = r.nextInt(100) + 1;
            if(! Busqueda(carton,n,i)){
                carton[i] =n;
                i++;
            }

        }
        for (int j = 0; j < carton.length;j++) {
            System.out.print(carton[j]+" ");
        }


    }

    public static boolean Busqueda(int [] carton,int n, int i){
        int j;
        for (j=0;j<i;j++){
            if (n == carton[j]){
                return true;
            }
        }
        return false;
    }



}
