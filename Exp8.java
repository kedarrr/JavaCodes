import java.util.Scanner;

class MyException extends Exception
{
    MyException(String str)
    {
        super(str);
    }
}

class Operation
{
    void Addtion(int a, int b) throws MyException
    {
        try
        {
            if((a+b)>1000)
            {
                throw new MyException("TooLongAddition.");
            }
            else
            {
                System.out.println("Addition: "+(a+b));
            }
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
    }

    void Multi(int a,int b) throws MyException
    {
        try
        {
            if((a*b)>5000)
            {
                throw new MyException("TooLongMultiplication.");
            }
            else
            {
                System.out.println("Multiplicstion: "+(a*b));
            }
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
    }
}

class Exp8
{
    public static void main(String[] args) throws MyException
    {
        Operation op = new Operation();
        op.Addtion(23, 12);
        op.Addtion(1000,10);
        op.Multi(50,12);
        op.Multi(10,5000);
    }
}