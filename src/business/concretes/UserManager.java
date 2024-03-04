package business.concretes;

import business.abstracts.EmailService;
import business.abstracts.LoginService;
import business.abstracts.UserService;
import business.abstracts.ValidationService;
import dataAccess.abstracts.UserDao;
import entity.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public
class UserManager implements UserService {
    private
    EmailService emailService;
    private
    ValidationService validationService;
    private
    LoginService loginService;
    private
    UserDao userDao;

    public
    UserManager ( EmailService emailService, ValidationService validationService, LoginService loginService, UserDao userDao ) {
        this.emailService = emailService;
        this.validationService = validationService;
        this.loginService = loginService;
        this.userDao = userDao;
    }

    @Override
    public
    void register ( User user ) {
        if (validationService.isUserValidForRegistration ( user ) &&
                validationService.checkUserName ( user.getFirstName ( ), user.getLastName ( ) ) &&
                validationService.validateEmailFormat ( user.getEmail ( ) ) &&
                validationService.validatePasswordStrength ( user.getPassword ( ) )){
            userDao.add ( user );
            System.out.println ("Başarı ile kaydolundu" );
        }

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
