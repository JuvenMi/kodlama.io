public class BoldAndThinWord {
    public static void main(String[] args) {
        char letter = 'A';
        switch (letter){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("The letter is a vowel.");
                break;
            default:
                System.out.println("The letter is a consonant.");
                break;
        }
    }
}
