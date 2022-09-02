public class labJava {
    /* f(x) = f(x) * f(x-1) * ... * 1 */
    public static int f( int x ) {
        if (x <= 1) {
            System.out.println(x);
            return 1;
        }
        else
            System.out.println(x);
            return ((x) * f(x-1));
    }

    public static void main(String [ ] args) {
        int x = 5;
        System.out.println( "f(" + x +") = "+ f(x));
        System.out.println("This is Java code example");
        System.out.println("This is Version 2 of program");
    }
}