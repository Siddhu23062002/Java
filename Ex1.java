import java.io.FileInputStream;

public class Ex1 {
    public static void method() throws Exception
    {
        FileInputStream fx = new FileInputStream("A1.txt");
        System.out.println("In Main");
    }
    public static void main(String args[])
    {
        try
        {
            method();
        }
        catch (Exception e)
        {
            System.out.println("Handled in main");
        }
    }
}
