public class LAB3 {
    public static void main(String[] args) {
        try{
            System.out.println("statement1");
            System.out.println(1/0);
            System.out.println("Statement3");
        } catch (Exception e){
            System.out.println(e.toString());
        } finally {
            System.out.println("Statement4");
        }
        System.out.println("Statement5");

    }
}
