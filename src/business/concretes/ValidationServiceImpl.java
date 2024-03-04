package business.concretes;

import business.abstracts.ValidationService;
import entity.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public
class ValidationServiceImpl implements ValidationService {

    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final Pattern pattern = Pattern.compile ( EMAIL_PATTERN );


    @Override
    public
    boolean checkUserName (String firstName,String lastName) {
        return (firstName.length () >2 && lastName.length ()>2);
    }

    @Override
    public
    boolean validateEmailFormat ( String email ) {
        Matcher matcher = pattern.matcher ( email );
        return matcher.matches ( );
    }

    @Override
    public
    boolean validatePasswordStrength ( String password ) {
        return password.length ( ) < 6 ;
    }

    @Override
    public
    boolean isUserValidForRegistration ( User user ) {
        return true;
    }
}
