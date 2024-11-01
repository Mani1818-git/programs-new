class Addarray{
  public static void main(String[] args){
   int a[][]={{2,4,3},{5,7,6}};
    int b[][]={{3,4,5},{7,9,8}};
   int c[][]= new int[2][3];
   for(int i=0;i<2;i++){
   for(int j=0;j<3;j++){
 c[i][j]=a[i][j]+b[i][j];
   System.out.println(c[i][j]+" ");
   }
   System.out.println();
    }
  }
}