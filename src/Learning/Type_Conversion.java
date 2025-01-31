package Learning;

public class Type_Conversion {
    public static void main(String[] args) {
        // Implicit conversion or Widening.   (Automatic Conversion)

        // byte -> short -> int -> long -> float -> double

        // Valid Once
        short s = 3; //valid as size of short is greater than byte. automatically converts it.
        System.out.println(s);

        long l = 3; //valid as size of long is greater than int. automatically converts it.
        System.out.println(l);

        int i = 23;
        System.out.println(i);

        float f = 23;
        System.out.println(f);

        double d = 34.67f;
        System.out.println(d);

        // Invalid Once
        //int I = 23.45f; // Not valid as size of int is smaller then float


        // Explicit or Narrowing

        // We Forcefully convert

        // byte <- short <- int <- long <- float <- double

        //int I = 23.45f; //not valid
        int myInt = (int) 23.45f; // here floating number is converted into integer and stored in myInt
        System.out.println(myInt);

        short myShort = (short) 2;
        System.out.println(myShort);

        double D = (double) 23342423;
        System.out.println(D);

        float F = (float) 34.45;
        System.out.println(F);

    }
}
