////////////////////////////////////////////////////////////////////
// Matteo Stocco 2000552
// Alessandro Carraro 2000548
////////////////////////////////////////////////////////////////////
package main.java.it.unipd.mtss;

import java.util.Arrays;

public class IntegerToRoman {
    private static String[] roman_char = {"M","D","C","L","X","V","I"};
    private static int[] int_num = {1000, 500, 100, 50, 10, 5, 1};

    public static String convert(int number){
        StringBuilder roman_number = new StringBuilder();
        
        if(number<=0 || number>1000){
            throw new IllegalArgumentException("Il parametro non e' valido");
        }

        for(int i = 0; i<int_num.length; i++){
            while(number>= int_num[i]){
                roman_number.append(roman_char[i]);
                number -= int_num[i];
            } 
        }

        for(int j = 0; j<roman_number.length();j++){ 
            if((j+3) < roman_number.length()){
                if(roman_number.charAt(j) == roman_number.charAt(j+1) && 
                roman_number.charAt(j) == roman_number.charAt(j+2) &&
                roman_number.charAt(j) == roman_number.charAt(j+3)){
                    String s = "" + roman_number.charAt(j);
                    int k = Arrays.asList(roman_char).indexOf(s);
                    roman_number.deleteCharAt(j+3);
                    roman_number.deleteCharAt(j+2);
                    roman_number.setCharAt(j+1, roman_char[k-1].charAt(0));
                }
            }
        }
        
        for(int j = 0; j<roman_number.length();j++){ 
            if((j+2) < roman_number.length()){
                if(roman_number.charAt(j) == roman_number.charAt(j+2) 
                && roman_number.charAt(j) != 'I' 
                && roman_number.charAt(j) != 'X' 
                && roman_number.charAt(j) != 'C'){
                    String s = "" + roman_number.charAt(j);
                    char s1 = roman_number.charAt(j+1);
                    int k = Arrays.asList(roman_char).indexOf(s);
                    roman_number.deleteCharAt(j+2);
                    roman_number.setCharAt(j, s1);
                    roman_number.setCharAt(j+1, roman_char[k-1].charAt(0));
                }
            }
        }
        return roman_number.toString();
    }
    
}

