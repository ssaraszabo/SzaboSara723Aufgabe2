package Repository;


import java.util.*;

/**
 * Generic in-memory repository for managing entities.
 */
public class InMemoryRepository<T> implements IRepository<T> {
    private final Map<Integer, T> entities = new HashMap<>();
    private int currentId = 1;

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

    @Override
    public void update(int id, T entity) {
        if (!entities.containsKey(id)) {
            throw new NoSuchElementException("Entity not found");
        }
        ((Identifiable) entity).setId(id);
        entities.put(id, entity);
    }

    @Override
    public void delete(int id) {
        entities.remove(id);
    }

    @Override
    public T get(int id) {
        return entities.get(id);
    }

    @Override
    public List<T> getAll() {
        return new ArrayList<>(entities.values());
    }
}

