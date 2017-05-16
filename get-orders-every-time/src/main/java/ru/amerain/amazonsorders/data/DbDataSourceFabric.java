package ru.amerain.amazonsorders.data;


import ru.amerain.amazonsorders.data.jdbc.JdbcDataManager;

public class DbDataSourceFabric implements DataSourceFabric {
    public DataManager createDataSource() {
        return new JdbcDataManager();
    }
}
