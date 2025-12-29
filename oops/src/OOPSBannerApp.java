public class OOPSBannerApp {

    /**
     * Character Pattern Map - Inner class for storing character to pattern mappings
     */

    static class CharacterPatternMap{
        /**
         * Character Representation
         */
        private final char character;

        /**
        Pattern for printing the characters
         */
        private final String[] pattern;

        // Constructor

        public CharacterPatternMap(char character,String[] pattern)
        {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for Character
        public char getCharacter(){
            return character;
        }
        public String[] getPattern()
        {
            return pattern;
        }
    }

    // Class Variable

    private static CharacterPatternMap[] patterns;

    // Pattern Initialization

    static void patternInit()
    {
        patterns = new CharacterPatternMap[]{
                new CharacterPatternMap('O',new String[]{
                        "   ***   ",
                        "**     **",
                        "**     **",
                        "**     **",
                        "**     **",
                        "**     **",
                        "   ***   "
                }),
                new CharacterPatternMap('P',new String[]{
                        "*******  ",
                        "**    ** ",
                        "**    ** ",
                        "*******  ",
                        "**       ",
                        "**       ",
                        "**       "
                }),
                new CharacterPatternMap('S',new String[]{
                        "  ******  ",
                        " **       ",
                        " **       ",
                         "  *****  ",
                        "       ** ",
                        "       ** ",
                        " ******   "
                }),

        };
    }

    // Getting the pattern

    static String[] getPattern(char ch)
    {
        for(CharacterPatternMap cpm : patterns)
        {
            if(cpm.getCharacter() == ch)
            {
                return cpm.getPattern();
            }
        }

        return null;
    }

    // Print the banner

    static void printBanner()
    {
        String[] oPattern = getPattern('O');
        String[] pPattern = getPattern('P');
        String[] sPattern = getPattern('S');

        String[] banner = new String[7];

        for(int i = 0;i< oPattern.length;i++)
        {
            banner[i] = String.join("  ",oPattern[i],oPattern[i],pPattern[i],sPattern[i]);
        }

        for(String line : banner)
        {
            System.out.println(line);
        }

    }





//    public static String[] getOPattern()
//    {
//        return new String[]{
//                "   ***   ",
//                "**     **",
//                "**     **",
//                "**     **",
//                "**     **",
//                "**     **",
//                "   ***   "
//        };
//    }
//
//    public static String[] getPPattern()
//    {
//        return new String[]{
//                "*******  ",
//                "**    ** ",
//                "**    ** ",
//                "*******  ",
//                "**       ",
//                "**       ",
//                "**       "
//        };
//    }
//
//    public static String[] getSPattern()
//    {
//        return new String[]{
//                "  ****** ",
//                " **       ",
//                " **       ",
//                "  *****  ",
//                "       ** ",
//                "       ** ",
//                " ******  "
//        };
//    }


    public static void main(String[] args) {

        // calling the methods

        patternInit();
        printBanner();

        // Display the literal text "OOPS"

        // System.out.println("OOPS");


        // Render OOPS as Banner (spaces and *)

//        String[] O = {
//                "   ***   ",
//                "**     **",
//                "**     **",
//                "**     **",
//                "**     **",
//                "**     **",
//                "   ***   "
//        };
//
//        String[] P = {
//                "*******  ",
//                "**    ** ",
//                "**    ** ",
//                "*******  ",
//                "**       ",
//                "**       ",
//                "**       "
//        };
//
//
//        String[] S = {
//                "  ****** ",
//                " **       ",
//                " **       ",
//                "  *****  ",
//                "       ** ",
//                "       ** ",
//                " ******  "
//        };
//
//
//
//        String[] banner = new String[7];
//
//        for (int i = 0; i < 7; i++) {
//            banner[i] = String.join("   ", O[i], O[i], P[i], S[i]);
//        }
//
//        for (String line : banner) {
//            System.out.println(line);
//        }

        // Improving modularity and printing into reusable functions

//        String[] oPattern = getOPattern();
//        String[] pPattern = getPPattern();
//        String[] sPattern = getSPattern();
//
//        String[] banner = new String[7];
//
//        for(int i = 0;i< oPattern.length;i++)
//        {
//            banner[i] = String.join("  ",oPattern[i],oPattern[i],pPattern[i],sPattern[i]);
//        }

        // Print the banner
//
//        for(String line : banner)
//        {
//            System.out.println(line);
//        }

    }


}
