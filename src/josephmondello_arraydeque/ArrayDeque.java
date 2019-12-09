
package josephmondello_arraydeque;

public class ArrayDeque<T> implements DequeInterface<T> {
    
    private int front = 0;
    private int back = 0;
    private final int MAX = 100;
    private T[] array = (T[]) new Object[MAX];
    private int size = 0;

    @Override
    public void enqueueFront(T element) throws QueueOverflowException {
        if(isEmpty()){
            array[front] = element;
            size++;
        }
        else if(!isFull()){
            if((front - 1) < 0){
                front = 99;
                array[front] = element;
                size++;
            }
            else{
            front--;
            array[front] = element;
            size++;
            }
        }
        else throw new QueueOverflowException("Queue is full. ");
    }

    @Override
    public void enqueueRear(T element) throws QueueOverflowException {
        if(!isFull()){
            back = (back + 1) % array.length;
            array[back] = element;
            size++;
        }
        else throw new QueueOverflowException("Queue is full. ");
        
    }

    @Override
    public T dequeueFront() throws QueueUnderflowException {
        if(!isEmpty()){
            T temp = array[front];
            front = (front + 1) % array.length;
            size--;
            return temp;
        }
        else throw new QueueUnderflowException("Queue is empty.");
    }

    @Override
    public T dequeueRear() throws QueueUnderflowException {
        if(!isEmpty()){
            T temp = array[back];
            if(back - 1 < 0){
                back = 99;
                size--;
                return temp;
            }
            else{
                back--;
                size--;
                return temp;
            }
        }
        else throw new QueueUnderflowException("Queue is Empty. ");
    }

    @Override
    public boolean isFull() {
        return (size == array.length);
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public int size() {
        return size;
    }
    public int getFront(){
        return front;
    }
    public int getBack(){
        return back;
    }
    
}
