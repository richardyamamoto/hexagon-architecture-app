package br.com.solid.emobili.adapter;

import br.com.solid.emobili.core.domain.Property;
import br.com.solid.emobili.port.spi.PropertyRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class PropertyRepositoryImpl implements PropertyRepository {
    private Map<String, Property> properties = new HashMap<String, Property>();

    @Override
    public Property createProperty(Property property) {
        return properties.put(property.getOwner(), property);
    }

    @Override
    public Property findByOwner(String owner) {
        return properties.get(owner);
    }

    @Override
    public List<Property> findAll() {
        return properties.values().stream().collect(Collectors.toList());
    }
}
