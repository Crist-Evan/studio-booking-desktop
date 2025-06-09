/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author MyBook Hype AMD
 * @param <T>
 */
public interface DAO<T> {
    List<T> getAll();
    T getById(int id);
    boolean insert(T obj);
    boolean update(T obj);
    boolean delete(int id);
}
