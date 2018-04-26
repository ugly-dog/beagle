import java.util.Scanner;

public class バンク {
    int[] 可用={20,31,9};
    int[][] 最大=new int[3][3];
    int[][] 割り当て=new int[3][3];
    int[][] 必要=new int[3][3];
    int[][] アプライ=new int[3][3];
    int [] 作業=new int[3];
    int num=0;
    Scanner in=new Scanner(System.in);
public void 置くSystemVar(){
    置く最大();
    置く割り当て();
    printSystemVar();
    ほあん();
}
public void 置く最大(){
    System.out.println("Pls 置く the 最大 必要 of 最大");
    for (int i=0;i<3;i++){
        System.out.println("pls 入力 量 of プロセス :"+i);
        for (int j=0;j<3;j++){
            最大[i][j]=in.nextInt();
        }
    }
}
public void 置く割り当て(){
    System.out.println("pls 置く プロセス マトリックス 割り当て");
    for (int i=0;i<3;i++){
        System.out.println("pls 入力 量 of プロセス :"+i);
        for (int j=0;j<3;j++){
            割り当て[i][j]=in.nextInt();
        }
    }
    System.out.println("可用=可用-割り当て");
    System.out.println("必要=最大-割り当て");
    for (int i=0;i<3;i++){
        for (int j=0;j<3;j++){
            可用[i]=可用[i]-割り当て[j][i];
        }
    }
   for (int i=0;i<3;i++){
        for (int j=0;j<3;j++){
            必要[i][j]=最大[i][j]-割り当て[i][j];
        }
   }
}
    public  void printSystemVar(){
    System.out.println("Resource 割り当て as follow:");
    System.out.println("プロセス     "+"      最大"+"     割り当て"+"    必要"+"     可用");
    for (int i=0;i<3;i++){
        System.out.print("P"+i+"   ");
        for (int j=0;j<3;j++){
            System.out.print(最大[i][j]+"   ");

        }
        System.out.print("|  ");
        for(int j=0;j<3;j++){
            System.out.print(割り当て[i][j]+"   ");
        }
        System.out.print("|  ");
        for(int j=0;j<3;j++){
            System.out.print(必要[i][j]+"  ");
        }
        System.out.print("|   ");
        if (i==0){
            for (int j=0;j<3;j++){
                System.out.print(可用[j]+"  ");
            }
        }
        System.out.println();
    }

    }
    public void 置くアプライ(){
    System.out.println("pls 入力 No. of Resoruce");
    num=in.nextInt();
    System.out.println("pls 入力 量 for per プロセス");
    for (int j=0;j<3;j++){
        アプライ[num][j]=in.nextInt();
    }
    System.out.println("プロセス "+num+" アプライ resource:("+アプライ[num][0]+","+アプライ[num][1]+","+アプライ[num][2]+").");
        进撃のアド達();
    }
    public void 进撃のアド達(){
    boolean T=true;
    if (アプライ[num][0]<=必要[num][0]&&アプライ[num][1]<=必要[num][1]&&アプライ[num][2]<=必要[num][2]){
        if (アプライ[num][0]<=可用[0]&&アプライ[num][1]<=可用[1]&&アプライ[num][2]<=可用[2]){
            for (int i=0;i<3;i++){
                可用[i]-=アプライ[num][i];
                割り当て[num][i]+=アプライ[num][i];
                必要[num][i]-=アプライ[num][i];
            }
        }else{
            System.out.println("There is no enough Resource to allocate,プロセス:"+num+" 必要 to waiting.");
            T=false;
        }
    }else {
        System.out.println("プロセス:"+num+" has アプライ a exceed 量 of nedds");
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
            作業[i]=可用[i];
        }
        boolean flag=true;
        while (count<=3){
           if (flag){
               System.out.println("プロセス  "+"  作業  "+"  割り当て  "+"  必要  "+"  作業+割り当て ");
               flag=false;
           }
           for (int i=0;i<3;i++){
            if (Finish[i]==false&&必要[i][0]<=作業[0]&&必要[i][1]<=作業[1]&&必要[i][2]<=作業[2]){
                System.out.print("P"+i+"  ");
                for (int k=0;k<3;k++){
                    System.out.print(作業[k]+"  ");
                }
                System.out.print("|  ");
                for (int j=0;j<3;j++){
                    作業[j]+=割り当て[i][j];
                }
                Finish[i]=true;
                S[count]=i;
                count++;
                for (int j=0;j<3;j++){
                    System.out.print(割り当て[i][j]+"  ");
                }
                System.out.print("|  ");
                for (int j=0;j<3;j++){
                    System.out.print(必要[i][j]+"  ");
                }
                System.out.print("|  ");
                for (int j=0;j<3;j++){
                    System.out.print(作業[j]+"  ");
                }
                System.out.println();
            }
           }
           circle++;
           if (count==3){
               System.out.print("一ほあん存在する");
               for (int i=0;i<3;i++){
                   System.out.print("プロセス:"+" ");
               }
               System.out.println("現在のリソースが不足している");
               break;
           }
        }

    }
}
