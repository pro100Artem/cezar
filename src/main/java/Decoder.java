public class Decoder {

    public void cesarCipherDecoder(int shift, StringBuilder stringForDecode) {
        String cipher = stringForDecode.toString();
        char[] charsForDecoder = cipher.toCharArray();
        String russianAlphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        char[] russianLettersUpperCase = russianAlphabet.toCharArray();
        char[] russianLettersLowerCase = russianAlphabet.toLowerCase().toCharArray();
        for (int i = 0; i < charsForDecoder.length; i++) {
            for (int j = 0; j < russianLettersUpperCase.length; j++) {
                if (charsForDecoder[i] == russianLettersUpperCase[j]) {
                    if (j + shift > russianLettersUpperCase.length) {
                        charsForDecoder[i] = russianLettersUpperCase[(shift - (russianLettersUpperCase.length - j))];
                    } else {
                        charsForDecoder[i] = russianLettersUpperCase[j + shift];
                    }
                    break;
                }
            }
            for (int j = 0; j < russianLettersLowerCase.length; j++) {
                if (charsForDecoder[i] == russianLettersLowerCase[j]) {
                    if (j + shift > (russianLettersLowerCase.length - 1)) {
                        charsForDecoder[i] = russianLettersLowerCase[(shift - (russianLettersLowerCase.length - j))];
                    } else {
                        charsForDecoder[i] = russianLettersLowerCase[j + shift];
                    }
                    break;
                }
            }

        }
        System.out.println(String.valueOf(charsForDecoder));
    }
}
