public class Dice {
    //주사위 굴려서 랜덤으로 나오는 주사위 값

    final int MAX=6;
    final int MIN=1;
    int range;


    public Dice(){
        range= (MAX-MIN)+1;
    }

    public int DollDice(){

        return (int)(Math.random()*range+MIN);
    }
}
