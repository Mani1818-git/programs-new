class Identity{
    public static void main(String[] args){
        int row,col;
        int i, j;
        boolean flag=true;
        int a[][]={{1,0,0},{0,1,0},{0,0,1}};
          row=a.length;
          col=a[0].length;
          for( i=0;i<row;i++){
            for( j=0;j<col;j++){
                if(i==j && a[i][j]!=1){
                    flag=false;
                    break;
                }
                 if(i!=j && a[i][j]!=0){
                    flag=false;
                    break;
                }
            }
          }
          if(flag){
            System.out.println("Given Matrix is a Identity matrix");
          } else{
            System.out.println("It is not a identity matrix");
          }
    }
}