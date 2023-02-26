public class PatternQuestions {
    public static void main(String[] args) {
        int row = 0, col = 0, n = 0;
        // Question1: Write a Java program to print the following pattern:
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        System.out.print("\n\nPattern 1:\n\n");
        n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.print("\n");
        }

        // Question2: Write a Java program to print the following pattern:

        // ****1
        // ***232
        // **34543
        // *4567654
        // 567898765

        System.out.print("\n\nPattern 2:\n\n");
        n = 5;
        for (int i = 1; i <= n; i++) {
            // printing space
            for (int j = i; j < n; j++)
                System.out.print("  ");
            for (int j = i; j <= 2 * i - 1; j++)
                System.out.print(j + " ");
            for (int j = 2 * i - 1; j > i; j--)
                System.out.print(j - 1 + " ");

            System.out.print("\n");
        }

    }
}
