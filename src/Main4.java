import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        for (int i=1; i<=5; i++){
            for (int j=1;j<=i; j++){
                System.out.printf("%-4d",i);
            }
            System.out.println();
        }
    }
}
