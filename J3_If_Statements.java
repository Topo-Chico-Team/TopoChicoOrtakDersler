import java.util.Scanner;

public class J3_If_Statements {
    public static void main(String[] args) {
        // if is structure i eger if then sonra parantez icine bir matiksal sinama gelmesi lazim
        // sonra o case te bir sonuc if else case inde antother bir sonuc else case indeki sonuc
        int apples = 10, organges = 20;
        if (apples > organges)                // yalnizca tek bir outputlu if statement yazilabilur.
        {
            System.out.println("elmalar fazla");
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        // kisaca soyle de yazilabilir
        if (apples > organges) System.out.println("elmalar fazla");
        else if (apples == organges) System.out.println("esit");
        else System.out.println("oranges fazla");

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        // boolean a true yada false assign edilip ona gore if yazilabilir
        boolean hot = true;
        if (hot == true) System.out.println("sicak");
        else System.out.println("soguk");

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        // boolean i atadiktan sonra if deki paranteze sadece degisken ismi yazilabilir
        boolean at = true;
        if (at) System.out.println("sicak");
        else System.out.println("soguk");
        if (!hot) System.out.println("sicak");
        else System.out.println("soguk");

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        //String i esitlemek icin == degil .equals("esitlenilecek string") yazilir
        String elmalar = "elma", portakallar = "portalkal";
        if (elmalar.equals("elma")) System.out.println("both of the things are");

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        // if else ile tamamlanmak zorunda degildir.
        int grade = 70;
        if (grade == 50) System.out.println("you got 50");

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        // switch case e benzer sekilde if (kosul) sonuc; else if (kosul) sonuc; yazilabilir else le bitirmeye gerenk yok
        if (grade == 50) System.out.println("you got 50");
        else if (grade > 50) System.out.println("you got more than 50");

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        // bu sekilde butun possibility ler cover edilmis oluyo.
        if (grade == 50) System.out.println("you got 50");
        else if (grade > 50) System.out.println("you got more than 50");
        else System.out.println("you got less than 50");

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        // if statement icindeki if statements
        boolean havasicak = true;
        boolean ruzgarli = true;

        if (havasicak) if (!ruzgarli) System.out.println("hadi denize");
        else System.out.println("cok ruzgarli denize gidilmez");
        else
            System.out.println("hava soguk haci");

        if (havasicak)
            if (!ruzgarli) System.out.println("hadi denize");
            else System.out.println("cok ruzgarli denize gidilmez");
        else System.out.println("hava soguk haci");

        // if kullanarak bir icecek makinasi programi yazalim
        // ilk secim icin soru yazip sonra scanner objesi olusturup sonra onu bir degiskene assign ediyoruz.
        System.out.println("lutfen sicak ve soguk arasi bir secenekte bulunun sicak icun 1 soguk icun 2 yes bas");
        Scanner hotorcold = new Scanner(System.in);         //burada scanner classindan bir obje olusturuyoz
        int sicakyadasoguk = hotorcold.nextInt();               // buradada o objecnin int oldugunu ve degiskenini atiyoz





       /* if (sicakyadasoguk==1)
            System.out.println("cay icin 1 kahve icin 2 ye bas");
            Scanner coffeeortea = new Scanner(System.in);
            int cayyadakahve = coffeeortea.nextInt();
                if (cayyadakahve==1)                     System.out.println("cay iyi secim $7 reja edeyin");
                else (cayyadakahve==2)               System.out.println("kahve muthis secim $2 reja ederin");
        else (sicakyadasoguk==2)
                System.out.println("cola 1 ayran 2");
        Scanner cokeorairan = new Scanner(System.in);
        int colayadaayran = coffeeortea.nextInt();
            if (colayadaayran==1)                    System.out.println("cola candir patlicandir");
            else if (colayadaayran==2)               System.out.println("ayranda candir paatlicandir");
        else System.out.println("vay amk mali bi rakam giremedin");

        if (sicakyadasoguk==1) System.out.println("cay icin 1 kahve icin 2 ye bas"); Scanner coffeeortea = new Scanner(System.in); int cayyadakahve = coffeeortea.nextInt();      if (cayyadakahve==1) System.out.println("cay"); else System.out.println("kahve");
        if (sicakyadasoguk==2) if (cayyadakahve==1) System.out.println("cola"); else System.out.println("ayran");
        else if (sicakyadasoguk==2) System.out.println("cola 1 ayran 2"); Scanner cokeorairan = new Scanner(System.in); int colayadaayran = coffeeortea.nextInt(); if (colayadaayran==1) System.out.println("cola"); else
        System.out.println("ayran");
        //System.out.println("ayran");
         */

        //basardim boylece ama dur bakalim
        /*
       if ( sicakyadasoguk==1)
       {
           System.out.println("cay icin 1 kahve icin 2 ye bas");
           Scanner coffeeortea = new Scanner(System.in);
           int cayyadakahve = coffeeortea.nextInt();
           if (cayyadakahve==1)
           {
               System.out.println("cay geliyo");
           }
           else if (cayyadakahve==2)
           {
               System.out.println("kahve geliyo");
           }
       }
       else if (sicakyadasoguk==2)
       {
           System.out.println("cola 1 ayran 2");
           Scanner colaayran = new Scanner(System.in);
           int colayadaayran = colaayran.nextInt();
           if (colayadaayran==1)
           {
               System.out.println("cola");
           }
           else if (colayadaayran==2)
           {
               System.out.println("ayran geliyor");
           }
       }

         */
        if (sicakyadasoguk == 1)
        {
            System.out.println("cay icin 1 kahve icin 2 ye bas");
            Scanner coffeeortea = new Scanner(System.in);
            int cayyadakahve = coffeeortea.nextInt();
            if (cayyadakahve == 1) System.out.println("cay geliyo");
            else if (cayyadakahve == 2) System.out.println("kahve geliyo");
        }
        else if (sicakyadasoguk == 2) {
            System.out.println("cola 1 ayran 2");
            Scanner colaayran = new Scanner(System.in);
            int colayadaayran = colaayran.nextInt();
            if (colayadaayran == 1) System.out.println("cola");
            else if (colayadaayran == 2) System.out.println("ayran geliyor");
        }
        //TERNARY CONDITIONAL STATEMENT ?

        // condition ? expression if it is true : expression if it is false;
        boolean greenlight = true ;
        if(greenlight) System.out.println("go ahead"); else System.out.println("stop");
        // fekat yukaridaki ornek su sekilde yazillabilir
        String action ;
        action = "" ; // bu optional ust satirdada yazilabilir hic te yazilmayabilir
        action = (greenlight) ? "go ahead" : "stop" ;
        System.out.println(action);
        //yada soyle yazilabilir
        String action2 = (greenlight) ? "go away" : "stop" ;
        System.out.println(action2);

        // baska bir ornek bu sefer integerli olsun bill 200 den fazlaysa quilified to discount
        int bill = 340 ;
        String disc;
        disc = (bill>200) ? "disconut" : "on disc";
        System.out.println(disc);

        // cay kahve makinasini bu sekilde yazmaya calisalim
        int quantitiy = 9;

        if(bill>300) if (quantitiy>10) System.out.println("discount may applicable"); else System.out.println("not qualified"); else
            System.out.println("not quilified either");

        Scanner input = new Scanner(System.in);
        double version = input.nextDouble();
        if (version==1.5) System.out.println("Cupcake");





    }
}
