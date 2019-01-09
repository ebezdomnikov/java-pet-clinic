package javaevgenii.javapetclinic.bootstrap;

import javaevgenii.javapetclinic.model.Owner;
import javaevgenii.javapetclinic.model.Vet;
import javaevgenii.javapetclinic.services.OwnerService;
import javaevgenii.javapetclinic.services.VetService;
import javaevgenii.javapetclinic.services.map.OwnerServiceMap;
import javaevgenii.javapetclinic.services.map.VetServiceMap;
import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner();
        owner.setFirstName("Name");
        owner.setLastName("Name");
        owner.setId(0L);
        System.out.println("Loaded owners...");

        ownerService.save(owner);
        Vet vet = new Vet();
        vet.setFirstName("Name");
        vet.setLastName("Name");
        vet.setId(0L);
        vetService.save(vet);
        System.out.println("Loaded vets...");
    }
}
