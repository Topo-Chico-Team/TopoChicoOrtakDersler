import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class J6_Looping
{
    public static void main(String[] args)
    {
        // LOOPS
        // while loop helps you out to repeat processes as many times as you want
        // each loop has initialization termination and increment/decrement method
        int a = 1;
        System.out.println("dongu 1 den 10 a kadar baslasin");
        while (a<=10)
        {
            System.out.println("tekrar number " + a);
            a++;
        }
        System.out.println("Dongu Tamamlandi");
        int b=0;
        System.out.println("dongu 1 den 10 a kadar cifter cifter");
        while (b<=10)
        {
            System.out.println("current value " + b);
            b+=2;                                                       // artis sayisi 2
        }
        System.out.println("cifter dongu tamamlandi");
        int c=0;
        System.out.println("dongu 1 den 10 a kadar ucer li");
        while (c<=10)
        {
            System.out.println("current value " + c);
            c+=3;                                                       // artis sayisi 3
        }
        System.out.println("ucerli dongu tamamlandi");

        // FAKTORIYEL HESABI

        System.out.println("Faktoriyel Hesaplamaya Hosgeldiniz \n lutfen faktoriyelini hesaplamak istediginiz sayiyi girin ");
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        int e=1;
        int result = 1;
        while (e<=d)
        {
            System.out.println(result=result*(e));
            e+=1;
        }
        // N E KADAR OLAN SAYILARIN TOPLAMININ HESABI
        System.out.println("Faktoriyel Hesaplamaya Hosgeldiniz \n lutfen faktoriyelini hesaplamak istediginiz sayiyi girin ");
        Scanner input2 = new Scanner(System.in);
        int d2 = input.nextInt();
        int e2=1;
        int result2 = 0;
        while (e2<=d2)
        {
            System.out.println(result2=result2+e2);
            e2+=1;
        }

        // DO WHILE LOOPLARI
        // bunun olayi run the command do it first then check the condition.
        int apples= 1;
        do
        {
            System.out.println("eat an apple "+apples);
            apples++;
        }
        while(apples<=10);                                  // bu zaten valid bir statement normal while gibi calisir

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int apples2= 1;
        do
        {
            System.out.println("eat an apple "+apples2);
            apples2++;                                      // simdi bu invalid oldugu icin sadece 1 kere do yapti bitti
        }
        while(apples2>=10);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //eger sayilari sirayla birerli artirmak istesek

        int BaslangicDegeri = 0;
        int BitisDegeri = 14;

        do {
            System.out.println("saymaya basla su anki sayi " + BaslangicDegeri);
            BaslangicDegeri+=1;
        }while(BaslangicDegeri<=BitisDegeri);

        //eger sayilari sirayla birerli azaltmak istesek

        int BaslangicDegeri2 = 8;
        int BitisDegeri2 = 0;

        do {
            System.out.println("saymaya basla su anki sayi " + BaslangicDegeri2);
            BaslangicDegeri2-=1;
        }while(BaslangicDegeri2>=BitisDegeri2);

        // belli bir kere bir string i yazdirmak istese
        int TekrarSayisi=5;
        String s12 = "Cevo";
        do {
            System.out.println(s12);
            TekrarSayisi-=1;
        } while (TekrarSayisi>0);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // FOR LOOPS

        // forun icine (initializatoin ; condition ; updates ) {...do this again and again}

        for(int ii = 0; ii<5 ; ii++) System.out.println("cevo");

        // alt alta degil de yan yana yazdirmak istesen

        for (int i3=0;i3<6;i3++) System.out.print(i3+ ", ");

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // FOR EACH LOOP
        // bunun olayi instead of putting it into a loop it is using straight forward solid certain data stored in
        // an array.

        int[] ints = {1,2,3,4,5,6,7};
        for(int item:ints)
        {
            System.out.println("items : "+ item);
        }

        int[] ints2 = {1,2,3,4,5,6,7};
        for(int item2:ints2)
        {
            System.out.print(", "+ item2);
        }
        System.out.println("bitti");

        int[] ints3 = {1,2,3,4,5,6,7};
        System.out.print("even numbers are in the array");

        for(int item3:ints3)
        {
            if(item3%2==0) System.out.print(item3 + " ");
        }

        // bu example da if any string given found in the array for is going to break the loop with an if statement
        String[] strs = {"aaa","bbb","ccc","ddd","asdf","qwer","skldfjskjdlf"};
        for (String letter: strs)
        {
            if(letter.contains("ddd"))
            {
                System.out.println("ddd found breaking the loop");
            }
            System.out.println(letter + " ");
        }

    }
}
