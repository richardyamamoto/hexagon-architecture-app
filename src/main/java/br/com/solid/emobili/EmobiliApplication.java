package br.com.solid.emobili;

import br.com.solid.emobili.adapter.PropertyRepositoryImpl;
import br.com.solid.emobili.core.domain.Property;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class EmobiliApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmobiliApplication.class, args);

    }
}
