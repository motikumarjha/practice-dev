import java.util.HashMap;
import java.util.Map;

public class FIndDUplicateChars {
    public static void main(String args[]) {
        String str = "motikumarjha";

        char[] ch = str.toCharArray();
        int len = str.length();
        for(int i =0; i<len ; i++){
            for(int j =i+1; j<len ; j++ ){
                if(ch[i] == ch[j]){
                    System.out.println(ch[j]+ " ");
                    break;
                }
            }
        }


    }

}
