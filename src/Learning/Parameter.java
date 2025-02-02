package Learning;

public class Parameter {
    public static void main(String[] args) {
        int num= addNum(5,5);
        System.out.println("Addition: "+num );
    }

    public static int addNum(int a, int b){
        int sum = a+b;
        return sum;
    }
}
