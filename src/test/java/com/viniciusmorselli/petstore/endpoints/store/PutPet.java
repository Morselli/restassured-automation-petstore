package com.viniciusmorselli.petstore.endpoints.store;

import java.sql.Array;

public class PutPet {
    int id;
    Object category;
    String name;
    String[] photoUrls;
    Object[] tags;
    String status;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public class PutPetObject {
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public PutPetObject(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public Object getCategory() {
        return category;
    }

    public void setCategory(int id, String name) {
        Object categoryItem = new PutPetObject(id, name);
        this.category = categoryItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(String[] photoUrls) {
        this.photoUrls = photoUrls;
    }

    public Object[] getTags() {
        return tags;
    }

    public void setTags(int id, String name) {
        PutPetObject[] tagsItems = new PutPetObject[1];
        tagsItems[0] = new PutPetObject(0, "string");
        this.tags = tagsItems;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
