public abstract class SuperEncrypt1 {
    protected String message;

    public SuperEncrypt1(String message) {
        this.message = message.toLowerCase();
    }
    public abstract String encrypt(int offset);
    public abstract String decrypt(String encryptedText, int offset);
}
