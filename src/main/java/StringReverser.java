/**
 * Created by rmohamma on 6/16/2018.
 */
public class StringReverser {

  public static void main(String[] args){
    System.out.println("Hello");
    System.out.println(reverser("Hello"));


    System.out.println(rev("ABCD"));
    System.out.println(rev("ABCDE"));
    System.out.println(rev("ABCDEFGHIJ"));
  }


  public static String rev(String input){
    if (input.length()%2==0){
      return evenRev(input);
    }
    return oddRev(input);
  }
  public static String reverser(String input){
    String newStr="";
    for (int i = input.length()-1; i >= 0; i--) {
      newStr += input.charAt(i);
    }
    return newStr;
  }
  public static String evenReverse(String input) {
    String newStr = "";
    if (input.length() % 2 == 0) {
      int half = 0;
      for (int i = (input.length() - 1) / 2; i >= 0; i--) {
        newStr += input.charAt(i);
        half++;
      }
      for (int i = input.length() - 1; i >= half; i--) {
        newStr += input.charAt(i);
      }
    }
    return newStr;
  }
  public static String oddReverse(String input) {
    String newStr="";
    int half=0;
    for (int i = (input.length()-1)/2; i >= 0; i--) {
      if (i!=0) {
        newStr += input.charAt(i - 1);
      }
      half++;
    }
    if (input.length()%2!=0) {
      newStr += input.charAt(input.length()/2);
    }
    for (int i = input.length()-1; i >= half; i--) {
      newStr += input.charAt(i);
    }
    return newStr;
  }
  public static String evenRev(String input){
    int half = input.length()/2;
    String newStr="";
    for (int i=0; i<half; i++){
      newStr +=input.charAt(i);
    }
    String secStr="";
    for (int i=half; i<input.length(); i++){
      secStr +=input.charAt(i);
    }
    return reverser(newStr)+reverser(secStr);
  }
  public static String oddRev(String input){
    String newStr="";
    int half = input.length()/2;
    for (int i=0; i<half; i++){
      newStr +=input.charAt(i);
    }
    String secStr="";
    for (int i=half+1; i<input.length(); i++){
      secStr +=input.charAt(i);
    }
    return reverser(newStr)+input.charAt(input.length()/2)+reverser(secStr);
  }
}
