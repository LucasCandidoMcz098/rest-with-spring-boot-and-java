package br.com.erudio.restwithspringbootandjava;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable(value = "numberOne") Double numberOne,@PathVariable(value = "numberTwo") Double numberTwo){
        return 1D;
    }

}
