package com.wlabs.parkoo.backend.database;

import java.sql.Connection;
import java.util.List;

/**
 * @param <Object>
 * @licence MIT Licence
 * @author Wilfried AGO
 * @email wilfriedago@pm.me
 */
public abstract class DAO<Object> {

    public Connection connect = ConnectionDB.getInstance();

    public abstract List<Object> selectAll();

    public abstract Object findById(String id);

    public abstract int insert(Object obj);

    public abstract int update(Object obj);

    public abstract int delete(String id);
}
