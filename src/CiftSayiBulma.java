import java.util.Scanner;
public class CiftSayiBulma {
    public static void main(String[] args) {

        int sayi;
//        int run=1;

        Scanner input= new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        sayi= input.nextInt();

/*        for (int run=1 ; run<=sayi; run++ ){
            if (run% 2==0){
                System.out.println(run);
      }


        }

 */

  /*      while (run<=sayi){
            run+=1;
            if (run%2!=0){
                continue;
            }
            System.out.println(run);

        }

      */
        int n=0, toplam=0;
        for (int run=1 ; run<=sayi; run++ ){
            if ((run%3==0)&&(run%4==0)){
                n++;

                toplam+=run;

            }




        }
        System.out.println(toplam/n);




    }
}
