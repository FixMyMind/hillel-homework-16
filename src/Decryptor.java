public class Decryptor {
    public String decryptMessage(String encryptedMessage, String key) {
        int keyToInt = 0;
        String decryptedMessageToConsole = "";
        char[] stringKeyToCharArray = key.toCharArray();
        for (int i = 0; i < stringKeyToCharArray.length; i++) {
            keyToInt += stringKeyToCharArray[i];
        }
        char[] stringMessageToCharArray = encryptedMessage.toCharArray();
        char[] arrayOfDecryptedChars = new char[encryptedMessage.length()];
        for (int iMessage = 0; iMessage < encryptedMessage.length(); iMessage++) {
            arrayOfDecryptedChars[iMessage] = (char) (stringMessageToCharArray[iMessage] ^ keyToInt);
            decryptedMessageToConsole += arrayOfDecryptedChars[iMessage];
        }
        System.out.println(decryptedMessageToConsole);
        return decryptedMessageToConsole;
    }
}
