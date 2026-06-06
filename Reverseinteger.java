void main() {

    System.out.print("Enter a number; ");
    int thenum = 134; //takenumber.nextInt();
    int reversednumber = 0;

    while (thenum > 0) {
        reversednumber = (reversednumber * 10) + (thenum % 10);
        thenum /= 10;
        System.out.println("after this loop reversedumber is " + reversednumber + " and the num; " + thenum);
    }
    System.out.println("the final num is" + reversednumber);

}
// si fillim gjehet lastdigit e numrit, ne kte rast 4, me pas numri og pjestohet me 10 per te hequr digitin e fundit
// ne looping e dyt, pasi vazhdon per sa kohe numri nuk eshe 0, numri reversed shumezohet me 10 per te kaluar ne dy digits
// pasi do te shtohet digit i dyt nga thenum, duke perdor mbetjen % e 10 and so on per te tretin

