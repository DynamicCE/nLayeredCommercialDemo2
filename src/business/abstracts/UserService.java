package business.abstracts;

import entity.concretes.User;

public
interface UserService {
    void register( User user);
    /* ad soyad kontrolü
    * e posta formatı, e posta var mı kontrolü
    * parola 6 karakter kontrolü
    * onaylama e postası gönderimi
    * */

    void login( String email,String password );
    /*e posta ve parola boş mu kontrolü
    * e posta ve parola eşleşmesi kontrolü
    * başarılı girişte kullanıcıyı bilgilendirme
    * */

    void verifyEmail(String verificationCode);
    /* doğrulama kodu kontrolü
    *   doğrulamayı tamamlama
    * */

}
