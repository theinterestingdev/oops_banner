public class UC4_BannerWithInnerClass {

    static class CharacterPattern {
        private final char ch;
        private final String[] pattern;

        CharacterPattern(char ch, String[] pattern) {
            this.ch = ch;
            this.pattern = pattern;
        }

        char getChar() {
            return ch;
        }

        String[] getPattern() {
            return pattern;
        }
    }

    private static CharacterPattern[] patterns;

    static void initPatterns() {

        patterns = new CharacterPattern[]{
                new CharacterPattern('O', new String[]{
                        "   ***   ",
                        "**     **",
                        "**     **",
                        "**     **",
                        "**     **",
                        "**     **",
                        "   ***   "
                }),
                new CharacterPattern('P', new String[]{
                        "*******  ",
                        "**    ** ",
                        "**    ** ",
                        "*******  ",
                        "**       ",
                        "**       ",
                        "**       "
                }),
                new CharacterPattern('S', new String[]{
                        "  ******  ",
                        " **       ",
                        " **       ",
                        "  *****  ",
                        "       ** ",
                        "       ** ",
                        " ******   "
                })
        };
    }

    static String[] getPattern(char ch) {
        for (CharacterPattern cp : patterns) {
            if (cp.getChar() == ch) {
                return cp.getPattern();
            }
        }
        return null;
    }

    static void printBanner() {

        String[] O = getPattern('O');
        String[] P = getPattern('P');
        String[] S = getPattern('S');

        for (int i = 0; i < O.length; i++) {
            System.out.println(
                    O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]
            );
        }
    }

    public static void main(String[] args) {
        initPatterns();
        printBanner();
    }
}
