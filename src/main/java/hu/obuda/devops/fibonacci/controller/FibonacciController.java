package hu.obuda.devops.fibonacci.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import hu.obuda.devops.fibonacci.service.FibonacciService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/")
public class FibonacciController {

    @Autowired
    FibonacciService fibonacciService;

    final Integer LIMIT = 46;

    @GetMapping(value = "fibonacci")
    public Integer getFibonacci(@RequestParam Integer n) {
        if (n > LIMIT)
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        return fibonacciService.fibonacci(n);
    }

}
