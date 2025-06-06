/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import database.DB_Connection;

/**
 *
 * @author MyBook Hype AMD
 */
public class StudioDAO {

    private Connection conn;

    public StudioDAO() throws SQLException {
        conn = DB_Connection.configuration_db(); // menggunakan DB_Connection.java yang kamu upload
    }

    // CREATE
    public boolean insertStudio(Studio studio) {
        String sql = "INSERT INTO studios (name, location, description, price_per_hour, is_available) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, studio.getName());
            stmt.setString(2, studio.getLocation());
            stmt.setString(3, studio.getDescription());
            stmt.setDouble(4, studio.getPricePerHour());
            stmt.setBoolean(5, studio.isAvailable());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Insert failed: " + e.getMessage());
            return false;
        }
    }

    // READ ALL
    public List<Studio> getAllStudios() {
        List<Studio> list = new ArrayList<>();
        String sql = "SELECT * FROM studios";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Studio s = new Studio(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("location"),
                    rs.getString("description"),
                    rs.getDouble("price_per_hour"),
                    rs.getBoolean("is_available")
                );
                list.add(s);
            }
        } catch (SQLException e) {
            System.out.println("Fetch failed: " + e.getMessage());
        }
        return list;
    }

    // UPDATE
    public boolean updateStudio(Studio studio) {
        String sql = "UPDATE studios SET name=?, location=?, description=?, price_per_hour=?, is_available=? WHERE id=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, studio.getName());
            stmt.setString(2, studio.getLocation());
            stmt.setString(3, studio.getDescription());
            stmt.setDouble(4, studio.getPricePerHour());
            stmt.setBoolean(5, studio.isAvailable());
            stmt.setInt(6, studio.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Update failed: " + e.getMessage());
            return false;
        }
    }

    // DELETE
    public boolean deleteStudio(int id) {
        String sql = "DELETE FROM studios WHERE id=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Delete failed: " + e.getMessage());
            return false;
        }
    }

    // GET BY ID
    public Studio getStudioById(int id) {
        String sql = "SELECT * FROM studios WHERE id=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Studio(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("location"),
                    rs.getString("description"),
                    rs.getDouble("price_per_hour"),
                    rs.getBoolean("is_available")
                );
            }
        } catch (SQLException e) {
            System.out.println("Get by ID failed: " + e.getMessage());
        }
        return null;
    }
}

