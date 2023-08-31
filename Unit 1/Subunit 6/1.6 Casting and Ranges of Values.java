// 1.6.1
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

// 1.6.2
/*public*/ class NearestInt
{
    public static void main(String[] args)
    {
        double number = 5.0 / 3;
        int nearestInt = (int) (number + 0.5);
        System.out.println("5.0/3 = " + number);
        System.out.println("5/3 truncated: " + (int) number);
        System.out.println("5.0/3 rounded to nearest int: " + nearestInt);
        double negNumber = -number;
        int nearestNegInt = (int) (negNumber - 0.5);
        System.out.println("-5.0/3 rounded to nearest negative int: " + nearestNegInt);
    }
}

// 1.6.3
/*public*/ class TestOverflow
{
    public static void main(String[] args)
    {
        int id = 2147483647; // overflow
        int negative = -2147483647; // overflow

        // do not include the following:
        System.out.println(id);
        System.out.println(negative);
    }
}

// 1.6.4
/*public*/ class TestFormat
{
    public static void main(String[] args)
    {
        double number = 10 / 3;
        System.out.println(number);
        System.out.println(String.format("%.02f", number));
    }
}

// 1.6.5
// B. false

// 1.6.6
// B. false

// 1.6.7
// C. (double) total / 3;
