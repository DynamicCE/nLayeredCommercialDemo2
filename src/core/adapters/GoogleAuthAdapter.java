package core.adapters;

import business.abstracts.AuthService;
import core.external.GoogleAuthService;

public
class GoogleAuthAdapter  implements AuthService {
    public
    GoogleAuthAdapter ( GoogleAuthService googleAuthService ) {
        this.googleAuthService = googleAuthService;
    }

    private
    GoogleAuthService googleAuthService;



    @Override
    public
    void registerWithGoogle (String email) {
        googleAuthService.register (email  );
    }
}
