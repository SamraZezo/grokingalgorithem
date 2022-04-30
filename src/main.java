public class main {


    public static void binarySearch(int arr[], int first, int last, int key){
        int mid = (first + last)/2;
        int loops = 0;
        while( first <= last ){
            loops ++;
            System.out.println(loops);
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 9;
        int last=arr.length-1;
        binarySearch(arr,0,last,key);
    }

}
