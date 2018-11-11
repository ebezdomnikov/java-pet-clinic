package javaevgenii.javapetclinic.services;

import java.util.Set;
import javaevgenii.javapetclinic.model.Owner;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
