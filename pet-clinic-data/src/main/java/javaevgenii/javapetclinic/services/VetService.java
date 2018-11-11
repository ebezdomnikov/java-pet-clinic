package javaevgenii.javapetclinic.services;

import java.util.Set;
import javaevgenii.javapetclinic.model.Vet;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
