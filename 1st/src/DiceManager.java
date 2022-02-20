public class DiceManager {

    int sum;
    int diceNum;
    Dice[]diceArr;



        public DiceManager(int diceNum){
            sum=0;
            this.diceNum= diceNum;
            diceArr= new Dice[diceNum];
        }

        public void checkWinner(int sum){
            if (sum % 2 ==0){
                System.out.println("당첨입니다");
            }
            else{
                System.out.println("꽝");
            }

        }

        public void playDiceGame(){
            int tmp;
            for(int i =0; i<diceNum; i++){
                diceArr[i]= new Dice();
                tmp=diceArr[i].DollDice();
                System.out.printf("tmp=%d\n",tmp);

                sum+=tmp;

            }

            checkWinner(sum);
        }



}
