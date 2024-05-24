package tgb.btc.api.web;

import tgb.btc.api.web.constants.EmitterMessageType;

public interface IEmitterAPI {

    void message(EmitterMessageType type);
}
