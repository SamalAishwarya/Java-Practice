package array;

public class DuplicateArray {
    public static void main(String[] args) {
    int a[]= { 1,1,2,3,9,8,3,1,5,4};


        System.out.println("Duplicate values in th array");
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println(a[j]);
                    continue;
                }
            }
        }

    }
}
