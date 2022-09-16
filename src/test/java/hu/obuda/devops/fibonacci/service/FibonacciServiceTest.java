package hu.obuda.devops.fibonacci.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FibonacciServiceTest {

    private FibonacciService underTest = new FibonacciService();

    @Test
    void shouldReturn55WhenCall10() {
        // given

        // when
        Integer result = underTest.fibonacci(10);
        // then
        Assertions.assertEquals(34, result);
    }

    @Test
    void shouldReturn0WhenCall1() {
        // given

        // when
        Integer result = underTest.fibonacci(1);
        // then
        Assertions.assertEquals(0, result);
    }

    @Test
    void shouldReturn1WhenCall2() {
        // given

        // when
        Integer result = underTest.fibonacci(2);
        // then
        Assertions.assertEquals(1, result);
    }

    @Test
    void shouldReturn1WhenCall3() {
        // given

        // when
        Integer result = underTest.fibonacci(3);
        // then
        Assertions.assertEquals(1, result);
    }

    @Test
    void shouldReturn2WhenCall4() {
        // given

        // when
        Integer result = underTest.fibonacci(4);
        // then
        Assertions.assertEquals(2, result);
    }
}
