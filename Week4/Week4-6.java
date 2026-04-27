class MyCircularQueue {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    Node front=null,rear=null;
    int k,size=0;
    public MyCircularQueue(int k) {
        this.k=k;
    }
    public boolean enQueue(int value) {
        if(isFull()) return false;
        Node nptr=new Node(value);
        if(isEmpty()){
            front=rear=nptr;
            rear.next=front;
        }else{
            rear.next=nptr;
            rear=nptr;
            rear.next=front;
        }
        size++;
        return true;
    }    
    public boolean deQueue() {
        if(isEmpty()) return false; 
        if(front==rear){
            front=rear=null;
        }else{
            front=front.next;
            rear.next=front;
        }
        size--;
        return true;
    }
    public int Front() {
        return isEmpty()?-1:front.val;
    }
    public int Rear() {
        return isEmpty()?-1:rear.val;   
    }
    public boolean isEmpty() {
        return size==0;   
    } 
    public boolean isFull() {
        return size==k;   
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
