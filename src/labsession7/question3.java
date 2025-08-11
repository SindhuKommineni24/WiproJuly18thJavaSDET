package labsession7;

public class question3 
{
    public static void main(String[] args) 
    {   
        try
        {
            System.out.println(1);
            int i = 100 / 0;
            System.out.println(2);
        }
        catch (Exception e) 
        {
            System.out.println(3);
        }
    }
}

//output :1
//3
