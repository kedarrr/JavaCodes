import java.util.Random;

class Fact extends Thread
{
    int x;
    long ft=1;
    Fact(int x)
    {
        this.x=x;
    }
    public void run()
    {
        for(int i=1; i<=x; i++)
        {
            ft = ft * i;
        }
        System.out.println("Factorial: "+ft);
    }
}

class Squares extends Thread
{
    int x;
    Squares(int x)
    {
        this.x=x;
    }
    public void run()
    {
        System.out.println("Square: "+(x*x));
    }
}

class MultiFact extends Thread
{
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            Random rn = new Random();
            int x = rn.nextInt(0,50);
            try
            {
                sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            if(x%2 == 0)
            {
                Fact ft = new Fact(x);
                ft.start();
            }
            else
            {
                Squares sq = new Squares(x);
                sq.start();
            }
        }
    }

    public static void main(String[] args)
    {
        MultiFact mf = new MultiFact();
        mf.start();
    }
}