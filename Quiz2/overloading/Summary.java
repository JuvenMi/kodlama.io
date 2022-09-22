package Quiz2.overloading;

public class Summary {
    public void sum(int a, int b) {
        System.out.println(a + b);
    }
    public void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    public void sum(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }
    public void sum(int... nums) {
        int total = 0;
        for (int num : nums) {
            total = total + num;
        }
        System.out.println(total);
    }
}
