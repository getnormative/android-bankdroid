package com.liato.bankdroid.banking;


import com.liato.bankdroid.api.configuration.Entry;
import com.liato.bankdroid.api.configuration.Field;
import com.liato.bankdroid.api.configuration.FieldBuilder;
import com.liato.bankdroid.api.configuration.FieldType;
import com.liato.bankdroid.api.configuration.ProviderConfiguration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public enum DefaultProviderConfiguration {

    INSTANCE;

    public static final String NAME = "name";

    private List<Field> configuration;

    DefaultProviderConfiguration() {
        configuration = createConfiguration();
    }

    private List<Field> createConfiguration() {
        List<Field> configuration = new ArrayList<>();
        configuration.add(new FieldBuilder(NAME)
                .label("Custom name")
                .fieldType(FieldType.TEXT)
                .build());
        configuration.add(new FieldBuilder("test")
        .label("selectbox")
        .values(Arrays.asList(new Entry[] {new Entry("test", "Test1"), new Entry("test2", "Test2")})).build());
        return configuration;
    }

    public static List<Field> fields() {
        return INSTANCE.configuration;
    }
}
