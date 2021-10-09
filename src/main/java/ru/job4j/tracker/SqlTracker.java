package ru.job4j.tracker;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * https://job4j.ru/profile/exercise/55/task-view/348
 * Изучение работы с JDBC. Подключение JDBC и чтение файла app.properties
 * в качестве настроечного файла.
 * Рефакторинг проекта Tracker
 *
 * @author AlexSapsay (sapsayalexey@gmail.com)
 * @version 1.0
 * @since 05.10.2021
 */

public class SqlTracker implements Store {
    private Connection connection;

    /**
     * Метод реализует подключение к базе данных
     */
    public void init() {
        try (InputStream in = SqlTracker.class.getClassLoader().
                getResourceAsStream("app.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            connection = DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")
            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Метод реализует добавление заявки в базу данных заявок
     *
     * @param item добавляемая заявка
     * @return заявка после добавления
     */
    @Override
    public Item add(Item item) {
        try (PreparedStatement statement =
                     connection.prepareStatement(
                             "INSERT INTO items(name, created) values (?, ?)",
                             Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, item.getName());
            statement.setTimestamp(2, Timestamp.valueOf(item.getCreated()));
            statement.execute();
            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    item.setId(generatedKeys.getInt(1));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return item;
    }

    /**
     * Метод реализует замену заявки с сохранением прежнего id
     *
     * @param id   заявки
     * @param item заявка для замены по найденному id
     * @return true- когда замена успешна, false- во всех остальных случаях
     */
    @Override
    public boolean replace(int id, Item item) {
        boolean result = false;
        long millis = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(millis);
        try (PreparedStatement statement =
                     connection.prepareStatement(
                             "UPDATE items SET name = ?, created = ? WHERE id = ?")) {
            statement.setString(1, item.getName());
            statement.setTimestamp(2, timestamp);
            statement.setInt(3, id);
            result = statement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Метод реализует удаление заявки по предоставленному id
     *
     * @param id заявки для замены
     * @return true- когда удаление успешно, false- во всех остальных случаях
     */
    @Override
    public boolean delete(int id) {
        boolean result = false;
        try (PreparedStatement statement =
                     connection.prepareStatement(
                             "DELETE FROM items WHERE id = ?")) {
            statement.setInt(1, id);
            result = statement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Метод реализует получение списка всех заявок из хранилища
     *
     * @return список заявок, находящихся в хранилище
     */
    @Override
    public List<Item> findAll() {
        List<Item> itemList = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM items")) {
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    itemList.add(new Item(
                            resultSet.getInt("id"),
                            resultSet.getString("name"),
                            (resultSet.getTimestamp("created")).toLocalDateTime()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return itemList;
    }

    /**
     * Метод реализует поиск заявки в хранилище, по name
     *
     * @param key имя заявки
     * @return список заявок с одинаковым именем
     */
    @Override
    public List<Item> findByName(String key) {
        List<Item> itemList = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM items WHERE name LIKE ?")) {
            statement.setString(1, key);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    itemList.add(new Item(resultSet.getString("name")));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return itemList;
    }

    /**
     * Метод реализует поиск заявки по id заявки
     *
     * @param id заявки для поиска
     * @return item найденная заявка
     */
    @Override
    public Item findById(int id) {
        Item item = null;
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM items WHERE id = ?")) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    item = new Item(resultSet.getString("name"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return item;
    }

    /**
     * Метод реализует закрытие ресурса- соединение с базой данных
     *
     * @throws Exception исключение, если соединение не удалось закрыть
     */
    @Override
    public void close() throws Exception {
        if (connection != null) {
            connection.close();
        }
    }
}
