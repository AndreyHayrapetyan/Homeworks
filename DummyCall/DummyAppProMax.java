package DummyCall;

public class DummyAppProMax extends DummyAppPro {
    private boolean screenSharingEnabled;

    public DummyAppProMax(String participant1, String participant2, boolean isVideoEnabled) {
        super(participant1, participant2, isVideoEnabled);
        this.screenSharingEnabled = false;
    }

    public void enableScreenSharing() {
        if (isActive()) {
            screenSharingEnabled = true;
        }
    }

    public void disableScreenSharing() {
        if (isActive()) {
            screenSharingEnabled = false;
        }
    }

    public boolean isScreenSharingEnabled() {
        return screenSharingEnabled;
    }
}

