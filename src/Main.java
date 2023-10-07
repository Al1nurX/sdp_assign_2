public class Main {
    public static void main(String[] args) {

        Sms sms = new TextSms("Hello from Decorator pattern!");
        sms = new EncryptedSms(sms);
        sms = new CompressedSms(sms);

        System.out.println(sms.getContent());
    }
}
