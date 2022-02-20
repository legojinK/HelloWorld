public class DiceGameTest {

    public static void main(String[] args) {
        // 주사위 두개를 굴려서 눈금의 합 출력
        //주사위 갯수의 확장 가능성

        DiceManager dm=new DiceManager(2);
        dm.playDiceGame();
        System.out.println(dm);

    }
}
