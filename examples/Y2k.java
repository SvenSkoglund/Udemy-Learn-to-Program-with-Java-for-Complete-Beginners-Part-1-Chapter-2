package examples;

public class Y2k {
    public static void main(String[] args) {
        // Use a Scanner to read from standard in
        java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("Please enter the current year:");
		int year = scanner.nextInt();
        System.out.print("Please enter your age in years: ");
        int age = scanner.nextInt();
        scanner.close();

        

        // if ( year > ) // This line won't compile.
        if (year < 2000)
            System.out.print("You'll be ");
        else
            System.out.print("You were ");

        // Should have set year to 1998, not just 98...
        System.out.print(2000 - year + age);
        System.out.println(" years old in the year 2000.");
    }
}
