package tests.day14_TestNgFramework;

import org.testng.annotations.Test;

public class C02_dependsOnMethods {


    //siralamaya karismaz ama
    @Test
    public void ilkTest(){
        System.out.println("Ilk test calisti");
    }

    @Test(dependsOnMethods = "ilkTest")
    public void ikinciTest(){
        System.out.println("2. test calisti");
    }

    @Test(dependsOnMethods ="ikinciTest" )
    public void ucuncuTest(){
        System.out.println("3. test calisti");
    }
}
