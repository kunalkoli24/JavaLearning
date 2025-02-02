package Learning.Control_Loops;

public class While_Loop {
    public static void main(String[] args) {
        // used for non-standard conditions
        // Repeating a block of code while a condition is true
        // Note: Always include an update to avoid infinite loops

        // Syntax:

//        while (initialization, condition, increment/decrement);

        // To print number from 1 to 10 using while loop

        int num = 0;
        while(num <=15){
            System.out.println(num);
            num++;

            int num2 = 15;
            while(num2 >=5){
                System.out.println(num2);
                num2--;
            }
        }
    }
}
