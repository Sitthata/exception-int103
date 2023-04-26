public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        } catch (ArithmeticException e) {
            StackTraceElement[] stackTraceElements = e.getStackTrace();
            for(var except : stackTraceElements) {
                System.out.println(except.getClassName());
                System.out.println(except.getFileName());
                System.out.println(except.getLineNumber());
                System.out.println(except.getMethodName());
            }
        }
    }
}