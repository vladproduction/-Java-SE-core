package vladproduction.com.app03;

import java.util.Arrays;

public class Database {

    private final String url;
    private final int port;
    private final String username;
    private final String pass;
    private final Object [] tables;

    public Database(String url, int port, String username, String pass) {
        this.url = url;
        this.port = port;
        this.username = username;
        this.pass = pass;
        this.tables = new Object[] {};
    }

    public Object [] createNewTable(Object [] table){
        Object [] tables;
        tables = new Object[]{table};
        return tables;
    }

    public String getUrl() {
        return url;
    }

    public int getPort() {
        return port;
    }

    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }

    public Object[] getTables() {
        return tables;
    }
}