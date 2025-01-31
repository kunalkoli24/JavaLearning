package Learning;

public class Escape_Statement {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // To enclose world in single quote
        System.out.println("Hello 'World'");

        // To Enclose world in double quotes (Add \"word\")
        System.out.println("Hello \"World\" ");

        // to add '\'
        System.out.println("Hello \\World\\ ");

        //   \n : to print word in new line
        System.out.println("Hello \nWorld");

        // \b : insert backspacce at this point
        System.out.println("Hello \bWorld");  // o/p : HelloWorld
        System.out.println("Hello\bWorld");  // o/p : HellWorld

        // to add space of tab
        System.out.println("Hello \tWorld");

        //pattern 1 using Escape Sequence
        System.out.println("* \n** \n*** \n**** \n*****");

        //pattern 2 using Escape Sequence
        System.out.println("\n*****\n****\n***\n*");

        //pattern 3 using Escape Sequence
        System.out.println("     *\n    **\n   ***\n  ****\n *****");


    }
}
