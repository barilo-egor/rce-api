package tgb.btc.api.web;

public interface INotifier {

    void notifyNewApiDeal(Long apiDealPid);

    void notifyDealAutoDeleted(Long chatId, Integer messageId);

    void sendNotify(Long chatId, String text);

    void sendLoginRequest(Long chatId);
}
