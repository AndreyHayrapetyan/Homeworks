package Shopping;

public class GiftLimitExceededException extends RuntimeException {
    public GiftLimitExceededException(String message) {
        super(message);
    }
}
