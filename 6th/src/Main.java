import java.util.Scanner;

//백준 10871번
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 10 4 가 주어지면
        //수열 A는 정수 10개가 주어진다  4보다 작은수 입력받은 순서대로 써라

        int N = sc.nextInt();
        int X = sc.nextInt();

        int arr[] = new int[N];

        for(int i=0; i<N;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        for(int i=0; i<N; i++){
            if(arr[i] < X){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
