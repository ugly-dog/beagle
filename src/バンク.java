import java.util.Scanner;

public class バンク {
    int[] Available={20,31,9};
    int[][] Max=new int[3][3];
    int[][] Allocation=new int[3][3];
    int[][] Needs=new int[3][3];
    int[][] Request=new int[3][3];
    int [] Work=new int[3]
    int num=0;
    Scanner in=new Scanner(System.in);
public void setSystemVar(){
    setMax();
    setAllocation();
    printSystemVar();
    SecAlgorithm();
}
public void setMax(){
    System.out.println("Pls set the max need of Max");
    for (int i=0;i<3;i++){
        System.out.println("pls input amount of process :"+i);
        for (int j=0;j<3;j++){
            Max[i][j]=in.nextInt();
        }
    }
}
public void setAllocation(){
    System.out.println("pls set process matrix Allocation");
    for (int i=0;i<3;i++){
        System.out.println("pls input amount of process :"+i);
        for (int j=0;j<3;j++){
            Allocation[i][j]=in.nextInt();
        }
    }
    System.out.println("Available=Available-Allocation");
    System.out.println("Needs=Max-Allocation");
    for (int i=0;i<3;i++){
        for (int j=0;j<3;j++){
            Available[i]=Available[i]-Allocation[j][i];
        }
    }
   for (int i=0;i<3;i++){
        for (int j=0;j<3;j++){
            Needs[i][j]=Max[i][j]-Allocation[i][j];
        }
   }
}
    public  void printSystemVar(){
    System.out.println("Resource allocation as follow:");
    System.out.println("Process"+"Max"+);

    }
}
