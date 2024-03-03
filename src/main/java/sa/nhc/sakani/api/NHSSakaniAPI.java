package sa.nhc.sakani.api;

import sa.nhc.sakani.api.repo.LoginAPI;

public class NHSSakaniAPI {

    public final LoginAPI loginApi;

    public NHSSakaniAPI() {
        loginApi = new LoginAPI();
    }
}