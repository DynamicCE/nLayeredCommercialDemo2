package business.abstracts;

import entity.concretes.User;

public
interface ValidationService {
void validateEmailFormat(String email);
void validatePasswordStrength(String password);
    void isUserValidForRegistration( User user );
}
