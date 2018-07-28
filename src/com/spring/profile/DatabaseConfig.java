package com.spring.profile;

import javax.sql.DataSource;

public interface DatabaseConfig {
	DataSource createDataSource();

}
