public class FriendNums {
    public static void main(String[] args) {
        int num1 = 220;
        int num2 = 284;
        int total1 = 0;
        int total2 = 0;
        for(int i = 0; i < num1; i++) {
            if (num1 % i == 0) {
                total1 = total1 + i;
            }
        }
        for(int i = 0; i < num2; i++) {
            if (num2 % i == 0) {
                total2 = total2 + i;
            }
        }
        if (total1 == num2 && total2 == num1) {
            System.out.println(num1 + " and " + num2 + " are friend numbers.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not friend numbers.");
        }
    }
}
