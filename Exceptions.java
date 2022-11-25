class MyException extends Exception
{
    MyException(String str)
    {
        super(str);
    }
}

class Operation
{
    void Arr(int[] a, int n)
    {
        try
        {
            if(n>a.length)
            {
                throw new MyException("ArrayIndexOutOfBound.");
            }
            else
            {
                System.out.println("Value: "+a[n]);
            }
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
    }
    
    void Str(String s, int n)
    {
        try
        {
            if(n>s.length())
            {
                throw new MyException("StringIndexOutOfBound.");
            }
            else
            {
                System.out.println("Value: "+s.charAt(n));
            }
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
    }
}

class Exceptions
{
    public static void main(String[] args) throws MyException
    {
        int[] a={1,2,3,4,5};
        String s="Kedar";
        Operation op = new Operation();
        op.Arr(a, 4);
        op.Arr(a, 8);
        op.Str(s, 2);
        op.Str(s, 6);
    }
}