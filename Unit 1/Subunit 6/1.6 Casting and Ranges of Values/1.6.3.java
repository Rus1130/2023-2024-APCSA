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