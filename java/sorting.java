public class sorting {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();

    }
    public static void main(String[]args){
        int arr []={23,43,3,76,32};
        for( int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
            if(arr[j]> arr[j+1]){
                int temp= arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }
        }
        }
         
        printArray(arr);
    }     

    

}
public void insertAfter(Node prev_node, int new_data)
{
    /* 1. Check if the given Node is null */
    if (prev_node == null) {
        System.out.println(
            "The given previous node cannot be null");
        return;
    }
 
    /* 2. Allocate the Node &
    3. Put in the data*/
    Node new_node = new Node(new_data);
 
    /* 4. Make next of new Node as next of prev_node */
    new_node.next = prev_node.next;
 
    /* 5. make next of prev_node as new_node */
    prev_node.next = new_node;
}