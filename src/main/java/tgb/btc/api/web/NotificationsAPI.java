package tgb.btc.api.web;

public interface NotificationsAPI {

    void newBotDeal(Long dealPid);

    void additionalVerificationReceived(Long dealPid);
}
