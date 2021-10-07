package ru.job4j.tracker;

import java.util.List;

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
public interface Store extends AutoCloseable {
    /**
     * Метод реализует подключение к базе данных
     */
    void init();

    /**
     * Метод реализует добавление заявки в хранилище заявок
     *
     * @param item добавляемая заявка
     * @return заявка после добавления
     */
    Item add(Item item);

    /**
     * Метод реализует замену заявки с сохранением прежнего id
     *
     * @param id   заявки
     * @param item заявка для замены по найденному id
     * @return true- когда замена успешна, false- во всех остальных случаях
     */
    boolean replace(int id, Item item);

    /**
     * Метод реализует удаление заявки по предоставленному id
     *
     * @param id заявки для замены
     * @return true- когда удаление успешно, false- во всех остальных случаях
     */
    boolean delete(int id);

    /**
     * Метод реализует получение списка всех заявок из хранилища
     *
     * @return список заявок, находящихся в хранилище
     */
    List<Item> findAll();

    /**
     * Метод реализует поиск заявки в хранилище, по name
     *
     * @param key имя заявки
     * @return список заявок с одинаковым именем
     */
    List<Item> findByName(String key);

    /**
     * Метод реализует поиск заявки по id заявки
     *
     * @param id заявки для поиска
     * @return item найденная заявка
     */
    Item findById(int id);
}
