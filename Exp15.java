import java.util.*;

class Customer
{
    int id;
    String name;
    String author;
    int qty;
    Customer(int id, String name, String author, int qty)
    {
        this.id = id;
        this.name = name;
        this.author = author;
        this.qty = qty;
    }
}

class Exp15
{
    public static void main(String[] args)
    {
        Customer c1 = new Customer(1, "Kedar", "safdf", 23);
        Customer c2 = new Customer(2, "vafar", "safcdf", 25);

        ArrayList<Customer> al = new ArrayList<Customer>();
        al.add(c1);
        al.add(c2);

        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            Customer cst = (Customer)itr.next();
            System.out.println("Values: "+cst.id+cst.name+cst.author+cst.qty);
        }
    }
}