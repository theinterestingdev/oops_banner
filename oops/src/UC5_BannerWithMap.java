import java.util.HashMap;

public class UC5_BannerWithMap {

    private static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "   ***   ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "   ***   "
        });

        map.put('P', new String[]{
                "*******  ",
                "**    ** ",
                "**    ** ",
                "*******  ",
                "**       ",
                "**       ",
                "**       "
        });

        map.put('S', new String[]{
                "  ******  ",
                " **       ",
                " **       ",
                "  *****  ",
                "       ** ",
                "       ** ",
                " ******   "
        });

        return map;
    }

    static void displayBanner(String message, HashMap<Character, String[]> map) {

        int height = map.get(message.charAt(0)).length;

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

            for (int j = 0; j < message.length(); j++) {
                line.append(map.get(message.charAt(j))[i]).append(" ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        HashMap<Character, String[]> map = createCharacterMap();
        displayBanner("OOPS", map);
    }
}
