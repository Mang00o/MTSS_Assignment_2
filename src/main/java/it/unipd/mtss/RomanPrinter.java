////////////////////////////////////////////////////////////////////
// Matteo Stocco 2000552
// Alessandro Carraro 2000548
////////////////////////////////////////////////////////////////////
package main.java.it.unipd.mtss;

public class RomanPrinter {
  private static String[] ascii_art_I = {
    "  _____ ",
    " |_   _|",
    "   | |  ",
    "   | |  ",
    "  _| |_ ",
    " |_____|"
  };
  private static String[] ascii_art_V = {
    " __      __",
    " \\ \\    / /",
    "  \\ \\  / / ",
    "   \\ \\/ /  ",
    "    \\  /   ",
    "     \\/    " 
  };

  private static String[] ascii_art_X = {
    " __   __",
    " \\ \\ / /",
    "  \\ V / ",
    "   > <  ",
    "  / . \\ ",
    " /_/ \\_\\" 
  };
  
  private static String[] ascii_art_L = {
    "  _      ",
    " | |     ",
    " | |     ",
    " | |     ",
    " | |____ ",
    " |______|" 
  };

  private static String[] ascii_art_C = {
    "   _____ ",
    "  / ____|",
    " | |     ",
    " | |     ",
    " | |____ ",
    "  \\_____|" 
  };

  private static String[] ascii_art_D = {
    "  _____  ",
    " |  __ \\ ",
    " | |  | |",
    " | |  | |",
    " | |__| |",
    " |_____/ " 
  };

  private static String[] ascii_art_M = {
    "  __  __ ",
    " |  \\/  |",
    " | \\  / |",
    " | |\\/| |",
    " | |  | |",
    " |_|  |_|" 
  };
  
  public static String print(int num){
    return printAsciiArt(IntegerToRoman.convert(num));
  }

  public static String printAsciiArt(String romanNumber){
    String ascii_roman = "";
    for(int i = 0; i<6;i++){
      for(int j = 0; j < romanNumber.length();j++){
        switch(romanNumber.charAt(j)){
          case 'I':
              ascii_roman += ascii_art_I[i];
              break;
          case 'V':
              ascii_roman += ascii_art_V[i];
              break;
          case 'X':
              ascii_roman += ascii_art_X[i];
              break;
          case 'L':
              ascii_roman += ascii_art_L[i];
              break;
          case 'C':
              ascii_roman += ascii_art_C[i];
              break;
          case 'D':
              ascii_roman += ascii_art_D[i];
              break;
          case 'M':
              ascii_roman += ascii_art_M[i];
              break;
          default:
              break;
        }
      }
      ascii_roman += "\n";   
    }
  return ascii_roman;
  }
}
