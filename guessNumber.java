void main() {
    Scanner thenum = new Scanner(System.in);
    int randomNum = ThreadLocalRandom.current().nextInt(1, 101);
    System.out.println("The number is; " + randomNum);

    System.out.print("Enter a number you think it is; ");
    int usernum = thenum.nextInt();
    while(usernum != randomNum) {
        if(usernum > randomNum) {
            System.out.println("wrong, less");
        } else {
            System.out.println("wrong,  more");
        }

        System.out.print("Try again: ");
        usernum = thenum.nextInt();
    }
    System.out.print("correct");
}