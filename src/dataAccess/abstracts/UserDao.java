package dataAccess.abstracts;

import entity.concretes.User;

public
interface UserDao {
void add( User user );
boolean emailExists(String email);
}
