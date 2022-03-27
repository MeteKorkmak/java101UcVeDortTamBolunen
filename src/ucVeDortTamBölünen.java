import java.util.Scanner;
public class ucVeDortTamBölünen {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a, toplam=0, sayac=0;
        double ort = 0;
        System.out.print("Bir Sayı Giriniz:");
        a=input.nextInt();
        for (int i=1; i<=a; i++){
            if (i % 3==0 ){
                toplam = i + toplam;
                sayac++;
            }else if (i % 4==0){
                toplam = i + toplam;
                sayac++;
            }

        }
        ort=(toplam/sayac);
        System.out.println("Toplam:" + toplam +  "\n"+ "Adet:" + sayac + "\n" + "Ortalama:" + ort);





    }
}

