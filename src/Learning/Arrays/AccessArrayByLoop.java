package Learning.Arrays;

public class AccessArrayByLoop {
    public static void main(String[] args) {
        int[] directDeclare= {50,60,70,80,90,100};

//        System.out.println(directDeclare[0]);
//        System.out.println(directDeclare[1]);
//        System.out.println(directDeclare[2]);
//        System.out.println(directDeclare[3]);
//        System.out.println(directDeclare[4]);

        int index = 0;
        // we can use to "length" to identify array length....... 'directDeclare.length'
        while (index < 6){
            System.out.println(directDeclare[index]);
            index++;
        }

    }
}
