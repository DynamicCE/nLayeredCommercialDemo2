package business.abstracts;

import entity.concretes.User;

public
interface ValidationService {
    boolean checkUserName(String firstName,String lastName);
boolean validateEmailFormat(String email);
boolean validatePasswordStrength(String password);
    boolean isUserValidForRegistration( User user );
}
