public class WordUtilit {
    public static String getGroupWord(int count) {
        if (count % 10 == 1 && count % 100 != 11) {
            return "группу";
        } else if (count % 10 >= 2 && count % 10 <= 4 && (count % 100 < 10 || count % 100 >= 20)) {
            return "группы";
        } else {
            return "групп";
        }
    }
}
