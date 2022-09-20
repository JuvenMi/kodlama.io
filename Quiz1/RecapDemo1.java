public class RecapDemo1 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 40;
        int number3 = 30;
        int bigNum = number1;

        if (number3 > bigNum) {
            bigNum = number3;
        }
        if (number2 > bigNum) {
            bigNum = number2;
        }

        System.out.println("En büyük sayı: " + bigNum);
    }
}
