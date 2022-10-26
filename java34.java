package Java34;

import java.util.Scanner;
public class java34 {
    public static void main(String[] args) {

        int secim;
        Scanner input = new Scanner(System.in);
        Scanner inp = new Scanner(System.in);

        int control = 1; 
        do{
            secim=0;
            System.out.println("Seçim Yapınız:\n 1-Toplama\n 2-Çıkarma\n 3-Bölme\n 4-Çarpma\n 5-Üs Alma\n 6-Faktöriyel\n 7-Mod Alma\n 8-Dikdörtgen Alan ve Çevre Hesabı\n 0-Çıkış Yap ");
            secim = input.nextInt();

            switch(secim){
                case 1: toplama(); break;
                case 2: cikarma(); break;
                case 3: bolme(); break;
                case 4: carpma(); break;
                case 5: usAlma(); break;
                case 6: faktoriyel(); break;
                case 7: modAlma(); break;
                case 8: alanCevre(); break;
                case 0: control = 0; inp.close(); input.close(); break;

            }
        }
        while(control!= 0);

    }
    static void toplama(){
        Scanner inp = new Scanner(System.in);
        int a, b;
        System.out.print("iki sayı giriniz: ");
        a = inp.nextInt();
        b = inp.nextInt();
        System.out.println(a+b);
    }
    static void cikarma(){
        Scanner inp = new Scanner(System.in);
        int a, b;
        System.out.print("iki sayı giriniz: ");
        a = inp.nextInt();
        b = inp.nextInt();
        System.out.println(a-b);
    }
    static void bolme(){
        Scanner inp = new Scanner(System.in);
        int a, b, control;
        System.out.print("iki sayı giriniz: ");
        a = inp.nextInt();
        b = inp.nextInt();
        control = a>b ? a/b : b/a;
        System.out.println(control);
    }
    static void carpma(){
        Scanner inp = new Scanner(System.in);
        int a, b;
        System.out.print("iki sayı giriniz: ");
        a = inp.nextInt();
        b = inp.nextInt();
        System.out.println(a*b);
    }
    static void usAlma(){
        Scanner inp = new Scanner(System.in);
        int a, b, top=1;
        System.out.print("Sayıyı ve üssü giriniz: ");
        a = inp.nextInt();
        b = inp.nextInt();
        for(int i=1; i<=b; i++) {
            top *=a;
        }System.out.println(top);
    }
    static void faktoriyel(){
        Scanner inp = new Scanner(System.in);
        int a;
        System.out.print("Sayıyı giriniz: ");
        a = inp.nextInt();
        for(int i=a-1; i>0; i--) {
            a *=i;
        }System.out.println(a);
    }
    static void modAlma(){
        Scanner inp = new Scanner(System.in);
        int a, b;
        System.out.print("iki sayı giriniz: ");
        a = inp.nextInt();
        b = inp.nextInt();
        System.out.println(a%b);
    }
    static void alanCevre(){
        Scanner inp = new Scanner(System.in);
        int a, b;
        System.out.print("iki sayı giriniz: ");
        a = inp.nextInt();
        b = inp.nextInt();
        System.out.println("Alan: " +  a*b + "\nCevre: " + (2*a + 2*b));
    }
}
