package br.com.erudio.restwithspringbootandjava.service;

import org.springframework.stereotype.Service;


public class ConversionService {


    public static Double convertToDouble(String numberString) {
        if (numberString == null) return 0D;
        String number = numberString.replaceAll(",", ".");
        if (isNumeric(number)) return Double.parseDouble(number);
        return 0D;
    }

    public static boolean isNumeric(String numberString) {
        if (numberString == null) return false;
        String number = numberString.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
