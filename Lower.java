class Lower{
    public static void main(String[] args){
        int arr[][]={{1,2,3},{2,6,8},{3,5,6}};
         int row,col;
          row=arr.length;
          col=arr[0].length;
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(j>i){
                    System.out.println("0");
                }else{
                    System.out.println(arr[i][j]+" ");
                }
            }
            System.out.println();
         }
    }
}