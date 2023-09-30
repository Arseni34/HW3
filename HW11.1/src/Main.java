public class Main {
    public static void main(String[] args) {
        System.out.println("Task *");
        try{
            throw new ArithmeticException();
        }
        catch (ArithmeticException e){
            System.exit(0);
        }
        finally {
            System.out.println("finally выполнился");
        }
    }
}