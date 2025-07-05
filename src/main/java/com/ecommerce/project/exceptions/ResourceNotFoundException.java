package com.ecommerce.project.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    String resourceName ;
    String field;
    String fieldName;
    Long fieildId ;

    public ResourceNotFoundException() {
    }

    public ResourceNotFoundException(String resourceName, String field, String fieldName) {
        super(String.format("Resource %s not found with %s : %s", resourceName ,field, fieldName));
        this.resourceName = resourceName;
        this.field = field;
        this.fieldName = fieldName;
    }

    public ResourceNotFoundException(String resourceName , String field, Long fieildId) {
        super(String.format("Resource %s not found with %s : %d", resourceName ,field, fieildId));
        this.resourceName = resourceName;
        this.field = field;
        this.fieildId = fieildId;
    }
}
