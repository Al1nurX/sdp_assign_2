public class EncryptedSms extends SmsDecorator {
    public EncryptedSms(Sms decoratedSms) {
        super(decoratedSms);
    }

    @Override
    public String getContent() {
        return encryptContent(super.getContent());
    }

    private String encryptContent(String content) {
        // Encryption logic here
        return "Encrypted[" + content + "]";
    }
}