import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] sequencia = new int[20];

        sequencia[0] = 0;
        sequencia[1] = 1;

        for (int i = 2; i <sequencia.length ; i++) {
            sequencia[i]= sequencia[i - 1] + sequencia[i - 2];
        }

        System.out.println(Arrays.toString(sequencia));
    }
}
