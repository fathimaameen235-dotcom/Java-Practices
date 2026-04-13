public class MergeNum {
    public static void main(String arg[]){
        int ar[]={1,2,3,4};
        int arr[]={5,6,7,8,9};
        int ar3[]=new int[ar.length+arr.length];

        for(int i=0;i<ar.length;i++){
          ar3[i]=ar[i];
          System.out.println(ar3[i]);
        }
        for(int i=0;i<arr.length;i++){
            ar3[ar.length+i]=arr[i];
            System.out.println(ar3[ar.length+i]);
        }
        
    }
}
