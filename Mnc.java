import java.util.*;
 
public class Mnc{

       public static void upper(String str){
          StringBuilder sb = new StringBuilder("");
            char ch = Character.toUpperCase(str.charAt(0));
            sb.append(ch);
            for(int i=1; i<str.length(); i++){
              if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
              }
              else{
                sb.append(str.charAt(i));
              }
            }
          System.out.println(sb.toString());
          StringBuilder sb1 = new StringBuilder("");
          char chh = Character.toLowerCase(sb.toString().charAt(0));
          sb1.append(chh);
          for(int i=1; i<sb.toString().length(); i++){
            if(sb.toString().charAt(i)==' ' && i<sb.toString().length()-1){
              sb1.append(sb.toString().charAt(i));
              i++;
              sb1.append(Character.toLowerCase(sb.toString().charAt(i)));
            }
            else{
              sb1.append(Character.toUpperCase(sb.toString().charAt(i)));
            }
          }
          System.out.println(sb1.toString());
        }
  public static void main(String[] args) {
    String str = "hello, ankit this side";
    upper(str);
  }
}
