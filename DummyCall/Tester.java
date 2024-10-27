package DummyCall;

public class Tester {
    public static void main(String[] args) {

        DummyCall dummyCall = new DummyCall("Alice", "Bob");
        System.out.println("Call Active: " + dummyCall.isActive());
        dummyCall.endCall();
        System.out.println("Call Active after ending: " + dummyCall.isActive());
        System.out.println("Call Duration (ms): " + dummyCall.callDuration());


        DummyAppPro dummyAppPro = new DummyAppPro("Charlie", "Dana", false);
        System.out.println("Video Enabled: " + dummyAppPro.isVideoEnabled());
        dummyAppPro.enableVideo();
        System.out.println("Video Enabled after enabling: " + dummyAppPro.isVideoEnabled());
        dummyAppPro.disableVideo();
        System.out.println("Video Enabled after disabling: " + dummyAppPro.isVideoEnabled());
        dummyAppPro.endCall();
        System.out.println("Call Active after ending: " + dummyCall.isActive());


        DummyAppProMax dummyAppProMax = new DummyAppProMax("Eve", "Frank", true);
        System.out.println("Screen Sharing Enabled: " + dummyAppProMax.isScreenSharingEnabled());
        dummyAppProMax.enableScreenSharing();
        System.out.println("Screen Sharing Enabled after enabling: " + dummyAppProMax.isScreenSharingEnabled());
        dummyAppProMax.disableScreenSharing();
        System.out.println("Screen Sharing Enabled after disabling: " + dummyAppProMax.isScreenSharingEnabled());
        dummyCall.endCall();
        System.out.println("Call Active after ending: " + dummyCall.isActive());
        System.out.println("Screen Sharing Enabled after call ended: " + dummyAppProMax.isScreenSharingEnabled());
    }
}
