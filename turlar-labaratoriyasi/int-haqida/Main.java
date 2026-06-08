/*
    -int primitiv turi eng ko'p ishlatilinadigan tur xisoblanadi
    -butun sonlarni ifodalsh uchun qo'llaniladi
    -Integer wrappper sinfiga ega
    -int ning xotira xajmi 4 bayt
    -qiymatlar diapazoni -2147483648 dan 2147483647 gacha

    ENG ASOSIY METODLARI

    MIN_VALUE
    MAX_VALUE
    TYPE
    BYTES

    byteValue()
    shortValue()
    intValue()
    floatValue()
    doubleValue()
    longValue()
*/



public class Main{

    public static void main(String[] args){

        Integer int_son = Integer.valueOf("77"); // Integer wrapper sinfiga tegishli obekt yaratdik

        System.out.println(Integer.MIN_VALUE);// konstanta, eng kichik qiymatni qaytaradi
        System.out.println(Integer.MAX_VALUE);// konstanta, eng katta qiymatini qaytaradi
        System.out.println(Integer.TYPE); // konstanta, sinfning primitiv turini nomini qaytaradi: int
        System.out.println(Integer.BYTES); // konstanta, tipning bytelardagi xotira xajmini qaytaradi: 4

        System.out.println(int_son.byteValue() + "-byte tipida"); // Integer obektining qiymatini bytega toraytiradi va qiymatni byteda qaytaradi
        System.out.println(int_son.shortValue() + "-short tipida"); // Integer obektini qiymatini short tipiga toraytirb shortdagi qiymatni qaytaradi
        System.out.println(int_son.intValue() + "-int tipida"); // Integer obektini qiymatini int primitiv turga o'zgartirib int tipida qiymatini qaytaradi
        System.out.println(int_son.floatValue() + "-float tipida"); //Integer obektini qiymatini floatga kengayririb qiymatini float tipida qaytaradi
        System.out.println(int_son.doubleValue() + "-double tipida"); //Integer obektini qiymatini doublega kengaytirib qiymatini doubel tipida qaytaradi
        System.out.println(int_son.longValue() + "-long tipida"); //Integer obektini qiymatini long tipiga kengaytirib qiymatini long tipida qaytaradi

    }
}
