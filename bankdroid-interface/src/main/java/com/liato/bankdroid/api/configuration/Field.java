package com.liato.bankdroid.api.configuration;

public interface Field {

    String getReference();

    String getPlaceholder();

    String getLabel();

    FieldType getFieldType();

    boolean isRequired();

    boolean isHidden();

    boolean isEncrypted();
}
