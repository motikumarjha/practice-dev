import java.util.Scanner;

class AverageMarks {
    public static void main(String args[]) {
        System.out.println("Enter Name of the student");
        Scanner sc1 = new Scanner(System.in);
        String name = sc1.toString();
        System.out.println("Enter number of subjects");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        double avg = 0;

        System.out.println("Enter marks");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            avg = avg + a[i];
        }

        System.out.print("Average of (");
      /*  for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + ",");
        }*/
        System.out.println(name + ") = " + avg / n);
    }
}
