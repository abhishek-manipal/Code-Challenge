// Author @Abhishek Mishra

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
    Integer octal = Integer.parseInt(str);
    System.out.println(octal);
    Integer rev = 0;
    Integer chk = 0;
    Integer rem = 0;
    String binary = "";
    //List<String> ArrayOfList = new List<String>();

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

  public List<String> ConvertToList(String binary) {
    Integer sum = 0;
    Integer ctr = 0;
    Integer i;
    Integer length = binary.length()-1;
    List<String> list = new ArrayList<String>();

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