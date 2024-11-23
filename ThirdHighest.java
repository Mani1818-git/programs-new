class ThirdHighest{
  public static int getnum(int[] a,int total){
    int temp;
    for(int i=0;i<total;i++){
       for(int j=i+1;j<total;j++){
        if(a[i]>a[j]){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
       }
    }
    return a[total-3];
  }
    public static void main(String[] args){
        int a[]={3,4,7,8,5,4,6};
        int b[]={44,78,35,21,12};
          
        System.out.println("Third Highest:"  +getnum(a,7));
        System.out.println("Thired Highest:" +getnum(b,5));
    }
}