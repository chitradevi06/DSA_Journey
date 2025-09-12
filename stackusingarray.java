public class stackusingarray {
    int top = -1;
    int stack[] = new int[10];
    public void push(int x){
        if(top == stack.length-1){
            System.out.println("Stack OVerflowwww");
        }else{
            top = top + 1;
            stack[top] = x;
            System.out.println( x + " pushed into stack");
        }
    }
    public void pop(){
        if(top == -1){
            System.out.println("Stack is already empty");
        }
        else{

           
            System.out.println(stack[top] + " is popped out");
             top = top - 1;
        }
       
    }
    public void top(){
        if(top == -1){
            System.out.println("No elemrnt found");

        }else{
            System.out.println("The top element " + stack[top]);
        }
    }
    public void size(){
        System.out.println("The size of stack " + (top+1));
    }
    public void display(){
        if(top == -1){
            System.out.println("stack is emptyy");

        }
        else{
            for(int i = 0 ; i <= top;i++){
                System.out.print(stack[i] + " ");
                
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[]){
        stackusingarray st = new stackusingarray();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        
        st.pop();
        st.top();
        st.size();
        st.display();
        


    }
    
}
