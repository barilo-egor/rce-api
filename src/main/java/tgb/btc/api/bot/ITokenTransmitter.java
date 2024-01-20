package tgb.btc.api.bot;

public interface ITokenTransmitter {

    void putWebLoginToken(Long chatId, String token);

    void remove(Long chatId);
}
