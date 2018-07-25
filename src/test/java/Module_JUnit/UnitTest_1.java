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
        assertEquals("3d1g2j7t", arch.archiverStr("dddgjjttttttt"));
        System.out.println();
    }

    @Test
    public void archiverStr3(){
        assertEquals("34356718", arch.archiverStr("4445557777778"));
        System.out.println();
    }

}
