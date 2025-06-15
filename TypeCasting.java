public class TypeCasting {
    public static void main(String[] args) {
        // automatic type casting
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);

        // Manual Type Casting
        double secondDouble = 9.0;
        int secondInt = (int) secondDouble;
        System.out.println(secondDouble);
        System.out.println(secondInt);

        // Real life example
        int maxScore = 500;
        int userScore = 423;

        float percentage = (float) userScore / maxScore * 100.0f;
        System.out.println(percentage);
    }
}
