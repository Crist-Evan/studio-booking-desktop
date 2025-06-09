/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import database.DB_Connection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author MyBook Hype AMD
 */
public abstract class BaseDAO<T> implements DAO<T> {
    protected Connection conn;
    
    public abstract List<T> getAll();
    public abstract T getById(int id);
    public abstract boolean insert(T obj);
    public abstract boolean update(T obj);
    public abstract boolean delete(int id);
}
