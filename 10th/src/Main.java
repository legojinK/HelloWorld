import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

//1302번
public class Main {

    static int sto(String s) { return Integer.parseInt(s);}

    public static void main(String[] args) throws IOException {

        //첫째 줄에 오늘 하루 동안 팔린 책의 개수 N이 주어진다. 이 값은 1,000보다 작거나 같은 자연수이다.
        //둘째부터 N개의 줄에 책의 제목이 입력으로 들어온다.
        //책의 제목의 길이는 50보다 작거나 같고, 알파벳 소문자로만 이루어져 있다.
        //오늘 하루 동안 팔린 책의 제목이 입력으로 들어왔을 때, 가장 많이 팔린 책의 제목을 출력하는 프로그램을 작성하시오
        //책을 Key로, 횟수를 Value로 저장하는 HashMap<String, Integer> 를 사용하여 해결

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap <String,Integer> map = new HashMap<String,Integer>();
        String maxBook ="";
        int max = 0;

        int N = sto(br.readLine());

        for(int i=0; i<N;i++){
            String book = br.readLine();
            if(map.containsKey(book))
                map.put(book,1);
            else
                map.put(book, map.get(book) + 1);
        }

        for(String key : map.keySet()) {
            int value = map.get(key);
            if(max == value && maxBook.compareTo(key) > 0) {
                maxBook = key;
                max = value;
            } else if(max < value) {
                maxBook = key;
                max = value;
            }
        }
        System.out.println(maxBook);
    }
}
