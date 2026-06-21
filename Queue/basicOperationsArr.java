public class basicOperationsArr{
    public static void main(String args[]){

        QueueArray queue = new QueueArray(10);
        

    }
}

class QueueArray{
    int queueArr[];
    int front;
    int rear;
    int capacity; //max no of elements
    int size;   //min number of elements

    QueueArray(int capacity){
        this.capacity = capacity;
        front = -1;
        rear = 0;
        size = 0;
        queueArr = new int [capacity];
    }
    
}