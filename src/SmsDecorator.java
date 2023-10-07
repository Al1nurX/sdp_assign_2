public abstract class SmsDecorator implements Sms {
    protected Sms decoratedSms;

    public SmsDecorator(Sms decoratedSms) {
        this.decoratedSms = decoratedSms;
    }

    @Override
    public String getContent() {
        return decoratedSms.getContent();
    }
}
