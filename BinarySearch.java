import java.util.*;

public class BinarySearch {
    public static int BinarySearch(int[]arr,int target){
        int st=0,  end=arr.length-1;
        while (st<=end){
            int mid=(st+end)/2;

            if (target <arr[mid]) {
                end=mid-1;
            } else if (target>arr[mid]){
             st=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,5,9,10,22,36};
        Scanner sc=new Scanner(System.in);
        System.out.printf("enter your desire number: ");
        int target=sc.nextInt();
        int result=BinarySearch(arr, target);
        if (result==-1){
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at index: "+ result);
        }
    }
}
