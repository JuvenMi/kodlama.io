package Quiz2;

public class Methods {
    public static void main(String[] args) {
        findNum();
    }
    public static void findNum(){
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int searchNum = 5;
        boolean foundNum = false;
        for (int num : numbers) {
            if (num == searchNum) {
                foundNum = true;
                break;
            }
        }
        if (foundNum) {
            sendMsg(searchNum + " is found.");
        } else {
            sendMsg(searchNum + " is not found.");
        }
    }
    public static void sendMsg(String msg){
        System.out.println(msg);
    }
}
