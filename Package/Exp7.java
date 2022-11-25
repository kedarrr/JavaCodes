import MyPack.Arithmatic;
import MyPack.Stat;
import MyPack.Trig;

import java.util.Scanner;

public class Exp7 
{
    public static void main(String[] args)
    {
        Arithmatic a = new Arithmatic();
        a.Add(15, 10);
        a.Sub(15, 10);
        a.Mul(15, 10);
        a.Div(15, 10);

        Stat s = new Stat();
        float[] arr={1,2,3,4,5};
        System.out.println(s.min(arr));
        System.out.println(s.max(arr));
        System.out.println(s.sum(arr));
        System.out.println(s.average(arr));

        Trig t = new Trig();
        t.sine(45);
        t.cos(45);
        t.tan(45);
        t.cot(45);
        t.sec(45);
        t.cosec(45);
    }    
}