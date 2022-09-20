public class Arrays {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Caner";
        names[1] = "Ramazan";
        names[2] = "Merve";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("-----------------------------");

        for(String name : names){
            System.out.println(name);
        }
    }
}
