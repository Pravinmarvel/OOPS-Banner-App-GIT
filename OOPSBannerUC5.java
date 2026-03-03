public class OOPSBannerUC5 {

    public static void main(String[] args) {

        // Inline Array Declaration + Initialization
        String[] banner = {

            String.join("",
                    "  *****   ",
                    "  *****   ",
                    "*******   ",
                    " ******  "),

            String.join("",
                    " *     *  ",
                    " *     *  ",
                    "*      *  ",
                    "*        "),

            String.join("",
                    "*       * ",
                    "*       * ",
                    "*      *  ",
                    "*        "),

            String.join("",
                    "*       * ",
                    "*       * ",
                    "*******   ",
                    " ******  "),

            String.join("",
                    "*       * ",
                    "*       * ",
                    "*         ",
                    "       * "),

            String.join("",
                    " *     *  ",
                    " *     *  ",
                    "*         ",
                    "       * "),

            String.join("",
                    "  *****   ",
                    "  *****   ",
                    "*         ",
                    " ******  ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}