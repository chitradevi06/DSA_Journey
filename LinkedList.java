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
    public class LinkedList{ 
        private static Node convertToArray(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = mover.next;
        }
        return head; 
    }
    private static Node removeHead(Node head){
        if(head==null) return head;
        Node temp = head;
        head = head.next;
       
           return head;
    }
 
    private static Node removeLast(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next.next!= null){
            temp = temp.next;

        }
        temp.next = null;
        return head;
    }
    private static Node removeK(Node head,int k){
        if(head==null){
            return head;
        }
        if(k==1){
            Node temp = head;
            head = head.next;
            return head;
        }
        int count = 0;
        Node prev = null;
        Node temp = head;
        while(temp!=null){
            count++;
            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev=temp;
            temp = temp.next;
        }
        return head;
    }
    private static Node InsertAtPostion(Node head,int k,int ele){
        if(head == null){
            if(k==1){
                return new Node(ele);
            }
            else{
                return null;
            }

        }
        if(k==1){
            return new Node(ele,head);

        }
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            if(count == k-1){
                Node x = new Node(ele);
                x.next = temp.next;
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        Node head = convertToArray(arr);
       // head = removeHead(head);
        //head = removeLast(head);
       // head = removeK(head,2);
       head = InsertAtPostion(head, 3, 3 );
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
        


    }
}