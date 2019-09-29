public class ReverseArray {
    public static void main(String[] args) {
    int[]arr={1,3,5,1,5,6,7,3};
    for (int i=0;i<arr.length/2;i++){
        int temp=arr[i];
        arr[i]=arr[arr.length-1-i];
        arr[arr.length-1-i]=temp;
        }
       for (int j=0;j<arr.length;j++){
           System.out.print(arr[j]+"\t");
       }
    }
}
