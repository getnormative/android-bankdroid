package com.liato.bankdroid.banking;


import com.liato.bankdroid.api.configuration.Field;
import com.liato.bankdroid.api.configuration.FieldBuilder;
import com.liato.bankdroid.api.configuration.FieldType;
import com.liato.bankdroid.api.configuration.ProviderConfiguration;

import java.util.LinkedHashMap;
import java.util.Map;

public class DefaultProviderConfiguration implements ProviderConfiguration {

        public static final String NAME = "name";

        private Map<String, Field> mConfiguration;

        @Override
        public Map<String, Field> getConfiguration() {
            if(mConfiguration == null) {
                mConfiguration = createConfiguration();
            }
            return mConfiguration;
        }

        private Map<String, Field> createConfiguration() {
            Map<String, Field> configuration = new LinkedHashMap<>();

            configuration.put(NAME, new FieldBuilder(NAME)
                    .label("Custom name")
                    .fieldType(FieldType.TEXT)
                    .build());
            return configuration;
        }
    }

