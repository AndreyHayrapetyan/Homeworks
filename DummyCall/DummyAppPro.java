package DummyCall;

public class DummyAppPro extends DummyCall {
    private boolean isVideoEnabled;

    public DummyAppPro(String participant1, String participant2, boolean isVideoEnabled) {
        super(participant1, participant2);
        this.isVideoEnabled = isVideoEnabled && isActive();
    }

    public void enableVideo() {
        if (isActive()) {
            isVideoEnabled = true;
        }
    }

    public void disableVideo() {
        if (isActive()) {
            isVideoEnabled = false;
        }
    }

    public boolean isVideoEnabled() {
        return isVideoEnabled;
    }
}

