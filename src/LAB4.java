public class LAB4 {
    public static void main(String[] args) {
        int[] list = new int[5];
        try {
            System.out.println("statement1");
//            System.out.println(1/0);
            System.out.println("statement3");
            System.out.println(list[5]);
        } catch (ArithmeticException ex1) {
            System.out.println("Arithmetic Error");
            throw ex1;
        } catch (IndexOutOfBoundsException ex2) {
            System.out.println("Out of Bound Error");
            throw ex2;
        } finally {
            System.out.println("Statement4");
        }
        System.out.println("Statement5");
    }
}
