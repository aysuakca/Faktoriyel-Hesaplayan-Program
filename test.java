import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        int n;
        int total=1;

        Scanner inp = new Scanner(System.in);

        System.out.println("Faktoriyel Sayisi :");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            total= total * i;
        }
        System.out.println(n+ ". Faktoriyel : " +total);
        }
    }






