class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class stackusingll {
    Node top = null;
    int size = 0;
    public void push(int x){
        Node temp = new Node(x);
        temp.next = top;
        top = temp;
        size++;
        System.out.println(x + " is pushed ! ");
    }
    public void pop(){
        if(top == null){
            System.out.println("Stack is underflow");
        }
        System.out.println(top.data + " is popped ! ");
        top = top.next;
        size--;

    }
    public void top(){
        System.out.println(top + " is the top element ");
    }

    public void size(){
        System.out.println("The size of the stack is " + size);
    }


    public void display(){
        if(top == null){
            System.out.println("The stack is null !");
        }
        Node temp = top;
        System.out.println("Stack elements : ");
        while(temp != null){
            System.out.println(temp.data );
            temp = temp.next;


        }
        System.out.println();
    }
    

public static void main(String args[]){
    stackusingll sa = new stackusingll();
    sa.push(3);
    sa.push(2);
    sa.push(1);
    sa.display();
    sa.top();
    
    sa.pop();
    sa.display();

    sa.size();

}
}

