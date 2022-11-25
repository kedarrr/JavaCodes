import java.util.Scanner;

interface StacksI
{
    int push(int a);
    int pop();
    void peek();
}

interface QueueI
{
    int enqueue(int data);
	int dequeue();
	void qdisplay();
}

class StackQueue implements StacksI, QueueI
{
    int sizes,sizeq;
    int top=-1,front=-1,rear=-1;
    int[] sarr, qarr;
    StackQueue(int s, int q)
    {
        this.sizes=s;
        this.sizeq=s;
        this.sarr = new int[sizes];
        this.qarr = new int[sizeq];
    }
    
    public int push(int data) {

		if (this.top == this.sizes - 1) 
		{
			return -1;
		} 
		else 
		{
			top++;
			this.sarr[this.top] = data;
			return 1;
		}
	}

	public int pop() {
		if (this.top == -1) 
		{
			return -1;
		} 
		else 
		{
			int temp = this.sarr[this.top];
			this.top--;
			return temp;
		}
	}

	public void peek() {
		//for (int i = this.top; i >= 0; i--) 
		{
			System.out.println(this.sarr[top]);
		}
	}

	public int enqueue(int data) {
		if (this.rear == this.sizeq - 1) 
		{
			return -1;
		} 
		else 
		{
			if (this.front == -1 & this.rear == -1) {
				this.front = 0;
			}
			this.rear++;
			this.qarr[this.rear] = data;
			return 1;
		}
	}

	public int dequeue() {
		if (this.front == -1) 
		{
			return -1;
		} 
		else 
		{
			int temp = this.qarr[this.front];
			this.front++;
			if (this.front > this.rear) 
			{
				this.front = -1;
				this.rear = -1;
			}
			return temp;
		}
	}

	public void qdisplay() 
	{
		for (int i = this.front; i <= this.rear; i++) 
		{
			System.out.print(this.qarr[i] + " ");
		}
	}
}

class SQInterface
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Stack: ");
		int sizes = sc.nextInt();
		System.out.println("Enter size of Queue: ");
		int sizeq = sc.nextInt();
        StackQueue sq = new StackQueue(sizes, sizeq);

        while (true) 
		{
			System.out.println("\n1.Stack\n2.Queue\n3.Exit");
			int ch = sc.nextInt();
			switch (ch) 
			{
				case 1:
					int choice;
					do 
					{
						System.out.print("1.Push\n2.Pop\n3.Display\n4.Exit Stack\nEnter your choice: ");
						choice = sc.nextInt();
						switch (choice) 
						{
							case 1:
								System.out.print("Enter the data: ");
								int data = sc.nextInt();
								int temp1 = sq.push(data);
								if (temp1 == -1) 
								{
									System.out.println("Stack Overflow");
								} 
								else 
								{
									System.out.println(data + " pushed");
								}
								break;
							case 2:
								int temp2 = sq.pop();
								if (temp2 == -1) 
								{
									System.out.println("Stack Underflow");
								} 
								else 
								{
									System.out.println(temp2 + " poped");
								}
								break;
							case 3:
								sq.peek();
								break;
							default:
								System.out.println("Enter valid choice");
								break;
						}
					} while ((choice != 4));
					break;
				case 2:
					do 
					{
						System.out.print("1.Enqueue\n2.Dequeue\n3.Display\n4.Exit Queue\nEnter your choice: ");
						choice = sc.nextInt();
						switch (choice) 
						{
							case 1:
								System.out.println("Enter the data: ");
								int data = sc.nextInt();
								int temp = sq.enqueue(data);
								if (temp == -1) 
								{
									System.out.println("Queue is full");
								} 
								else 
								{
									System.out.println(data + " enqueued");
								}
								break;
							case 2:
								int temp1 = sq.dequeue();
								if (temp1 == -1) 
								{
									System.out.println("Queue is Empty");
								} 
								else 
								{
									System.out.println(temp1 + " Dequeued");
								}
								break;
							case 3:
								sq.qdisplay();
								break;
						}
					} while (choice != 4);
					break;
				case 3:
					System.exit(0);
			}
		}
    }
}