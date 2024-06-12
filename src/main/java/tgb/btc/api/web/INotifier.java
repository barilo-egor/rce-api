package tgb.btc.api.web;

import java.io.File;

public interface INotifier {

    void notifyNewApiDeal(Long apiDealPid);

    void notifyDealAutoDeleted(Long chatId, Integer messageId);

    void notifyDealDeletedByAdmin(Long chatId);

    void sendNotify(Long chatId, String text);

    void sendLoginRequest(Long chatId);

    void sendChatIdConfirmRequest(Long chatId);

    void sendFile(Long chatId, File file);
}
