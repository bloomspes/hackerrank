public class Solution {
    public String solution(String new_id) {

        String answer = new NewID(new_id)
                .replaceToLowerCase()
                .filterWithRegex()
                .replaceToSingleDot()
                .neverStartEndDot()
                .ifBlankthenAppend()
                .nolongerThan16()
                .appendLetters()
                .getNewId();

        return answer;
    }

    public static class NewID {
        public String word;

        public NewID(String word) {
            this.word = word;
        }

        public NewID replaceToLowerCase() {
            word = word.toLowerCase();
            return this;
        }

        public NewID filterWithRegex() {
            word = word.replaceAll("[^a-z0-9._-]", "");
            return this;
        }

        public NewID replaceToSingleDot() {
            word = word.replaceAll("[.]{2,}", ".");
            return this;
        }

        public NewID neverStartEndDot() {
            word = word.replaceAll("^[.]|[.]$", "");
            return this;
        }

        public NewID ifBlankthenAppend() {
            word = word.isEmpty() ? "a" : word;
            return this;
        }

        public NewID nolongerThan16() {
            if (word.length() >= 16) {
                word = word.substring(0, 15);
            }
            word = word.replaceAll("^[.]|[.]$", "");
            return this;
        }

        public NewID appendLetters() {
                StringBuilder stringBuilder = new StringBuilder(word);

                while (stringBuilder.length() < 3) {
                    stringBuilder.append(stringBuilder.charAt(stringBuilder.length() - 1));
                }

                word = stringBuilder.toString();

            return this;
        }

        public String getNewId() {
            return word;
        }

    }
}
