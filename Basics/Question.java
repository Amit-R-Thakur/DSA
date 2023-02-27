public class Question {
    public static void main(String[] args) {
        // Reverse the array [6,7,8,3,2,5,7,98,65]
        StringBuilder array = new StringBuilder("Amit");
        for (int i = 0; i < array.length() / 2; i++) {
            char temp = array.charAt(i);
            array.setCharAt(i, array.charAt(array.length() - i - 1));
            array.setCharAt(array.length() - i - 1, temp);

        }
        System.out.println(array.toString());
    }

}
