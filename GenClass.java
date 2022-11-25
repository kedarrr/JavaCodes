class MyGen<T>
{
    T obj;
    void add(T obj)
    {
        this.obj=obj;
    }
    T get()
    {
        return obj;
    }
}

public class GenClass {
    public static void main(String[] args)
    {
        MyGen<Integer> m = new MyGen<Integer>();

        m.add(2);
        System.out.println(m.get());

        MyGen<String> m1 = new MyGen<String>();
        m1.add("asrt");
        System.out.println(m1.get());
    }
}
