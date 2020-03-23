public class J5_String_Methods
{
    public static void main(String[] args)
    {
        //STRING METHODS

        String a = "CevdetAbbas";       //String hangi class tan oldugunu belirtiyo yani harflerden olusan bisey olacak
        int b = 12345;                  // a bir object yada variable // Cevdetabbas ise bir value
        // yazarken stringObject.MethodName() seklinde yaziliyo

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(a.length()); // bu bir integer degeri verecek bize stringde kac harf var onu veren method
        // yani bu durumda 11 olmasi lazim
        System.out.println("ridvanbaba".length());   // bu sekildede objesiz variablesiz yazilabilir.

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(a.toUpperCase()); // buda hepsini buyuk harf yapiyo yani result CEVDETABBAS olmasi lazim
        System.out.println("ZalimDunya".toUpperCase());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(a.toLowerCase()); // buda hepsini kucuk harf yapiyo yani result cevdetabbas olmasi lazim
        System.out.println("ZalimDunya".toLowerCase());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(a.startsWith("C")); // bunun icindeki boolean eger dogruysa true yanlissa false veriyo
        System.out.println(a.startsWith("e")); // bunun icindeki boolean eger dogruysa true yanlissa false veriyo
        System.out.println(a.startsWith("Ce"));// ilk iki harfi veya fazlasini da deneyebiliniyor

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(a.endsWith("s")); // bunun icindeki boolean eger dogruysa true yanlissa false veriyo
        System.out.println(a.endsWith("b")); // bunun icindeki boolean eger dogruysa true yanlissa false veriyo
        System.out.println(a.endsWith("bas"));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(a.contains("evd")); // buda boolean eger string bu stringi iceriyosa true veriyo

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(a.length()); // buda kac tane harf oldugunu veriyo
        System.out.println("zalimdunya".length());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(a.indexOf("v")); // particular character within a given string but 0,1,2,3,4 diye gidiyo
        System.out.println(a.indexOf("e")); // yani ilk harfi koyarsan 0. indexe denk geliyo ciktisi
        // ayni harften iki tane varsa napiyo he bilmiyom

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(a.charAt(0)); // bu ilk harfi veriyo yani C
        System.out.println("saatkac".charAt(0)); // buda s olmasi lazim geliyo

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(a.substring(2)); // writes a substring beggining from given value yani detAbbas olacak
        System.out.println(a.substring(2,5)); // buda ikiden 5 e kadar(5dahil degil) harfleri yazdiriyo

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(a.trim());   // eger bosluk varsa ki yok a stringinde onlari trim liyo buduyor.
        System.out.println(" asdf;lkj as;df   asdkj;f ".trim());   // sadece basindaki ve sonundaki bosluklari siliyo

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");





    }
}
