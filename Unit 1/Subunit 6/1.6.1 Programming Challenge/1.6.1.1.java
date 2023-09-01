/*public*/ class Challenge1_6
{
    public static void main(String[] args)
    {
        // 1. Declare 3 int variables called grade1, grade2, grade3
        // and initialize them to 3 values
        double grade1 = 90.0;
        double grade2 = 100.0;
        double grade3 = 94.0;

        // 2. Declare an int variable called sum for the sum of the grades
        double sum = 0.0;

        // 3. Declare a variable called average for the average of the grades
        double average = 0.0;

        // 4. Write a formula to calculate the sum of the 3 grades (add them
        // up).
        sum = (double) grade1 + grade2 + grade3;

        // 5. Write a formula to calculate the average of the 3 grades from
        // the sum using division and type casting.
        average = sum / 3;

        // 6. Print out the average
        System.out.println(average);
    }
}