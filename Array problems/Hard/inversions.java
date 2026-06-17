import java.util.*;
class main{
    public static void main(){
        int[] a = {1,2,3,5,4};
        int count  = 0;
        mergeSort(a,0,a.length-1,count);

        System.out.println("Inversions: " + count);
    }

    public static void mergeSort(int[] a, int l, int h,int count){
        if(l < h){
            int mid = (l + h)/2;
            mergeSort(a,l,mid,count);
            mergeSort(a,mid+1,h,count);

            merge(a,l,mid,h,count);
        }
    }

    public static void merge(int[] a, int l, int mid, int h,int count){
        int[] temp = new int[h-l+1];
        int i = l;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j<= h){
            if(a[i] <= a[j]){
                temp[k++] = a[i++];
            }
            else{
                count += mid-i+1;
                temp[k++] = a[j++];
            }
        }
        
        while(i<=mid){
            temp[k++] = a[i++];
        }
        while(j<=h){
            temp[k++] = a[j++];
        }
        for(int x = 0; x<temp.length; x++){
            a[l + x] = temp[x];
        }
    }
}