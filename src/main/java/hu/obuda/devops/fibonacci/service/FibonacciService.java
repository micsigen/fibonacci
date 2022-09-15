package hu.obuda.devops.fibonacci.service;

import org.springframework.stereotype.Service;

@Service
public class FibonacciService {

    /**
     * @param n
     * @return Math exp: fib(n) = fib(n - 1) + fib(n - 2)
     */
    public String fibonacci(Integer n) {
        Integer a = 0, b = 0, c = 1;
        StringBuffer stringBuffer = new StringBuffer();

        for (Integer i = 1; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
            stringBuffer.append(a);
            stringBuffer.append(" ");
        }
        return stringBuffer.toString();
    }
}
