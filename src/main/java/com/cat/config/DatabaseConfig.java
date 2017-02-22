package com.cat.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "db")
@Component
@Getter
@Setter
@ToString
public class DatabaseConfig {
	private String url;
	private String username;
	private String password;
}
