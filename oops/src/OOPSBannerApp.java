public class OOPSBannerApp {
    public static String[] getOPattern()
    {
        return new String[]{
                "   ***   ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "   ***   "
        };
    }

    public static String[] getPPattern()
    {
        return new String[]{
                "*******  ",
                "**    ** ",
                "**    ** ",
                "*******  ",
                "**       ",
                "**       ",
                "**       "
        };
    }

    public static String[] getSPattern()
    {
        return new String[]{
                "  ****** ",
                " **       ",
                " **       ",
                "  *****  ",
                "       ** ",
                "       ** ",
                " ******  "
        };
    }


    public static void main(String[] args) {

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

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        String[] banner = new String[7];

        for(int i = 0;i< oPattern.length;i++)
        {
            banner[i] = String.join("  ",oPattern[i],oPattern[i],pPattern[i],sPattern[i]);
        }

        // Print the banner

        for(String line : banner)
        {
            System.out.println(line);
        }





    }


}
