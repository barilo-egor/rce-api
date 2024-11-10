package tgb.btc.api.bot;

import java.util.List;

public interface ReviewAPI {

    void publishReview(Long pid);

    void publishReview(List<Long> pid);
}
