public class J4_Switch_Statement
{
    public static void main(String[] args)
    {
        // switch in paranthesis you write an expression then define the cases
        int restaurantrat = 5;
        switch(restaurantrat)
        {
            case 1:  System.out.println("This is my favorite"); break;
            case 2:  System.out.println("This is good");
            case 3:  System.out.println("it is okay");
            default: System.out.println("I never tried before");
        }

        int rate = 7;
        switch (rate)
        {
            case 1 :
                System.out.println("yek");                              //hangi case match lesirse ona gidiyo
                //break;
            case 2 :
                System.out.println("du");                               //break yazmazsan onu direk yazdiriyo
                //break;
            case 3:                                                     // you can have one default but many cases
                System.out.println("se");
                break;
            case 4:
                System.out.println("caar");
                break;
            case 5:
                System.out.println("penc");
                //break;
            case 6:
                System.out.println("ses");
                break;
            default:                                                    //default un yeri onemli degil
                System.out.println("oyle bi zar yok sayin agbiycim");
                break;
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int zar = 7;
        switch (zar)
        {
            default:    // defaultu basa alirsak bi sey farketmiyo amma breakle kirmazsak sikinti switch waterfall gibi calisiyo
                System.out.println("oyle bi zar yok sayin agbiycim");
             //   break;
            case 1 :
                System.out.println("yek");
                //break;
            case 2 : // break i gorene kadar yardirmaya devam
                System.out.println("du");
                break;
            case 3:
                System.out.println("se");
                break;
            case 4:
                System.out.println("caar");
                break;
            case 5:
                System.out.println("penc");
                break;
            case 6:
                System.out.println("ses");
                break;

        }
        // Switch statement larina her bok konulmuyo char byte short int String konulabilir
        // whatever the data type it should be the same with the case value
        // birden fazla case e tek bir output atanabilir
        // for example
        char grade = 'E';
                switch (grade)
        {
            case 'A':
                System.out.println("A ile gecti");
                break;
            case 'B':
                System.out.println("B ile gecti");
                break;
            case 'C':
                System.out.println("C ile gecti");
                break;
            case 'D':
            case 'E':
            case 'F':
                System.out.println("kaldiysan harfin ne onemi var");
                break;
            default:
                System.out.println("yoh amunga");
        }
    }
}
