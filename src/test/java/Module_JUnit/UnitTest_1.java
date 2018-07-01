package Module_JUnit;

import Module3.Arch;
import Module3.DeArch;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class UnitTest_1 {
    private Arch arch = new Arch();
    private DeArch deArch = new DeArch();

    @Test
    public void archiverStr1(){
        assertEquals("3a1c341a9b1b5c", arch.archiverStr("aaac444abbbbbbbbbbccccc"));
        System.out.println();
    }
    @Test
    public void archiverStr2(){
        assertEquals("343c3567", arch.archiverStr("444ccc555777777"));
        System.out.println();
    }


    @Test
    public void deArcheverStr1(){
        assertEquals("cddddvvvvvvvvv", deArch.deArcheverStr("1c4d9v"));
        System.out.println();
    }

    @Test
    public void deArcheverStr2(){
        assertEquals("String 'cd9v95' can't be unzipped","", deArch.deArcheverStr("cd9v95"));
        System.out.println();
    }

}
