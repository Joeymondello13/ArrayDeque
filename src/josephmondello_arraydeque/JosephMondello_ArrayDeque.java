package josephmondello_arraydeque;


public class JosephMondello_ArrayDeque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayDeque<Integer> myArray = new ArrayDeque<>();
        
        myArray.enqueueFront(12);
        myArray.enqueueFront(2532);
        
        
        System.out.println(myArray.dequeueRear());
        System.out.println(myArray.dequeueRear());

        
        int i = 0;
        while(!myArray.isFull()){
            myArray.enqueueRear(i);
            i++;
        }
       
        while(!myArray.isEmpty()){
            System.out.println("Element" + "[" + (i-1) + "]: " + myArray.dequeueRear());
            i--;
        }
    }
 }
    

