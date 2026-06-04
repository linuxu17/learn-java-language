/*
    -byte oddiy primitiv tur xisoblanadi
    -butun sonlarni ifodalash uchun eng kichik tip
    -xotira xajmi 1bayt
    -qiymatlar oralig'i -128 dan 127 gacha
    -Byte nomli wrapper sinfi mavjud
    -Byte sinfinig standart metodlari 21ta

    KONVERTATSIYA METODLARI

    1)byteValue() - obekting 10lik tizimdagi byte qiymatini ajratib oladi
    2)shortValue() - obyetni shot tipiga kengaytiradi
    3)intValue() - obektni int tipiga kengaytiradi
    4)longvalue() - obektni long tipiga kengaytiradi
    5)floatValue() - obektni float tipiga kengaytiradi
    6)doubleValue() - obektni double tipiga kengaytiradi

    PARSING METODLARI

    7)parseByte(String s) - satrni 10lik tizim asosida bytega o'giradi
    8)parseByte(String s, int x) - s satrni x sanoq tizimi asosida bytega  o'giradi
    9)decode(String s) - 16lik (0x) yoki 8lik(0) formatidagi satrlarni Byte wrapper obektiga aylantiradi

    OBEKTGA O'RASH WRAPPER OBEKTGA AYLANTIRISH

    10)valueOf(byte a) - a ni Byte obektiga o'giradi
    11)valueOf(String s) - s satrni Byte obektiga o'giradi
    12)valueOf(String s, int x) s satrni x saniq tizimi asodisa Byte obektiga aylantiradi


*/

public class Main{

public static void main(String[] args){

    Byte byte_ = 77;

    // Konvertatsiya
    byte byte_qiymat = byte_.byteValue();
    short short_qiymat = byte_.shortValue();
    int int_qiymat = byte_.intValue();
    long long_qiymat = byte_.longValue();
    float float_qiymat = byte_.floatValue();
    double double_qiymat = byte_.doubleValue();

    System.out.println("byte qiymat: " + byte_qiymat);
    System.out.println("short qiymat: " + short_qiymat);
    System.out.println("int qiymat: " + int_qiymat);
    System.out.println("long qiymat: " + long_qiymat);
    System.out.println("float qiymat: " + float_qiymat);
    System.out.println("double qiymat: " + double_qiymat);

    // Parsing
    String byte_satr = "55";

    byte str_dan_bytega = Byte.parseByte(byte_satr);
    byte str_dan_bytega_2 = Byte.parseByte(byte_satr, 16);
    byte str_dan_bytega_3 = Byte.decode("0x0F");
    byte str_dan_bytega_4 = Byte.decode("013");

    System.out.println("Strdan bytega 1: " + str_dan_bytega);
    System.out.println("Strdan bytega 2: " + str_dan_bytega_2);
    System.out.println("Strdan bytega 3: " + str_dan_bytega_3);
    System.out.println("Strdan bytega 4: " + str_dan_bytega_4);

    //WRAPPER OBEKTGA AYLANTIRISH
    String byte_satr_2 = "0F";
    byte wrapper_obyekt = Byte.valueOf((byte)byte_qiymat);
    byte wrapper_obyekt_2 = Byte.valueOf(byte_satr);
    byte wrapper_obyekt_3 = Byte.valueOf(byte_satr_2, 16);

    System.out.println("bytedan bytega 1: " + wrapper_obyekt);
    System.out.println("bytedan bytega 2: " + wrapper_obyekt_2);
    System.out.println("bytedan bytega 3: " + wrapper_obyekt_3);
    }
}
