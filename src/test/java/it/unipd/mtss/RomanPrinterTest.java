////////////////////////////////////////////////////////////////////
// Matteo Stocco 2000552
// Alessandro Carraro 2000548
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;

public class RomanPrinterTest {
    private static String[] I = {
      "  _____ ",
      " |_   _|",
      "   | |  ",
      "   | |  ",
      "  _| |_ ",
      " |_____|"
    };
    private static String[] V = {
      " __      __",
      " \\ \\    / /",
      "  \\ \\  / / ",
      "   \\ \\/ /  ",
      "    \\  /   ",
      "     \\/    " 
    };
  
    private static String[] X = {
      " __   __",
      " \\ \\ / /",
      "  \\ V / ",
      "   > <  ",
      "  / . \\ ",
      " /_/ \\_\\" 
    };
    
    private static String[] L = {
      "  _      ",
      " | |     ",
      " | |     ",
      " | |     ",
      " | |____ ",
      " |______|" 
    };
  
    private static String[] C = {
      "   _____ ",
      "  / ____|",
      " | |     ",
      " | |     ",
      " | |____ ",
      "  \\_____|" 
    };
  
    private static String[] D = {
      "  _____  ",
      " |  __ \\ ",
      " | |  | |",
      " | |  | |",
      " | |__| |",
      " |_____/ " 
    };
  
    private static String[] M = {
      "  __  __ ",
      " |  \\/  |",
      " | \\  / |",
      " | |\\/| |",
      " | |  | |",
      " |_|  |_|" 
    };
    private static String pS(ArrayList<String[]> arrayList){
      String ret = "";
      for(int i=0; i<6; i++){
        for (String[] array : arrayList) {
          ret = ret + array[i];
        }
        ret = ret + "\n";
      }
      return ret;   
    }
    private ArrayList<String[]> aList = new ArrayList<>();
    @Test
      public void test_switch() {      
        aList.add(I);
        assertEquals(pS(aList), RomanPrinter.printAsciiArt("I"));
        aList.clear(); aList.add(V);
        assertEquals(pS(aList), RomanPrinter.printAsciiArt("V"));
        aList.clear(); aList.add(X);
        assertEquals(pS(aList), RomanPrinter.printAsciiArt("X"));
        aList.clear(); aList.add(L);
        assertEquals(pS(aList), RomanPrinter.printAsciiArt("L"));
        aList.clear(); aList.add(C);
        assertEquals(pS(aList), RomanPrinter.printAsciiArt("C"));
        aList.clear(); aList.add(D);
        assertEquals(pS(aList), RomanPrinter.printAsciiArt("D"));
        aList.clear(); aList.add(M);
        assertEquals(pS(aList), RomanPrinter.printAsciiArt("M"));
        aList.clear();
        assertEquals(pS(aList), RomanPrinter.printAsciiArt("A"));
      }
    
    @Test
      public void test_intero(){
        aList.clear();  aList.add(I);
        assertEquals(pS(aList), RomanPrinter.print(1));
      }
  }
