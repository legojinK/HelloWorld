import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        // 반대 트리 만들기
        for (int i = 0; i < n; i++) {
            for (int t = 0; t <= i; t++) {
                System.out.print("*");
            }
            System.out.println();
        }

       //트리만들기
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
