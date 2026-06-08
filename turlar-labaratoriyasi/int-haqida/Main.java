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
    
*/



public class Main{

    public static void main(String[] args){

        System.out.println(Integer.MIN_VALUE);// konstanta, eng kichik qiymatni qaytaradi
        System.out.println(Integer.MAX_VALUE);// konstanta, eng katta qiymatini qaytaradi
        System.out.println(Integer.TYPE); // konstanta, sinfning primitiv turini nomini qaytaradi: int
        System.out.println(Integer.BYTES); // konstanta, tipning bytelardagi xotira xajmini qaytaradi: 4


    }
}
