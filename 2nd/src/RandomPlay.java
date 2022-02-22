public class RandomPlay {


    public static void main(String[] args) {
        Random rg = new Random(4, 97);

        if (!rg.confirmRandom()) {
            System.out.println("난수 생성에 문제가 있음");
        } else {
            System.out.println("난수 생성: " + rg.intGenerate());
        }

        Random rg2 = new Random(
                65, 90, 97, 122
        );

        if (!rg2.confirmComplicatedRandom()) {
            System.out.println("난수 생성에 문제가 있음");
        } else {
            System.out.println("복합 난수 생성: " + rg2.complicatedRandom());
        }

        Random rg3 = new Random(
                65, 122,
                65, 90, 97, 122
        );

        System.out.println("조건부 난수 생성: " + rg3.conditionRandom());
    }
}
