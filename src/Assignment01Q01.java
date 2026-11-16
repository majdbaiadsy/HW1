public class Assignment01Q01 {
    public static void main(String[] args) {
        // TODO: Implement Q01
        for (String letter : args) {
            if (letter.charAt(0) % 5 == 0) {
                System.out.println(letter.charAt(0));
            }
        }
    }
}
