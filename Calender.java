class Calender
{
    public static void main(String[] args)
    {
        int Y,Y1;

        int[] mon = {11,12,1,2,3,4,5,6,7,8,9,10};
        String[] d = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        System.out.println("Given Date: "+day+"/"+month+"/"+year);
        Y=year%100;
        Y1=year/100;

        int g = (day+((13*mon[month-1]-1)/5)+Y+(Y/4)+(Y1/4)-(2*Y1));
        int no = g%7;
        System.out.println("Day of given Date: "+d[no]);
    }
}