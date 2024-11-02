class SecondSmall{
    public static int findSecondSmallest(int[] arr){
      int firstMin=Integer.MAX_VALUE;
      int secondMin=Integer.MAX_VALUE;
      for(int num: arr){
        if(num<firstMin){
            secondMin=firstMin;
            firstMin=num;
        }
        else if(num>firstMin && num<secondMin){
            secondMin=num;
        }
      }
      return secondMin;
    }
       public static void main(String[] args){
        int arr[]={4,5,7,2,1,4,8};
        int small=findSecondSmallest(arr);
        System.out.println("The second smallest is :" + small);
     }
}