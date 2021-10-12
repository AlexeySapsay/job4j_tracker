package ru.job4j.tracker;

import ru.job4j.tracker.model.Item;

import java.util.ArrayList;
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
public class MemTracker implements Store {
    /**
     * Массив для хранения заявок
     */
    private final List<Item> items = new ArrayList<Item>();
    private int ids = 1;

    /**
     *
     */
    @Override
    public void init() {

    }

    /**
     * Метод реализует добавление заявки в хранилище заявок
     *
     * @param item добавляемая заявка
     * @return заявка после добавления
     */
    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    /**
     * Метод реализует получение списка всех заявок из хранилища
     *
     * @return список заявок, находящихся в хранилище
     */
    public List<Item> findAll() {
        return List.copyOf(items);
    }

    /**
     * Метод реализует поиск заявки в хранилище, по name
     *
     * @param key имя заявки
     * @return список заявок с одинаковым именем
     */
    public List<Item> findByName(String key) {
        List<Item> itemsWithoutNull = new ArrayList<Item>(items.size());

        for (Item item : items) {
            if (item.getName().equals(key)) {
                itemsWithoutNull.add(item);
            }
        }
        return itemsWithoutNull;
    }

    /**
     * Метод возвращает индекс index по id заявки
     *
     * @param id заявки для поиска
     * @return index заявки
     */
    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод реализует поиск заявки по id заявки
     *
     * @param id заявки для поиска
     * @return item найденная заявка
     */
    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    /**
     * Метод реализует замену заявки с сохранением прежнего id
     *
     * @param id   заявки
     * @param item заявка для замены по найденному id
     * @return true- когда замена успешна, false- во всех остальных случаях
     */
    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            items.set(index, item);
            items.get(index).setId(id);
        }
        return result;
    }

    /**
     * Метод реализует удаление заявки по предоставленному id
     *
     * @param id заявки для замены
     * @return true- когда удаление успешно, false- во всех остальных случаях
     */
    public boolean delete(int id) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (index != -1) {
            items.remove(index);
        }
        return result;
    }

    @Override
    public void close() throws Exception {

    }
}