package tgb.btc.api.web;

public interface INotificationsAPI {

    void newBotDeal(Long dealPid);

    void additionalVerificationReceived(Long dealPid);

    void declinedVerificationReceived(Long dealPid);

    void sendNotify(String message);

    void notifyDeletedDealRequestGroup();

    void newReview(Long reviewPid);

    void publicationOfReviewsOver();

    void reviewPublished();

    void poolChanged(String message);

    void apiDealDeclined(Long apiDealPid);
}
