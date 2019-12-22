package br.com.solid.emobili.core.impl;

import br.com.solid.emobili.adapter.PropertyRepositoryImpl;
import br.com.solid.emobili.core.domain.Property;
import br.com.solid.emobili.port.api.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyRepositoryImpl propertyRepository;

    @Override
    public Property createProperty(Property property) {
        return propertyRepository.createProperty(property);
    }

    @Override
    public Property findByOwner(String owner) {
        return propertyRepository.findByOwner(owner);
    }

    @Override
    public List<Property> findAll() {
        return propertyRepository.findAll();
    }
}
