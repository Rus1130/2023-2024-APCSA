/*public*/ class Challenge1_4
{
    public static void main(String[] args)
    {
        // Fill in values for these variables
        int currentYear = 2023;
        int birthYear = 2007;
        int dogBirthYear = 2015;

        // Write a formula to calculate your age from the currentYear and
        // your birthYear variables;
        int age = currentYear - birthYear;

        // Write a formula to calculate your dog's age from the currentYear
        // and dogBirthYear variables
        int dogAge = currentYear - dogBirthYear;

        // Calculate the age of your dog in dogYears (7 times your dog's age
        // in human years)
        int dogYearsAge = dogAge * 7;

        // Print out your age, your dog's age, and your dog's age in dog
        // years. Make sure you print out text too so that the user knows what
        // is being printed out.
        System.out.println(age);
        System.out.println(dogAge);
        System.out.println(dogYearsAge);
   }
}