package hu.obuda.devops.fibonacci.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.obuda.devops.fibonacci.service.FibonacciService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/")
public class FibonacciController {

    @Autowired
    FibonacciService fibonacciService;

    @GetMapping(value = "fibonacci")
    public Integer getFibonacci(@RequestParam Integer n) {
        return fibonacciService.fibonacci(n);
    }

}
