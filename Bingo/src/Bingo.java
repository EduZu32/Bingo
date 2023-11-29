public class Bingo {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*99) +1;

        }

    }

}
