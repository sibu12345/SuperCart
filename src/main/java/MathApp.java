
public class MathApp {

    public MathApp() {}

    static public int add(int a, int b) {
        return a + b;
    }

    static public int minus(int a, int b) {
        return a - b;
    }

    static public int multiply(int a, int b) {
        return a * b;
    }

    static public double divide(int a, int b){
        double c=0.0;
        try{
            c= a/b;
        }catch(Exception e) {
            throw new IllegalArgumentException();
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println("1 + 1 = " + add(1,1));
        System.out.println("1 - 1 = " + minus(1,1));
        System.out.println("1 x 2 = " + multiply(1,2));
        System.out.println("4 / 2 = " + divide(4,2));

    }

}
