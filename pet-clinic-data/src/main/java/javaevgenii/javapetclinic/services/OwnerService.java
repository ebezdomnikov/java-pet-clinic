package javaevgenii.javapetclinic.services;

import java.util.Set;
import javaevgenii.javapetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
