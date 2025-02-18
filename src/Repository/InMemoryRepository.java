package Repository;


import java.util.*;

/**
 * Generic in-memory repository for managing entities.
 */
public class InMemoryRepository<T> implements IRepository<T> {
    private final Map<Integer, T> entities = new HashMap<>();
    private int currentId = 1;

    /**
     * *
     * @param entity
     */
    @Override
    public void add(T entity) {
        if (entity instanceof Identifiable) {
            ((Identifiable) entity).setId(currentId);
            entities.put(currentId, entity);
            currentId++;
        } else {
            throw new IllegalArgumentException("Entity must implement Identifiable");
        }
    }

    /**
     *
     * @param id
     * @param entity
     */
    @Override
    public void update(int id, T entity) {
        if (!entities.containsKey(id)) {
            throw new NoSuchElementException("Entity not found");
        }
        ((Identifiable) entity).setId(id);
        entities.put(id, entity);
    }

    /**
     *
     * @param id
     */
    @Override
    public void delete(int id) {
        entities.remove(id);
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public T get(int id) {
        return entities.get(id);
    }

    /**
     *
     * @return
     */
    @Override
    public List<T> getAll() {
        return new ArrayList<>(entities.values());
    }
}

