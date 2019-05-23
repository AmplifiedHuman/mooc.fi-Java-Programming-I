public class StringUtils {
    public static boolean included(String word, String searched) {
        word = word.trim().toLowerCase();
        searched = searched.trim().toLowerCase();
        return word.contains(searched);
    }
}