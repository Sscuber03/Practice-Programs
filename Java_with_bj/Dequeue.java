class Dequeue
{
    int MAX,front,rear;
    int arr[];
    Dequeue()
    {
        MAX=10;
        arr=new int[10];
        front=rear=-1;
    }
    public void main()
    {
        int i,n;
        for(i=0;i<MAX;i++)
        {
            arr[i]=0;
        }
        addqatend(17);
        addqatbeg(10);
        addqatend(8);
        addqatbeg(-9);
        System.out.println("\nElements in a dequeue: ");
        display();
        i=delqatbeg();
        System.out.println("\nItem Extracted: "+i);
        i=delqatend();
        System.out.println("\nItem Extracted: "+i);
        display();
        addqatend(16);
        addqatbeg(7);
        display();
        i=delqatbeg();
        System.out.println("\nItem Extracted: "+i);
        i=delqatend();
        System.out.println("\nItem Extracted: "+i);
        display();
    }
    void addqatbeg(int item)
    {
        int i,k,c;
        if(front==0 && rear==MAX-1)
        {
            System.out.println("\nDequeue is full.\n");
            return;
        }
        if(front==-1)
        {
            front=rear=0;
            arr[front]=item;
            return;
        }
        if(rear!=MAX-1)
        {
            k=rear+1;
            for(i=0;i<=rear;i++)
            {
                arr[k]=arr[k-1];
                k--;
            }
            arr[k]=item;
            front=k;
            rear++;
        }
        else
        {
            front--;
            arr[front]=item;
        }
    }
    void addqatend(int item)
    {
        int i,k;
        if(front==0 && rear==MAX-1)
        {
            System.out.println("\nDequeue is full.\n");
            return;
        }
        if(front==-1)
        {
            rear=front=0;
            arr[rear]=item;
            return;
        }
        if(rear==MAX-1)
        {
            k=front-1;
            for(i=front-1;i<rear;i++)
            {
                k=i;
                if(k==MAX-1)
                {
                    arr[k]=0;
                }
                else
                {
                    arr[k]=arr[i+1];
                }
            }
            rear--;
            front--;
        }
        rear++;
        arr[rear]=item;
    }
    int delqatbeg()
    {
        int item;
        if(front==-1)
        {
            System.out.println("\nDequeue is empty.\n");
            return 0;
        }
        item=arr[front];
        arr[front]=0;
        if(front==rear)
        {
            front=rear=-1;
        }
        else
        {
            front++;
        }
        return item;
    }
    int delqatend()
    {
        int item;
        if(front==-1)
        {
            System.out.println("\nDequeue is empty.\n");
            return 0;
        }
        item=arr[rear];
        arr[rear]=0;
        rear--;
        if(rear==front-1)
        {
            front=rear=-1;
        }
        return item;
    }
    void display()
    {
        System.out.print("\n Front-> ");
        for(int i=front;i<=rear;i++)
        {
            if(i==rear)
            System.out.print(arr[i]+"\t ");
            else
            System.out.println(arr[i]+"\t ");
        }
        System.out.println("<- Rear");
    }
}