package com.viniciusmorselli.petstore.data;

import com.viniciusmorselli.petstore.endpoints.store.PostStoreOrder;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class StoreData {
    public Map<String, Object> placeAnOrderForAPetData() {
        PostStoreOrder postStoreOrder = new PostStoreOrder();

        postStoreOrder.setId(2);
        postStoreOrder.setPetId(2);
        postStoreOrder.setQuantity(1);
        postStoreOrder.setShipDate(LocalDateTime.now().toString());
        postStoreOrder.setStatus("placed");
        postStoreOrder.setComplete(true);

        Map<String, Object> requestData = new HashMap<>();

        requestData.put("id", postStoreOrder.getId());
        requestData.put("petId", postStoreOrder.getPetId());
        requestData.put("quantity", postStoreOrder.getQuantity());
        requestData.put("shipDate", postStoreOrder.getShipDate());
        requestData.put("status", postStoreOrder.getStatus());
        requestData.put("complete", postStoreOrder.getComplete());

        return requestData;
    }
}
