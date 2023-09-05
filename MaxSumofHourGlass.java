import java.math.*;
import java.util.*;

public class MaxSumofHourGlass {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter Number of Rows");
        int rows=sc.nextInt();
        System.out.println("ENter Number of Columns");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for (int j=0;j<rows;j++){
                
                System.out.println("Enter Element : "+ i +" ," + j );
                int inta = sc.nextInt();
                a[i][j] = inta;
            }
        }

        if(rows<3||cols<3){
            System.out.println("Not Possible");
        }else{
            int S = 0;
            int max=0;
            for(int i=0;i<rows-2;i++){

                for(int j=0;j<cols-2;j++){
                    S = a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                    max = Math.max(S,max);
                }   
            }
            System.out.println(max);
        }
    }
}
