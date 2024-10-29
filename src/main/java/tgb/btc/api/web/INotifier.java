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

    void sendRequestToWithdrawDeal(String from, String requestInitiator, Long dealPid);

    void sendAutoWithdrawDeal(String from, String requestInitiator, Long dealPid);

    void sendRequestToWithdrawApiDeal(Long apiDealPid);

    void sendGreetingToNewDealRequestGroup();

    void sendGreetingToNewAutoWithdrawalGroup();

    void sendGreetingToNewApiDealRequestGroup(Long apiUserPid);

    void sendGoodbyeToNewApiDealRequestGroup(Long chatId, String apiUserId);

    void notifyPoolChanged(Long excludeChatId);
}
