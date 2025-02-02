public class MergeSort {
    public static void main(String args[]) {
        int []arr={ 3, 4, 1, 6, 8, 2 };
        int []ans=mergesort(arr,0,arr.length-1);
        for(int a : ans)
        {
         System.out.print(a+" ");
        }
    }
    public static int[] mergesort(int []arr,int low,int high){
            if(low==high)
            {
                int bs[]=new int[1];
                bs[0]=arr[low];
                return bs;
            }
            int mid=(low+high)/2;
            int []left=mergesort(arr,low,mid);
            int []right=mergesort(arr,mid+1,high);
            int ans[]=merge(left,right);
            return ans;
      
}
    public static int[] merge(int[ ]left,int[] right) {
    
        int i=0;
        int j=0;
        int k=0;
        int temp[]=new int[left.length+right.length];
        while(i<left.length&&j<right.length)
        {
            if(left[i]<right[j])
            {
                temp[k++]=left[i];
                i++;
            }
            else
            {
                temp[k++]=right[j];
                j++;
            }
        }
        while(i<left.length)
        {
            temp[k++]=left[i++];
        }
        while(j<right.length)
          {
            temp[k++]=right[j++];
        }
        return temp;
    }
}
