package br.com.solid.emobili.port.spi;

import br.com.solid.emobili.core.domain.Property;

import java.util.List;

public interface PropertyRepository {
    Property createProperty(Property property);
    Property findByOwner(String owner);
    List<Property> findAll();
}
