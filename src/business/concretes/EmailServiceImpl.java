package business.concretes;

import business.abstracts.EmailService;

public
class EmailServiceImpl implements EmailService {

    @Override
    public
    void sendVerificationEmail () {
        System.out.println ("onay e postası gönderildi" );
    }
}
