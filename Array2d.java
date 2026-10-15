public class Array2d {
    public  static void main(String [] args){
      int [][] matrix = {
        {1,2,3},
        {4,5,6},
        {43,24,12},
        {12,34,99}
      };
      System.out.println(matrix[1][2]);

      for(int i =0;i<matrix.length;i++){
        for(int j =0;j<matrix[i].length;j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
      }
    }
}
