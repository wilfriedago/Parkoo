package com.wlabs.parkoo.backend;

import java.sql.Connection;

/**
 * @param <T>
 * @licence MIT Licence
 * @author Wilfried AGO
 * @email wilfriedago@pm.me
 */
public abstract class DAO<T> {

    public Connection connect = ConnectionDB.getInstance();

    public abstract T findById(int id);

    public abstract T create(T obj);

    public abstract T update(T obj);

    public abstract void delete(T obj);
}
