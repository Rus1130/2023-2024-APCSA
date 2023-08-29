// 1.4.4.1
/*public*/ class Test1
{
    public static void main(String[] args)
    {
        System.out.println(2 + 3);
        System.out.println(2 - 3);
        System.out.println(2 * 3);
        System.out.println(2 / 3);
        // == is to test while = is to assign
        System.out.println(2 == 3);
        System.out.println(2 != 3);
    }
}

// 1.4.4.2
/*public*/ class TestCompound
{
    public static void main(String[] args)
    {
        System.out.println(2 + 3 * 2);
        System.out.println((2 + 3) * 2);
        System.out.println(2 + (3 * 2));
    }
}