package ua.fundamentals;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertFalse;

/**
 * Created by Ksu on 17.11.2016.
 */
public class FundamentalsTest {
    Fundamentals fund;
@Before
        public void before() {
     fund = new Fundamentals();
    //first option
            /*char[] massiv=new char[3];
            for (int i = 0; i < massiv.length; i++) {
                massiv[i]='A';
            }
            fund.printMassiv(massiv);*/
}
            //second option

            


@Test
    public void testPrintMassiv(){
        String str = " Print test 1";
        char[] ch  = new char[100];
        str.getChars(0,str.length(),ch,0);
        fund.printMassiv(ch);
       // TestCase.assertEquals(1,1);

    }

        }



