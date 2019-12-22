package br.com.solid.emobili.web;

import br.com.solid.emobili.core.domain.Property;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface PropertyRestUI {

    @PostMapping("/create")
    Property createProperty(@RequestBody Property property);

    @GetMapping("/find/{owner}")
    Property findByOwner(@PathVariable("owner") String owner);

    @GetMapping("/find/all")
    List<Property> findAll();

}
