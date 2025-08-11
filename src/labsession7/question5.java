package labsession7;

public class question5 
{
    public static void main(String[] args) 
    {   
        System.out.println(1);
        try
        {
            System.out.println(2);
            int i = Integer.parseInt("ABC");
            System.out.println(3);
        }
        catch (Exception e) 
        {
            System.out.println(4);
        }
        finally
        {
            System.out.println(5);
        }
        System.out.println(6);
    }
}

//1
//2
//4
//5
//6
