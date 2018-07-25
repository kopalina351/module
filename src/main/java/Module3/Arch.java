package Module3;
import org.apache.log4j.Logger;

/**
 *
 */
public class Arch {
    public String archiverStr(String engString) {
        String result = "";
        char[] arr = engString.toCharArray();
        System.out.println(arr);
        int count = 0;
        char current = arr[0];

        for(int i = 0; i < arr.length; ++i) {

            if (current == arr[i]) {
                ++count;
            }
            else {
                result+=""+count+current;
                System.out.print(count);
                System.out.print(current);
                current = arr[i];
                count = 1;
            }

            if (count > 9) {
                System.out.print(count -1);
                System.out.print(current);
                result+=""+(count-1)+current;
                current = arr[i];
                count = 1;
            }
        }result+=""+count+current;

        System.out.print(count);
        System.out.print(current);
     return result;
    }
}
