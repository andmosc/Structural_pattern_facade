public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        String a = "1111";
        String b = "1111";
        System.out.println(a + " + " + b + " := " + binOps.sum(a, b));
        System.out.println(a + " * " + b + " := " + binOps.mult(a, b));
    }
}
