
public class J1_Variables_Primitives_Arithmetic_Operators
{
    public static void main(String[] args)
    {
        //  VARIALBES 
        // degiskenler javada her bir objenin bi class tan gelmesi lazim oda rakam sayi verya ondalikli felan olabilir
        
        // Declaration of Vaiable
        // data type name
        // int       n      ;
        // int n = value;
        // you can not give reserved names for a varialbe like class main etc...
        // it should not start from a number
        // start always with lower case // BUNUNLA ILGILI SUPHELERIM VAR
        // primitives are byte short long int float double char ...
        // float ends with f
        // float price = 47.34f
        // double ends with d
        // double metertomile = 2.345d
        // char has only one character within single quote
        // char firsletterofmyname = 'm';
        // boolean has true and false option
        // boolean lovejane = true;
        int n=10;
        n=100;
        System.out.println(n);
        String greeting;
        greeting = "Hello World";

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // CONCATENATION
        // birden fazla degiskenin sout la yazdirmaya deniyo
        System.out.println(n+greeting+" ne diyon lan sen denisik" + 3);
        System.out.println(3+4+6);
        System.out.println("3"+5); // if there is only numbers it considered as int
                                    // but if there is a string it all considered as String
                                    
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                    
        //ARITMETIC OPERATORS
        // ayni matematikteki gibi +-*/%
        double d = 345.5;
        float f = 23.4f;
        int age = 34;
        long size = 12345l;

        // Variable declaration
        int myage ;
        // Assignemnt
        myage = 23 ;
        double e = 23.34;
        System.out.println(myage+e);
        // char
        char g = 'A';
        // boolean has only two option true and false
        boolean doorisopen ;
        doorisopen = true ;
        System.out.println(doorisopen);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        
        // ++ -- += -= *=
        int apples;
        apples=0;
        System.out.println(apples++);
        System.out.println(++apples);
        System.out.println(apples++);
        System.out.println(apples++);
        System.out.println(++apples);
        System.out.println(apples);
        System.out.println(--apples);
        System.out.println(--apples);
        System.out.println(apples);
        System.out.println(apples--);
        System.out.println(apples--);
        System.out.println(apples);
        System.out.println(apples);
        System.out.println(--apples);

        // TYPE CASTING
        int i = (int)3.0;   // this pharanthesis converts the double value into intger 3
        int i3 = (int)3.6;   // int value is 3
        // IMPLICIT CASTING
        // byte>short>int>long>float>double
        double d1= 2000;
        long l = i;         // this is implicit capable degiskeni kendinden kucuge assign edebiliyon gibi bisey
        // EXPLICIT CASTING
        double price = 200.55;
        //int iprice = price;  bu hata verir cunku double a kusuratli yazaman onun icin explicit casting yapcan
        int iprice = (int)price;
        // for example int islem = 5/2.0; int degeri kusuratli olamayacagindan olmaz
        int islem = (int)(5/2.0);
        int islem2 = (5/2);
        System.out.println(islem);
        System.out.println(islem2);
        //SHORTHAND OPERATORS +=sth or -=sth or *=sth or /=sth
        int guest = 3;
        guest = 5;
        guest = guest + 2 ;             // guest +=; ayni sey demek
        System.out.println(guest);      // fekat =+ ayni sey degil
        guest+=5;                       // bu guest = guest + 5 demek
        System.out.println(guest);
        int minutes = 431;
        int ours = minutes / 60;
        System.out.println(ours);
        minutes = minutes%60; // bu su sekildede yazilabilir minutes %=60;
        minutes %=60;
        System.out.println("kalan sure " + ours + " saat " + minutes + " dakikadir");
        boolean sweet = false;
        boolean hot = (sweet = true);
        System.out.println(sweet);
        System.out.println(hot);
        //RELATIONAL/COMPARISON OPERATORS
        // > < >= <= == !=          these produce boolean value
        int n1 = 30;
        int n2 = 50;
        System.out.println(n1>n2);
        boolean test = n1>n2;
        System.out.println(test);
        boolean test2 = n1!=n2;
        System.out.println(test2);
        char letter1 = 'A';
        char letter2 = 'B';
        boolean b11 = letter1 == letter2;
        boolean b12 = letter1 != letter2;
        boolean b13 = letter1 > letter2;
        boolean b14 = letter1 < letter2;
        boolean b15 = letter1 >= letter2;
        boolean b16 = letter1 <= letter2;
        System.out.println(b11);
        System.out.println(b12);
        System.out.println(b13);
        System.out.println(b14);
        System.out.println(b15);
        System.out.println(b16);
        //LOGICAL OPERATORS
        // && || !
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        // OR
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(true && true && true);
        System.out.println(true && true && false);
        System.out.println(true && false && false);
        System.out.println(false && false && false);
        System.out.println(true && false && true);
        System.out.println(false && true && false);
        System.out.println(false && false && false);

        System.out.println(true || true || true);
        System.out.println(true || true || false);
        System.out.println(true || false || false);
        System.out.println(false || false || false);
        System.out.println(true || false || true);
        System.out.println(false || true || false);
        System.out.println(false || false || false);

        System.out.println(!true);
        System.out.println(!false);
        System.out.println(3!=5);

        // exclusive or
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        // precedence of logical operators
        // if ! && and || together at the same place

        // first ! then && then || considered
        System.out.println(!(true) && true  || false);
        System.out.println(!(true) || true  || false);
        System.out.println(!(true) && true  && false);
        System.out.println(!(true) && true  || false);

    }
}
