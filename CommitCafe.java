public class CommitCafe {

<<<<<<< HEAD
    private static String title = "[Lead Barista]"; // STUDENT_TODO_1B: Add a nickname or title for the barista
=======
    private static String barista = "Tommy"; // STUDENT_TODO_1A: Change name
    // STUDENT_TODO_1B: Add a nickname or title for the barista
>>>>>>> 4ee7007188cab2071684d603260c97a36e4650be

    private static int cups = 0;

    public static void brew(String drink) {
        cups++;
<<<<<<< HEAD
        System.out.println("CoffeeBot brewed " + drink + ". Commit your coffee, not your code before it compiles.");
=======
        System.out.println(barista + " just brewed a " + drink);
        // STUDENT_TODO_2B: Add a second brew-related improvement
>>>>>>> 4ee7007188cab2071684d603260c97a36e4650be
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}
