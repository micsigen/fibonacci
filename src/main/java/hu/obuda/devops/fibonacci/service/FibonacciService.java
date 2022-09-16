package hu.obuda.devops.fibonacci.service;

import org.springframework.stereotype.Service;

@Service
public class FibonacciService {

    /**
     * @param n
     * @return Math exp: fib(n) = fib(n - 1) + fib(n - 2)
     */
    public Integer fibonacci(Integer n) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
