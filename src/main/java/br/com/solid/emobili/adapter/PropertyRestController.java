package br.com.solid.emobili.adapter;

import br.com.solid.emobili.core.domain.Property;
import br.com.solid.emobili.port.api.PropertyService;
import br.com.solid.emobili.web.PropertyRestUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/property")
public class PropertyRestController implements PropertyRestUI {

    @Autowired
    private PropertyService propertyService;

    @Override
    public Property createProperty(Property property) {
        propertyService.createProperty(property);
        return property;
    }

    @Override
    public Property findByOwner(String owner) {
        return propertyService.findByOwner(owner);
    }

    @Override
    public List<Property> findAll() {
        return propertyService.findAll();
    }
}
