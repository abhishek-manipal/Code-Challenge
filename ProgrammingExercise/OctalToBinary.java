// Author @Abhishek Mishra

import java.util.*;
import java.lang.Math;

public class OctalToBinary {
  public static void main(String []args) {
    String str1 = "31646541";
    String str2 = "1163114742311135167021343424004141432061264036716605455350700" +
        "12425145143366515462107042710455720106717127670062717046577704333460730" +
        "170473602176263254671507630065771335415265546676604140271654231267013150" +
        "576147605265000452421616177052165224543311447543654741617367042213645643" +
        "631333465753306216356425416366443265355016660043333267564244700325222110" +
        "4064117622317044717471253";
    ConvertOctalToBinary(str1);
    //ConvertOctalToBinary(str2);
  }

  public static void ConvertOctalToBinary(String str) {
    System.out.println("Original string "+str);
    Integer octal = Integer.parseInt(str);
    System.out.println(octal);
    Integer rev = 0;
    Integer chk = 0;
    Integer rem = 0;
    String binary = "";
    ArrayList<String> ArrayOfList = new ArrayList<String>();

    while (octal!=0){
      rem = octal%10;
      if (rem>7) {
        chk = 1;
        break;
      }
      rev = rem + (rev*10);
      octal = octal/10;
    }
    if (chk == 0){
      octal = rev;
      while (octal!=0) {
        rem = octal%10;
        if (rem==0) {
          binary = binary + "000";
        } else if (rem==1) {
          binary = binary + "001";
        } else if (rem==2) {
          binary = binary + "010";
        } else if (rem==3) {
          binary = binary + "011";
        } else if (rem==4) {
          binary = binary + "100";
        } else if (rem==5) {
          binary = binary + "101";
        } else if (rem==6) {
          binary = binary + "110";
        } else if (rem==7) {
          binary = binary + "111";
        }
        octal = octal/10;
        //ArrayOfList = ConvertToList(binary);
        //ArrayOfList.reverse()
      }
    } else {
      System.out.println("Invalid value ");
    }
  }

  public ArrayList<String> ConvertToList(String binary) {
    Integer sum = 0;
    Integer ctr = 0;
    Integer i;
    Integer length = binary.length()-1;
    ArrayList<String> list = new ArrayList<String>();

    for (i=length; i>-i; i = i-1){
      char x = binary.charAt(i);
      System.out.print(x);
      //sum = sum + Math.pow(2, ctr)*Integer.parseInt(x);
    }
    ctr = ctr+1;
    if (ctr%8==0){
      sum = 0;
      ctr = ctr-8;
      list.add(sum.toString());
    } else if (i==0){
      list.add(sum.toString());
    }
    sum = 0;
    ctr = ctr-8;
    return list;

  }
}