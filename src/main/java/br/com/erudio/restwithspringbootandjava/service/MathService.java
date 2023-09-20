package br.com.erudio.restwithspringbootandjava.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public class MathService {


    public Double sum(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }


    public Double subtraction(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }


    public Double division(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }


    public Double multiplication(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }


    public Double media(Double numberOne, Double numberTwo) {
        return ((numberOne) + (numberTwo)) / 2;
    }


    public Double squareRoot(Double numberOne) {
        return Math.sqrt(numberOne);
    }

}
