package labsession7;

public class question2 
{
    public static void main(String[] args) 
    {
        int i = 1;
        try
        {
            i++;
        }
        catch (Exception e) 
        {
            i++;
        }
        finally
        {
            i++;
        }
        System.out.println(i);
    }
}
//output 3
