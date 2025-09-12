public class queueusingarray {
    int size = 10;
    int queue[] = new int[size];
    int currsize = 0;
    int start = -1;
    int end = -1;

    public void push(int x){
        if(currsize == size){
            System.out.println("The queue is full ! ");
            return;
        }
        if(currsize == 0){
            start = 0;
            end = 0;
        }
        else{
            end = (end + 1) % size;
        }
        queue[end] = x;
        currsize++;
        System.out.println(x + " is added ");

    }
    public void pop(){
        if(currsize == 0){
            System.out.println("No element to pop out");
        }
        int removedele = queue[start];
        if(currsize == 1){
            start = -1;
            end = -1;
        }
        else{
        start = (start + 1) % size;
        
        }
        currsize--;
        System.out.println(removedele + " removed from queue");
    }
    public void display(){
        for(int i = 0 ; i < size;i++){
            System.out.println(queue[i]);
        }
    }
    public void top(){
        if(currsize == 0){
            System.out.println("No element is availabe");
        }
        else{
            System.out.println("The top element is " + queue[start]);

        }
    }
    public void size(){
        System.out.println("The size of the queue is " + size);
    }
    public static void main(String[] args) {
        queueusingarray q = new queueusingarray();
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.pop();
        q.pop();
        q.top();
        q.size();
    }
    
}
