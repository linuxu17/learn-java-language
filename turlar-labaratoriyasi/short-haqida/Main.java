/*
    -Short java tiling primitiv turlari sirasiga kiradigan tip
    -Short obektining qiymatini short tipida ifoda etadi
    -Short ning primitiv turining  xotira xajmi 2 bayt
    -primitiv turning qiymatlar diapazoni -32768 dan 32767 gacha

    STANDART METODLAR

    Short.BYTES - Wrapper sinfining necha bayt ekanligini qaytaradi // 2
    Short.MIN_VALUE short primitiv tipining eng minimal qiymatini qaytaradi -32768
    Short.MAX_VALUE short primitiv tipining maksimal qiymatini qaytaradi 32767
    Short.TYPE Short wrapper sinfining tipini qaytaradi // short

    byteValue() short primitiv turidagi o'zgaruvchi qiymatini bytega toraytiradi
    shortValue() short primiitv turidagi o'zgaruvchi qiymatini short tipiga o'giradi 
    intValue() short primitiv turidagi o'zgaruvchini qiymatini short tipiga o'zgartiradi
    floatValue() short primitiv turidagi o'zgaruvchi qiymatini float primitiv tipiga o'giradi 
    doubleValue() short primitiv turigagi o'zgaruvchini qiymatini doubel primitiv tipiga o'tkazadi
    longValue() short primitiv tipidagi o'zgaruvchini qiymatini long primitiv tipiga o'tkazad

    compare(short a, short b) - ikkita short tipidagi o'zgaruvchini qiymatlarini solishtiradi
    compareTo(Short object) ikki short tipidagi o'zgaruvchilarning qiymatlarini solishtiradi, oddiy comparedan farqi sintaksisda
    decode(String s) - "0x" formatidagi 16lik string matnni short qiymatiga o'giradi
    equals(Object o) metod ichidagi obektni avval turini keyin qiymatini short turi bilan solishtiradi agar bari teng bo'lsa true qaytaradi, aks xolda false
    parseShort(String s) faqat qiymatni qaytaradi wrappepr sinfga o'rmaaydi short qaytaradi
    parseShort(String s, int x) faqat qiymantni qaytaradi wrapper sinfga o'rmaaydi, x lik sanoq tizimidagi sonni qiymatini shprt da qaytaradi
    toString(short x); toString() ham qiymatni shortga o'zgartiradi va o'zgaruvchini Wrapper sinfga o'raydi, Short tipiga tegishli
    valueOf(short x); valueOf(String s); valueOf(String s, int r)

*/


public class Main{

    public static void main(String[] args){

    short son1 = 17, son2 = 20;
    byte byte_primitiv = 17;

    Short short_son = Short.valueOf(son1); //Short tipidagi short_son  obektini yaratib unga son1 o'zgaruvchisinig qiymatini beryapmiz

    String son = "255";
    String son_16 = "0xA0";
    String son_16_2 = "A9";

    System.out.println(Short.MIN_VALUE); // short tipining eng kichik qiymati -32768
    System.out.println(Short.MAX_VALUE); // short tipining eng katta qiymati 32767
    System.out.println(Short.TYPE); //short tipinig qaytaradi // short
    System.out.println(short_son);

    //System.out.println(son1.byteValue()); //xato, ...Value() metodlar wrapper sinfiga tegishli
    System.out.println(short_son.byteValue()); //to'g'ri wrapper sinf obektidagi standart metod
    System.out.println(Short.compare(son1, son2));// ikkita short primitiv turdahi qiymatlarni solishtiradi
    System.out.println(short_son.compareTo(son2)); // Short wrapper sinfiga tegishli obektni qiymatini boshqa short primitiv turiga tegishli qiymat bilan taqqoslaydi
    System.out.println(Short.decode(son_16)); //16 lin tizimni ifoda etuvchi va 0x formatida yozilhgan matnni Short tipiga o'tkazishga urinadi
    System.out.println(short_son.equals(byte_primitiv)); // avval tiplarni keyin qiymatlarni solishtitadi, agar barchasi bir xil bo'lsa true qaytaradi aks xolda false
    System.out.println(Short.parseShort(son)); // string matnda yozilgan sonni short primitiv turiga ogiradi
    System.out.println(Short.parseShort(son_16_2, 16)); // biror sanoiq tizimda ifodalangan string tipdagi matnni Short ga otkazishga urinadi
    System.out.println(short_son.toString()); // Short wrapper sinfiga tegishli obektning qiymatini strinnga o'girib qaytaradi
    System.out.println(Short.valueOf(son_16_2, 16)); // string tipida ifodalangan sonni biror snaqi tizimda ifodalangan bo'sa shuni Short wrapper sinfiga tegoshli obektga aylantiradi
    }
}
