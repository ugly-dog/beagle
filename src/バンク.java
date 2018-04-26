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
    System.out.println("Process"+"Max"+"  Allocation"+"    Needs"+"Available");
    for (int i=0;i<3;i++){
        System.out.print("P"+i+"   ");
        for (int j=0;j<3;j++){
            System.out.print(Max[i][j]+"   ");

        }
        System.out.print("|  ");
        for(int j=0;j<3;j++){
            System.out.print(Allocation[i][j]+"   ");
        }
        System.out.print("|  ");
        for(int j=0;j<3;j++){
            System.out.print(Needs[i][j]+"  ");
        }
        System.out.print("|   ");
        if (i==0){
            for (int j=0;j<3;j++){
                System.out.print(Available[j]+"  ");
            }
        }
        System.out.println();
    }

    }
    public void setRequest(){
    System.out.println("pls input No. of Resoruce");
    num=in.nextInt();
    System.out.println("pls input amount for per process");
    for (int j=0;j<3;j++){
        Request[num][j]=in.nextInt();
    }
    System.out.println("Process "+num+" request resource:("+Request[num][0]+","+Request[num][1]+","+Request[num][2]+").");
        进撃のアド達();
    }
    public void 进撃のアド達(){
    boolean T=true;
    if (Request[num][0]<=Needs[num][0]&&Request[num][1]<=Needs[num][1]&&Request[num][2]<=Needs[num][2]){
        if (Request[num][0]<=Available[0]&&Request[num][1]<=Available[1]&&Request[num][2]<=Available[2]){
            for (int i=0;i<3;i++){
                Available[i]-=Request[num][i];
                Allocation[num][i]+=Request[num][i];
                Needs[num][i]-=Request[num][i];
            }
        }else{
            System.out.println("There is no enough Resource to allocate,Process:"+num+" need to waiting.");
            T=false;
        }
    }else {
        System.out.println("Process:"+num+" has request a exceed amount of nedds");
        T=false;
    }
    if (T==true){
        printSystemVar();
        System.out.println("now call ほあん");
        ほあん();
    }
    }
    public void ほあん(){
        boolean[] Finish={false,false,false};
        int count=0;
        int circle=0;
        int[] S=new int[3];
        for (int i=0;i<3;i++){
            Work[i]=Available[i];
        }
        boolean flag=true;
        while (count<=3){
           if (flag){
               System.out.println("Process  "+"  Work  "+"  Allocation  "+"  Need  "+"  Work+Allocation ");
               flag=false;
           }
        }

    }
}
