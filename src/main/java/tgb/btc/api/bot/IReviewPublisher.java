package tgb.btc.api.bot;

public interface IReviewPublisher {

    void updateInterval(Integer minutes);

    Integer getPublishInterval();
}
