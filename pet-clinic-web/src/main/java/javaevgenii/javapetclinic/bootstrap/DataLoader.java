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
        owner.setFirstName("Evgenii");
        owner.setLastName("Bezdomnikov");
        owner.setId(0L);

        ownerService.save(owner);

        Owner owner2 = new Owner();
        owner2.setFirstName("Evgeniia");
        owner2.setLastName("Pavlova");
        owner2.setId(1L);

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet = new Vet();
        vet.setFirstName("John");
        vet.setLastName("Doe");
        vet.setId(0L);

        vetService.save(vet);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jefrey");
        vet2.setLastName("Way");
        vet2.setId(1L);

        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
