package br.com.erudio.restwithspringbootandjava.controller;

import br.com.erudio.restwithspringbootandjava.service.ConversionService;
import br.com.erudio.restwithspringbootandjava.service.MathService;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {

    private final AtomicLong counter = new AtomicLong();
    private ConversionService conversionService;
    private MathService mathService = new MathService();


    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if ((!ConversionService.isNumeric(numberOne) || !ConversionService.isNumeric(numberTwo)) || (numberOne == null || numberTwo == null)) {
            throw new UnsupportedOperationException("Please set a numeric value");
        }
        return mathService.sum(ConversionService.convertToDouble(numberOne), ConversionService.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtraction(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if ((!ConversionService.isNumeric(numberOne) || !ConversionService.isNumeric(numberTwo)) || (numberOne == null || numberTwo == null)) {
            throw new UnsupportedOperationException("Please set a numeric value");
        }
        return mathService.subtraction(ConversionService.convertToDouble(numberOne), ConversionService.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double division(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if ((!ConversionService.isNumeric(numberOne) || !ConversionService.isNumeric(numberTwo)) || (numberOne == null || numberTwo == null)) {
            throw new UnsupportedOperationException("Please set a numeric value");
        }
        return mathService.division(ConversionService.convertToDouble(numberOne), ConversionService.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplication(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if ((!ConversionService.isNumeric(numberOne) || !ConversionService.isNumeric(numberTwo)) || (numberOne == null || numberTwo == null)) {
            throw new UnsupportedOperationException("Please set a numeric value");
        }
        return mathService.multiplication(ConversionService.convertToDouble(numberOne), ConversionService.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/media/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double media(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if ((!ConversionService.isNumeric(numberOne) || !ConversionService.isNumeric(numberTwo)) || (numberOne == null || numberTwo == null)) {
            throw new UnsupportedOperationException("Please set a numeric value");
        }
        return mathService.media(ConversionService.convertToDouble(numberOne), ConversionService.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/squareRoot/{numberOne}", method = RequestMethod.GET)
    public Double squareRoot(@PathVariable(value = "numberOne") String numberOne) throws Exception {
        if (!ConversionService.isNumeric(numberOne) || numberOne == null) {
            throw new UnsupportedOperationException("Please set a numeric value");
        }
        return mathService.squareRoot(ConversionService.convertToDouble(numberOne));
    }



}
