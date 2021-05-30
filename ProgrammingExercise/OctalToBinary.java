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
    Integer octal = Integer.parseInt(str);
    System.out.println(octal);
    Integer rev = 0;
    Integer chk = 0;
    Integer rem = 0;
    String binary = "";
    ArrayList<String> ArrayOfList = new ArrayList<String>();

    while (octal!=0) {
      rem = octal%10;
      if (rem>7) {
        chk = 1;
        break;
      }
      rev = rem + (rev*10);
      octal = octal/10;
    }
    if (chk == 0) {
      octal = rev;
      while (octal!=0) {
        rem = octal % 10;
        if (rem == 0) {
          binary = binary + "000";
        } else if (rem == 1) {
          binary = binary + "001";
        } else if (rem == 2) {
          binary = binary + "010";
        } else if (rem == 3) {
          binary = binary + "011";
        } else if (rem == 4) {
          binary = binary + "100";
        } else if (rem == 5) {
          binary = binary + "101";
        } else if (rem == 6) {
          binary = binary + "110";
        } else if (rem == 7) {
          binary = binary + "111";
        }
        octal = octal/10;
      }
      System.out.println ("Binary is "+binary);
      ArrayOfList = ConvertToList(binary);
      Collections.reverse(ArrayOfList);
      System.out.println ("List is "+ArrayOfList);
    } else {
      System.out.println("Invalid value");
    }
  }

  public static ArrayList<String> ConvertToList(String binary) {
    Integer sum = 0;
    Integer ctr = 0;
    Integer i;
    Integer length = binary.length()-1;
    ArrayList<String> list = new ArrayList<String>();

    for (i=length; i>-1; i = i-1) {
      sum = sum + (int) Math.pow(2, ctr) * Character.getNumericValue(binary.charAt(i));
      ctr = ctr + 1;
      if (ctr % 8 == 0) {
        list.add(sum.toString());
        sum = 0;
        ctr = ctr - 8;
      } else if (i == 0) {
        list.add(sum.toString());
      }
    }
    return list;
  }
}