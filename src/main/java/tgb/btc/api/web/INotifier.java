package tgb.btc.api.web;

import java.io.File;
import java.util.List;

public interface INotifier {

    void notifyNewApiDeal(Long apiDealPid);

    void notifyDealAutoDeleted(Long chatId, Integer messageId);

    void notifyDealDeletedByAdmin(Long chatId);

    void sendNotify(Long chatId, String text);

    void sendLoginRequest(Long chatId);

    void sendChatIdConfirmRequest(Long chatId);

    void sendFile(List<Long> chatId, File file);

    void notifyAdmins(String message);
}
