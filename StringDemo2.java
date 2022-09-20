public class StringDemo2 {
    public static void main(String[] args) {
        String message = "Hello world!";
        System.out.println(message);
        System.out.println(message.replace(" ", "_"));
        System.out.println(message.substring(2,8));

        for (String word : message.split(" ")) {
            System.out.println(word);
        }

        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());

    }
}
