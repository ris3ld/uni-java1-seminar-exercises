import java.util.Scanner;

public class gradeAvg {

    final int PASS_THRESHOLD = 50;

    void printResult (double x){

        if (x/4 < PASS_THRESHOLD) {
            System.out.println("You have failed! " + x/4);
        }else {
            System.out.println("You have passed! " + x/4);
        }
    }

    void main() {
        Scanner takeinput = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            int count = 0;
            do {
                System.out.print("grade; ");
                int grade = takeinput.nextInt();
                sum += grade;
                count++;

            } while (count != 4);

            System.out.println("Student number " + i);
            printResult(sum);
        }

    }
}
