/*
    -byte oddiy primitiv tur xisoblanadi
    -butun sonlarni ifodalash uchun eng kichik tip
    -xotira xajmi 1bayt
    -qiymatlar oralig'i -128 dan 127 gacha
    -Byte nomli wrapper sinfi mavjud

    STANDART METODLARI
    byteValue()
    shortValue()
    intValue()
    floatValue()
    doubleValue()
    longValue()
    toString()
    pareByte(String s)
    valueOf()
    compare(byte a, byte b)
    decode(String s)


*/

public class Main{

public static void main(String[] args){

    byte son1 = 12;
    Byte son2 = 15;

    //System.out.printlon(son1.toString()); // xato, kompilatsiya bo'lmaydi
    System.out.println(son2.toString()); //to'g'ri, barcha metodlar wrapper sinfiga tegishli;

    System.out.println(son2.byteValue()); // Byte obyektining byte qiymatini qaytaradi
    System.out.println(son2.intValue()); // Byte obyektini int ga kengaytiradi int qaytaradi
    System.out.println(Byte.parseByte("77")); // String qiymatni Byte obektiga o'girishga urinadi
    System.out.println(Byte.parseByte("77", 8)); // String qiymatni berilgan son tiizmi bo'yicha Byte obektiga aylantirishga urinadi
    //Yani paresByte(String s, int x) biror x saniq tizimiga tegishli sonni ifoda etuvchi s matnni Byte.MAX_VALUE dan oshib ketmasa uni Byte obektiga aylantirib byte qiymatini qaytaradi
    System.out.println(Byte.parseByte("0A", 16)); // natija 10 chiqadi. 16 lik tizimdagi 0A soni 10lik tizimda 10ga teng

    System.out.println(Byte.decode("0x0B")); // 0x formatidagi string qiymatni Byte obektiga aylantirib byte qiymatini qaytaradi.
    System.out.println(Byte.valueOf(son1)); // byte qiymatini Byte obektiga aylantiradi

    byte qiymat1 = 7, qiymat2 = 10;

    System.out.println(Byte.compare(qiymat1, qiymat2)); // ikkita byte qiymat orasidagi farqni qaytaradi birinchi qiymatdan ikkinchi qiymatni ayiradi.
    System.out.println(Byte.MIN_VALUE); // Byte ning mumkin bo'lgan eng kichik qiymati constanta
    System.out.println(Byte.MAX_VALUE); // Bytening mumkin bo'lgan eng katta qiymati constanta
    }
}
