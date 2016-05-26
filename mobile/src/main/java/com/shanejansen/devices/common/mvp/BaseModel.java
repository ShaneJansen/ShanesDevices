package com.shanejansen.devices.common.mvp;

/**
 * Created by Shane Jansen on 5/24/16.
 */
public abstract class BaseModel implements BaseMvp.ModelForPresenterOps {
    @Override
    public void unbindPresenter(boolean isConfigurationChange) {
        // TODO
    }

    public interface Callback {
        void loadSuccess();
        void loadFailure(String message);
    }
}
