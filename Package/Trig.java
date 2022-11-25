package MyPack;

public class Trig
{
    public void sine(double deg)
    {
        double rad = Math.toRadians(deg);
        System.out.println("Sine: "+Math.sin(rad));
    }
    public void cos(double deg)
    {
        double rad = Math.toRadians(deg);
        System.out.println("Cos: "+Math.cos(rad));
    }
    public void tan(double deg)
    {
        double rad = Math.toRadians(deg);
        System.out.println("Tan: "+Math.tan(rad));
    }
    public void cot(double deg)
    {
        double rad = Math.toRadians(deg);
        System.out.println("Cot: "+(1/Math.tan(rad)));
    }
    public void sec(double deg)
    {
        double rad = Math.toRadians(deg);
        System.out.println("Sec: "+(1/Math.cos(rad)));
    }
    public void cosec(double deg)
    {
        double rad = Math.toRadians(deg);
        System.out.println("Cosec: "+(1/Math.sin(rad)));
    }
}
