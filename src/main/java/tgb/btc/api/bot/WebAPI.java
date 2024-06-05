package tgb.btc.api.bot;

public interface WebAPI {

    void submitLogin(Long chatId);

    void logout(Long chatId);

    void submitChatId(Long chatId);
}
