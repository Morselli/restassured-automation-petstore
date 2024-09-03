package com.viniciusmorselli.petstore.data;

import com.viniciusmorselli.petstore.endpoints.store.GetPetById;
import com.viniciusmorselli.petstore.endpoints.store.PutPet;

import java.util.HashMap;
import java.util.Map;

public class PetData {

    public Map<String, Object> findPetByIdData() {
        GetPetById getPetById = new GetPetById();

        getPetById.setPetId(50);

        Map<String, Object> requestData = new HashMap<>();

        requestData.put("petId", getPetById.getPetId());

        return requestData;
    }

    public Map<String, Object> updatePetData() {
        PutPet putPet = new PutPet();
        String[] photoUrlItems = new String[1];
        photoUrlItems[0] = "string";

        putPet.setId(49065);
        putPet.setCategory(0, "string");
        putPet.setPhotoUrls(photoUrlItems);
        putPet.setName("Labrador");
        putPet.setTags(0, "string");
        putPet.setStatus("sold");

        Map<String, Object> requestData = new HashMap<>();

        requestData.put("id", putPet.getId());
        requestData.put("category", putPet.getCategory());
        requestData.put("photoUrls", putPet.getPhotoUrls());
        requestData.put("name", putPet.getName());
        requestData.put("tags", putPet.getTags());
        requestData.put("status", putPet.getStatus());

        return requestData;
    }
}
