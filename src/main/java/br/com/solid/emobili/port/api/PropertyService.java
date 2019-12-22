package br.com.solid.emobili.port.api;

import br.com.solid.emobili.core.domain.Property;

import java.util.List;

public interface PropertyService {
    Property createProperty(Property property);
    Property findByOwner(String owner);
    List<Property> findAll();
}
