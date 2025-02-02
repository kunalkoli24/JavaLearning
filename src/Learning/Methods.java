package Learning;

public class Methods {
    public static void main(String[] args) {

        // Blocks of resuable code
        // DRY principle: Don't Repeat Yourself   (Code reusability)
        // Naming rule: same a variable names-camelCase

        //Syntax:

//        modifier  return-type  method_name (parameters){
//            body
//        }



        Pattern();  // Method call inside main class
    }
    //Method outside the main class
    public  static void  Pattern(){
        int row = 0;
        while(row < 5){
            System.out.print("*");
            int i = 0;
            while (i < row){
                System.out.print("*");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}

//o/p:    *
//        **
//        ***
//        ****
//        *****