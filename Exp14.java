import java.util.Random;

class Square extends Thread
{
    int x;
    Square(int x)
    {
        this.x=x;
    }
    public void run()
    {
        System.out.println("Square: "+(x*x));
    }
}

class Cube extends Thread
{
    int x;
    Cube(int x)
    {
        this.x=x;
    }
    public void run()
    {
        System.out.println("Cube: "+(x*x*x));
    }
}

class Exp14 extends Thread
{
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            Random rn = new Random();
            int x = rn.nextInt(0,20);
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
                Square sq = new Square(x);
                sq.start();
            }
            else
            {
                Cube cb = new Cube(x);
                cb.start();
            }
        }
    }

    public static void main(String[] args)
    {
        Exp14 m = new Exp14();
        m.start();
    }
}