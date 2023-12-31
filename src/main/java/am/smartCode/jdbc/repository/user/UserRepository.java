package am.smartCode.jdbc.repository.user;

import am.smartCode.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserRepository {

    void create(User user) throws SQLException;

    void update(User user) throws SQLException;

    User get(Long id) throws SQLException;
    User get(String email) throws SQLException;

    List<User> getAll() throws SQLException;

    List<User> findUsersByName(String name) throws SQLException;

    void delete(long id) throws SQLException;

}