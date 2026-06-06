/*
    final String MONDAY = "Monday";
    final String TUESDAY = "Tuesday";
    final String WEDNESDAY = "Wednesday";
    final String THURSDAY = "Thursday";
    final String FRIDAY = "Friday";
    final String SATURDAY = "Saturday";
    final String SUNDAY = "Sunday";

    System.out.print("Enter a number from 1 to 7; ");
    Scanner takeinput = new Scanner(System.in);
    int x = takeinput.nextInt();
    switch (x){
        case 1:
            System.out.println(MONDAY);
            break;
        case 2:
            System.out.println(TUESDAY);
            break;
        case 3:
            System.out.println(WEDNESDAY);
            break;
        case 4:
            System.out.println(THURSDAY);
            break;
        case 5:
            System.out.println(FRIDAY);
            break;
        case 6:
            System.out.println(SATURDAY);
            break;
        case 7:
            System.out.println(SUNDAY);
            break;
        default:
            System.out.println("invalid inout");

    }


    int even_count = 0;
    int odd_count = 0;
    for (int i = 2; i <= 20; i++){
        if (i%2 == 0){
            System.out.println(i + " even");
            even_count++;
        }else{
            //System.out.println(i + " odd");
            odd_count++;
        }
    }
    System.out.println("total even: " + even_count + "total odd: " + odd_count);

    */

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
