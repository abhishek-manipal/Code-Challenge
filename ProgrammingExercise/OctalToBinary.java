//Problem:
// Write a function to decode an octal string to a number in an array of
// bytes. For example, "31646541" should produce [103, 77, 97].
// The solution should work for long input. Try:
// "1163114742311135167021343424004141432061264036716605455
// 35070012425145143366515462107042710455720106717127670062
// 71704657770433346073017047360217626325467150763006577133
// 54152655466766041402716542312670131505761476052650004524
// 21616177052165224543311447543654741617367042213645643631
// 33346575330621635642541636644326535501666004333326756424
// 47003252221104064117622317044717471253"

import java.util.*;
import java.lang.Math;

public class OctalToBinary {
  public static void main(String []args) {
    // Declare Test one string
    String str1 = "31646541";
    // Declare Test two string
    String str2 = "1163114742311135167021343424004141432061264036716605455350700124251451433665154621070427104557201067171276700627170465777043334607301704736021762632546715076300657713354152655466766041402716542312670131505761476052650004524216161770521652245433114475436547416173670422136456436313334657533062163564254163664432653550166600433332675642447003252221104064117622317044717471253";
    ConvertOctalToBinary(str1);
    ConvertOctalToBinary(str1);
  }

  public static void ConvertOctalToBinary(String str) {
    System.out.println("Original string "+str);
    int octal = Integer.parseInt(str);
    System.out.println(octal);
    int rev = 0;
    int chk = 0;
    int rem = 0;
    String binary = "";
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
      }
    } else {
      System.out.println("Invalid value ");
    }
  }

  public List<String> ConvertToList(String binary) {
    int sum = 0;
    int ctr = 0;
    int length = binary.length()-1;
    List<String> list = new ArrayList<String>();

    for (int i=length; i>-i; i = i-1){
      //sum = sum + Math.pow(2, ctr)*Integer.parseInt(binary[i]);
    }

    return list;

  }

}