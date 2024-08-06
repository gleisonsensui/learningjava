public class OperadoresLogicos {
    public static void main(String[] args) {
        int a = 10;
        double b = 5.5;
        int c = 5;

        boolean andOp = a > b && b > c && c > a;
        System.out.println(andOp);

        boolean orOp = a > b || b > c || c > a;
        System.out.println(orOp);

        

    }
}
