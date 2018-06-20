package Module3;

import static java.lang.Integer.parseInt;

public class DeArch {
    public static void deArcheverStr(String archive) {
        String counterArch;
        System.out.println(archive);
        for (int i = 0; i < archive.length(); i = i + 2) {
            counterArch = archive.substring(i, i + 1);
            if (counterArch.matches("\\d")) {
                counterArch = archive.substring(i, i + 1);
                    for (int j = 0; j < parseInt(counterArch); j++) {
                        System.out.print(archive.substring(i + 1, i + 2));
                    }
            } else {
                System.out.println("String " + "'" + archive + "'" + " can't be unzipped");
                break;
            }
        }
    }
}




