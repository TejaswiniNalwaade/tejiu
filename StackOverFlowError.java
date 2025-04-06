public class StackOverFlowError 
{
    public static void main(String[] args) 
    {
        PrintNum t = new PrintNum();
        t.printNum();
    }
}

class PrintNum
{
    int count=1;
    public void printNum()
    {
        if(count<=100000)
        {
            System.out.println(count);
            count++;
            printNum();
        }
    }
}
