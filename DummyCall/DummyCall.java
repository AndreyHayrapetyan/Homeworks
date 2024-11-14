package DummyCall;

public class DummyCall {
    private String participant1;
    private String participant2;
    private boolean isActive;
    private long callStart;
    private long callEnd;

    public DummyCall(String participant1, String participant2){
        if(participant1 != null && participant2 != null){
            this.participant1 = participant1;
            this.participant2 = participant2;
            this.isActive = true;
            this.callStart = System.currentTimeMillis();
        } else {
            this.isActive = false;
        }
    }

    public void endCall(){
        if (isActive){
            this.callEnd = System.currentTimeMillis();
            this.isActive = false;
        }
    }

    public long callDuration(){
        if(isActive){
            return 0;
        } else {
            return callEnd - callStart;
        }
    }

    public boolean isActive() {
        return isActive;
    }
}
