package hu.obuda.devops.fibonacci.integration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class IntegrationTest {

    RestTemplate restTemplate = new RestTemplate();

    @Test
    void callFibonacciEndpoint() {
        // given

        // when
        ResponseEntity<String> entity = restTemplate.getForEntity("http://localhost:8080/fibonacci?n=5", String.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, entity.getStatusCode());
        Assertions.assertEquals("3", entity.getBody());
    }

    @Test
    void callFibonacciEndpointWithInvalid() throws Exception {
        // given

        // when
        RestClientException thrown = Assertions.assertThrows(RestClientException.class,
                () -> restTemplate.getForEntity("http://localhost:8080/fibonacci?n=47", String.class));

        // then
        Assertions.assertNotNull(thrown);
    }
}
