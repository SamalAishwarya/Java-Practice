package array;

public class JaggedArray {
    public static void main(String[] args) {
         int a[][] = new int[3][];

         a[0]= new int[]{1,2,3,4};
         a[1] = new int[]{5,6,7,8,8};
         a[2] =new int[]{7,8,9,2,3,4,5};


         for( int i=0;i<a.length;i++){
             for(int j=0;j<a[i].length;j++){
                 System.out.print(a[i][j]+" ");
             }
             System.out.println();
         }


//         jagged array - it is arays of array
    }
}
