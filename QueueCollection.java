import java.util.*;

public class QueueCollection
{
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(12);
        q.add(23);
        q.add(34);

        Iterator itr = q.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        q.remove();
        Iterator itr1 = q.iterator();
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
    }
}