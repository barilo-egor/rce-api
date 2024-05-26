package tgb.btc.api.web;

public interface INotificationsAPI {

    void newBotDeal(Long dealPid);

    void additionalVerificationReceived(Long dealPid);

    void declinedVerificationReceived(Long dealPid);
}
