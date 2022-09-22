package Quiz2.overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        Summary summary = new Summary();
        summary.sum(1, 2);
        summary.sum(1, 2, 3);
        summary.sum(1, 2, 3, 4);
        summary.sum(1, 2, 3, 4, 5);
    }
}
