package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entity.concretes.User;

public
class HibernateUserDao implements UserDao {

    @Override
    public
    void add ( User user ) {

    }

    @Override
    public
    boolean emailExists ( String email ) {
        return false;
    }
}
