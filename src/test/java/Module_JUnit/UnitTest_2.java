package Module_JUnit;

import Module3.Arch;
import Module3.DeArch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTest_2 {
    private Arch arch = new Arch();
    private DeArch deArch = new DeArch();



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

    @Test
    public void deArcheverStr3(){
        assertEquals("5577777777333333333", deArch.deArcheverStr("258793"));
        System.out.println();
    }

}
