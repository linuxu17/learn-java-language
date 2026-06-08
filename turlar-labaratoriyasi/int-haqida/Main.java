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

    parseInt(String s)
    parseInt(String s, int x)
    valueOf(String s)
    valueOf(String s, int x)
    compare(int a, int b)
    compareTo(int b)
    decode(String s)
    min(int a, int b)
    max(int a, int b)
    equals(Object obj)
    toString()
*/



public class Main{

    public static void main(String[] args){


        int son1 = 27, son2 = 37;
        Integer int_son = Integer.valueOf("77"); // Integer wrapper sinfiga tegishli obekt yaratdik
        Byte byte_son = Byte.valueOf("77");

        System.out.println(Integer.MIN_VALUE + "-int ning eng kichik qiymati");// konstanta, eng kichik qiymatni qaytaradi
        System.out.println(Integer.MAX_VALUE + "-int ning eng katta qiymati");// konstanta, eng katta qiymatini qaytaradi
        System.out.println(Integer.TYPE + ": sinf nomi"); // konstanta, sinfning primitiv turini nomini qaytaradi: int
        System.out.println(Integer.BYTES + " int sinfining bytelardagi xajmi"); // konstanta, tipning bytelardagi xotira xajmini qaytaradi: 4

        System.out.println(int_son.byteValue() + "-byte tipida"); // Integer obektining qiymatini bytega toraytiradi va qiymatni byteda qaytaradi
        System.out.println(int_son.shortValue() + "-short tipida"); // Integer obektini qiymatini short tipiga toraytirb shortdagi qiymatni qaytaradi
        System.out.println(int_son.intValue() + "-int tipida"); // Integer obektini qiymatini int primitiv turga o'zgartirib int tipida qiymatini qaytaradi
        System.out.println(int_son.floatValue() + "-float tipida"); //Integer obektini qiymatini floatga kengayririb qiymatini float tipida qaytaradi
        System.out.println(int_son.doubleValue() + "-double tipida"); //Integer obektini qiymatini doublega kengaytirib qiymatini doubel tipida qaytaradi
        System.out.println(int_son.longValue() + "-long tipida"); //Integer obektini qiymatini long tipiga kengaytirib qiymatini long tipida qaytaradi

        System.out.println(Integer.parseInt("123") + " `123` satrni int da qiymatini qaytaradi"); // statik metod, Matn asosida yozilgan sonni int primitiv tip asosida qiymatini qaytaradi
        System.out.println(Integer.parseInt("FF", 16) + "`FF` ni int ga o'girib qaytaradi "); // statik metod, string asosida berilgan sonni va u son qaysi sanoq tizimida ekanligini kiritish asosida qiymatni int primiitv tipda qaytaradi
        System.out.println(Integer.valueOf("273") + " `273` satrni int tipida qaytaradi"); // statik metod, parseIntdan farqli ravishda bu metod obekt , yani Integer obektini
        System.out.println(Integer.valueOf("AB", 16) + " `AB` 16 lik tizimdagi sonni satr sifatida o'qib qiymatini int tipida qaytaradi"); // statik metod, xuddi parseInt dagi kabi string asosidagi sonni kiritlgan sanoq sistemasi asosida Integer obektini yaratib qiymatini qaytaradi
        System.out.println(Integer.compare(son1, son2) + " son1 va son2 farqini qaytaradi"); // statik metod, int primitiv tipidagi ikki sonni solishtirb farqini ishorasi bilan qaytaradi
        System.out.println(int_son.compareTo(son2) + " obekt qiymati bilan sonning farqini qaytaradi"); //instance metod, obektning qiymatini biror int primiitv tipdagi son qiymati bilan solishtirib farqini ishorasi bilan qaytaradi
        System.out.println(Integer.decode("0xBB") + " `0xBB` ni dekodlangan qiymati"); // statik metod, 0x formatidagi satrni decodlab qiymatini int tipida qaytaradi
        System.out.println(Integer.min(son1, son2) + " eng kichigi"); // statik metod, ikkita int primiitv qiymatlar ichidan eng kichigini qaytaradi
        System.out.println(Integer.max(son1, son2) + " eng kattasi"); // statik metod, ikkita int primitiv tipdagi qiymatlar orasidan eng kattasini qaytaradi
        System.out.println(int_son.equals(byte_son)); // instanse metod, Intejer obektni boshqa bir obekt bilan avval tiplarbo'yicha keyin qiymatlar bo'yicha solishtiradi, agar hammasi teng bo'lsa true qaytaradi aks xolda false qaytaradi
        System.out.println(int_son.toString() + " String matn ko'rinishida"); 

    }
}
