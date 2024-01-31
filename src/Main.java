public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(1, 5)); //6
        System.out.println(calc.mult(1, 5)); //5
        System.out.println(calc.pow(1, 5)); //1
    }
}