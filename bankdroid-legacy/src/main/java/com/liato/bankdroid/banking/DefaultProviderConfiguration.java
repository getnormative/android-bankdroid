package com.liato.bankdroid.banking;


import com.liato.bankdroid.api.configuration.Field;
import com.liato.bankdroid.api.configuration.FieldBuilder;
import com.liato.bankdroid.api.configuration.FieldType;
import com.liato.bankdroid.api.configuration.ProviderConfiguration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DefaultProviderConfiguration implements ProviderConfiguration {

    public static final String NAME = "name";

    private List<Field> configuration;

    public DefaultProviderConfiguration() {
        configuration = createConfiguration();
    }
        @Override
        public List<Field> getConfiguration() {
            return configuration;
        }

        private List<Field> createConfiguration() {
            List<Field> configuration = new ArrayList<>();
            configuration.add(new FieldBuilder(NAME)
                    .label("Custom name")
                    .fieldType(FieldType.TEXT)
                    .build());
            return configuration;
        }
    }

