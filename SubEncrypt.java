public class SubEncrypt extends SuperEncrypt1 {

    public SubEncrypt(String message) {
        super(message);
    }
    @Override
    public String encrypt(int offset) {
        StringBuilder encryptedmessage = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            if (Character.isLetter(c)) {
                c = (char)((c - 'a' + offset + 26) % 26 + 'a');
            }
            encryptedmessage.append(c);
        }
        return encryptedmessage.toString();
    }
  @Override
public String decrypt(String encryptedText, int offset) {
    StringBuilder decryptedMessage = new StringBuilder();

    for (int i = 0; i < encryptedText.length(); i++) {
        char c = encryptedText.charAt(i);

        if (Character.isLetter(c)) {
            c = (char)((c - 'a' - offset + 26) % 26 + 'a');
        }

        decryptedMessage.append(c);
    }

    return decryptedMessage.toString();
}
}

