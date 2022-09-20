public class StringDemo {
    public static void main(String[] args) {
        char[] array = new char[5];
        String message = "Hello there!";
        System.out.println("Mesaj: " + message);
        System.out.println("Mesajın uzunluğu: " + message.length());
        System.out.println("Mesajın 5. karakteri: " + message.charAt(4));
        System.out.println(message.concat(" How are you?"));
        System.out.println(message.startsWith("H"));
        System.out.println(message.endsWith("!"));
        message.getChars(0,5, array, 0);
        System.out.println(array);
        System.out.println(message.indexOf("o"));
        System.out.println(message.lastIndexOf("e"));
    }
}
