class Solution {
    public String longestPrefix(String s) {

        // s = "level"
        // index =  0 1 2 3 4

        int n = s.length();
        // n = 5

        int[] lps = new int[n];
        // lps = [0, 0, 0, 0, 0]

        int l = 0;
        // l = 0
        // l previous matching prefix ki length rakhega


        for (int i = 1; i < n; i++) {

            // i = 1
            // s[i] = 'e'
            // s[l] = 'l'
            // e != l
            // l = 0 hi rahega
            // lps[1] = 0


            // i = 2
            // s[i] = 'v'
            // s[l] = 'l'
            // v != l
            // lps[2] = 0


            // i = 3
            // s[i] = 'e'
            // s[l] = 'l'
            // e != l
            // lps[3] = 0


            // i = 4
            // s[i] = 'l'
            // s[l] = 'l'
            // l aur i ke characters same hain
            // isliye l++

            while (l > 0 && s.charAt(i) != s.charAt(l)) {
                l = lps[l - 1];
            }

            if (s.charAt(i) == s.charAt(l)) {
                l++;
            }

            lps[i] = l;

            // i = 4
            // l = 1
            // lps = [0,0,0,0,1]
        }

        // lps ka last value = 1
        // matlab longest prefix ki length = 1
        //
        // s = "level"
        // prefix = "l"
        // suffix = "l"

        return s.substring(0, lps[n - 1]);
    }
}