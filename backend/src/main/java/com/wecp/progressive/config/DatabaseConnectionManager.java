package com.wecp.progressive.config;

import java.io.InputStream;
import java.util.Properties;

public class DatabaseConnectionManager {
    private static final Properties Properties = new Properties();
    static{
        loadProperties();
    }
    private static void loadProperties(){
        try(InputStream input =DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties"))
    }
}
