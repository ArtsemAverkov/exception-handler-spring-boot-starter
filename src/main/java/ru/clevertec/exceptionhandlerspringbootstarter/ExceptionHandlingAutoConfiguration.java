package ru.clevertec.exceptionhandlerspringbootstarter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ExceptionHandlingAutoConfiguration {

    // Создаем бин RestTemplate, который будет использоваться для отправки ошибок во внешний сервис
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    // Создаем бин ExceptionHandler, который будет перехватывать все исключения в нашем приложении
    @Bean
    public ControllerExceptionHandler exceptionHandler(RestTemplate restTemplate) {
        return new ControllerExceptionHandler();
    }
}