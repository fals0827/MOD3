import java.util.Objects;
import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.next();
        String str2 = "";
        for (int i = str1.length()-1 ; i >= 0 ; i --){
            str2 = str2 + str1.charAt(i);
        }
        System.out.println(str2);
        if (Objects.equals(str1, str2)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
