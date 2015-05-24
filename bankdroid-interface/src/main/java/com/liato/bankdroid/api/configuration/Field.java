package com.liato.bankdroid.api.configuration;

import java.util.List;

public interface Field {

    String getReference();

    String getPlaceholder();

    String getLabel();

    FieldType getFieldType();

    boolean isRequired();

    boolean isHidden();

    boolean isEncrypted();

    void validate(String value) throws IllegalArgumentException;
}
