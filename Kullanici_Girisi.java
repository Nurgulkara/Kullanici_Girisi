import java.util.Scanner;
public class Kullanici_Girisi {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        String username, password, npassword;

        System.out.print("Kullanici Adiniz: ");
        username= inp.nextLine();
        System.out.print("Sifreniz: ");
        password=inp.nextLine();

        if (username.equals("patika") && password.equals("java123")){
            System.out.println("Giris Yaptiniz!");
        }

        else {
            System.out.println("Bilgileriniz yanlis. Lutfen kontrol ediniz!");
        }

        if (password != "java123"){
            System.out.print("Sifreniz yanlis. Sifrenizi yenilemek icin 1'e basin!");


       Scanner input = new Scanner(System.in);
            int sifirla;
        sifirla=input.nextInt();


            if (sifirla == 1){
                System.out.print("Yeni sifre yaziniz: ");
                npassword= inp.nextLine();

                if (npassword.equals("java123")){
                    System.out.println("Sifre oluşturulamadi, lutfen baska sifre giriniz.");
                }
                else {
                    System.out.println("Sifre olusturuldu!");
                }

            }

        }

    }
}
