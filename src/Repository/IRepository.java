package Repository;


import java.util.List;

/**
 * Generic interface for repository operations.
 */
public interface IRepository<T> {
    void add(T entity);
    void update(int id, T entity);
    void delete(int id);
    T get(int id);
    List<T> getAll();
}