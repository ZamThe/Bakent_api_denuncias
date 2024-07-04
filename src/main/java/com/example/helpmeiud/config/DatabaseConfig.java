package com.example.helpmeiud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); // Asegúrate de usar el driver correcto para MySQL
        dataSource.setUrl("jdbc:mysql://localhost/aplicativo"); // URL de conexión a tu base de datos
        dataSource.setUsername(""); // Usuario de la base de datos (en tu caso, vacío)
        dataSource.setPassword(""); // Contraseña de la base de datos (en tu caso, vacío)
        return dataSource;
    }


}
