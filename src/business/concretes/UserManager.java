package business.concretes;

import business.abstracts.UserService;
import entity.concretes.User;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public
class UserManager implements UserService {
    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    private static boolean validateEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


    @Override
    public
    void register ( User user ) {
        if(user.getPassword ().length () <6 ){
            System.out.println ("parola en az 6 karakterden oluşmalıdır" );
            return;
        }else if(!validateEmail ( user.getEmail ( ) )){
            System.out.println ("lütfen geçerli bir email giriniz" );
            return;
        }else if (user.getFirstName ().length ()<2 || user.getLastName ().length ()<2){
            System.out.println ("lütfen geçerli bir isim giriniz" );
            return;
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
