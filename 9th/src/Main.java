import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//15596번
//    long sum(int[] a) {
//
//        long sum = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            sum += a[i];
//        }
//        return sum;
//
//    }
        //1094번
        //막대기를 절반씩 계속 나누는 것을 반복
        //입력값과 비교
        //입력값보다 반으로 나눈 막대기의 길이가 더 작을 경우 카운트하기
        //막대기를 반으로 나눔
        Scanner sc =new Scanner(System.in);

        int X = sc.nextInt();
        int stick = 64;
        int cnt = 0;

        if(X<stick){
            stick/=2;
        }
        else{
            X-=stick;
            cnt++;
        }
        System.out.println(cnt);
    }

}
