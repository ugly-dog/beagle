import java.util.Scanner;

public class バンク動作 {
    public static void main(String[] args){
        boolean Choose=true;
        String C;
        Scanner in =new Scanner(System.in);
         バンク T=new  バンク();
         System.out.println("3つのプロセス数,初期リソース:{9,7,8}");

         T.置くSystemVar();
         while (Choose==true){
             T.置くアプライ();
             System.out.println("あなたはまだリソースを申請していますか？");
             C=in.nextLine();
             if (C.endsWith("n")){
                 Choose=false;
             }
         }
    }
}
