public class UC2_BannerBasic {

    public static void main(String[] args) {

        String[] O = {
                "   ***   ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "   ***   "
        };

        String[] P = {
                "*******  ",
                "**    ** ",
                "**    ** ",
                "*******  ",
                "**       ",
                "**       ",
                "**       "
        };

        String[] S = {
                "  ******  ",
                " **       ",
                " **       ",
                "  *****  ",
                "       ** ",
                "       ** ",
                " ******   "
        };

        for (int i = 0; i < 7; i++) {
            System.out.println(
                    O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]
            );
        }
    }
}
