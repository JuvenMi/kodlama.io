package Quiz2;

public class VariableArguments {
    public static void main(String[] args) {
        int total = total(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Total: " + total);
    }
    public static int total(int... nums){
        int total = 0;
        for(int num : nums){
            total = total + num;
        }
        return total;
    }
}
