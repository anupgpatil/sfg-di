package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
@Profile({"dog", "default"})
@Qualifier("petService")
@Service
public class DogPetService implements PetService{
    public String getPetType(){
        return "Dogs are the best!";
    }
}
