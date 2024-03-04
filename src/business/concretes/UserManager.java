package business.concretes;

import business.abstracts.UserService;
import entity.concretes.User;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public
class UserManager implements UserService {



    @Override
    public
    void register ( User user ) {



    }

    @Override
    public
    void login ( String email, String password ) {
        // giriş yaptıracak kod
    }

    @Override
    public
    void verifyEmail ( String verificationCode ) {
//email doğrulama işlemleri
    }
}
