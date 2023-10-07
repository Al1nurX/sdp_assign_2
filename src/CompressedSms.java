public class CompressedSms extends SmsDecorator {
    public CompressedSms(Sms decoratedSms) {
        super(decoratedSms);
    }

    @Override
    public String getContent() {
        return compressContent(super.getContent());
    }

    private String compressContent(String content) {
        // Compression logic here
        return "Compressed[" + content + "]";
    }
}