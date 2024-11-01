class Sort{
    public static void main(String[] args){
        int[] arr={5,7,9,2,1,6,4,};
        int  i,temp=0;
        System.out.println("original array");
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
        for(i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
      }
       System.out.println("After sorting");
      for(i=0;i<arr.length;i++){
        System.out.println(arr[i]+ " ");
      }
    }
}