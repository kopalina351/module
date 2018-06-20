package Module3;

public class ArchDemo {

    public static void main(String[] args) {
        Arch archiver = new Arch();
        DeArch deArch = new DeArch();
        archiver.archiverStr("aaac444abbbbbbbbbbccccc");
        System.out.println();
        deArch.deArcheverStr("1c4d9v");
        System.out.println();
        deArch.deArcheverStr("2cd9v");
    }
}
