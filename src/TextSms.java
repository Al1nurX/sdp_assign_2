public class TextSms implements Sms {
    private String content;

    public TextSms(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}