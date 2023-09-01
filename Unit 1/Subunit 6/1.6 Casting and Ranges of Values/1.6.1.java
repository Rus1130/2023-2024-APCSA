/*public*/ class OperatorTest
{
    public static void main(String[] args)
    {
        System.out.println(1 / 3);          // int divided by int
        System.out.println(1.0 / 3);        // double divided by int
        System.out.println(1 / 3.0);        // int divided by double
        System.out.println((double) 1 / 3); // int cast to double, divided by int
    }
}