package Module3;

public class Arch {

    public void archiverStr(String engString) {
        char[] arr = engString.toCharArray();
        System.out.println(arr);
        int count = 0;
        char current = arr[0];

        for(int i = 0; i < arr.length; ++i) {
            if (current == arr[i]) {
                ++count;
            } else {
                System.out.print(count);
                System.out.print(current);
                current = arr[i];
                count = 1;
            }

            if (count > 9) {
                System.out.print(count - 1);
                System.out.print(current);
                current = arr[i];
                count = 1;
            }
        }

        System.out.print(count);
        System.out.print(current);
    }
}