package Learning;

public class Unary_Operator {
    public static void main(String[] args) {
        int a = 5;

        // For (++)
        // first increment then use

        System.out.println(++a);
        System.out.println(a);

//        o/p: 9
//             9

        // first use then increment

        System.out.println(a++);
        System.out.println(a);

//        o/p: 5
//             6

//        For (--)

        int b = 5;

        System.out.println(--b);
        System.out.println(b);

//        o/p: 4      first decrement 5 and then use(print)
//             4


        System.out.println(b--);
        System.out.println(b);

//        o/p: 4
//             3
    }
}
