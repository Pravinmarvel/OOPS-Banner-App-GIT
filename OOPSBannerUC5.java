public class OOPSBannerUC5 {

    public static void main(String[] args) {

        // Inline Declaration + Initialization
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

        // Enhanced For Loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}