package excellent;

/*
KMP字符串匹配算法
时间复杂度 O(n + m)
 */
public class KMP {
    public static void main(String[] args) {
        String par = "BBCABCDABABCDABCDABDE"; // 主串
        String sub = "ABCDABD"; // 模式串
        char[] pars = par.toCharArray();
        char[] subs = sub.toCharArray();
        KMP kmp = new KMP();
        kmp.KMPMatch(pars, subs);
    }

    private int[] next(char[] cArray) {
        int[] next = new int[cArray.length];
        next[0] = -1;
        int k = -1;
        int j = 0;
        while (j < cArray.length - 1) {
            if (k == -1 || cArray[j] == cArray[k]) {
                k++;
                j++;
                next[j] = k;
            } else {
                k = next[k];
            }
        }
        return next;
    }

    private int KMPMatch(char[] s, char[] t) {
        int[] next = next(t);
        int i = 0;
        int j = 0;
        while (i <= s.length - 1 && j <= t.length - 1) {
            if (j == -1 || s[i] == t[j]) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j < t.length) {
            return -1;
        } else
            return i - t.length; // 返回模式串在主串中的头下标
    }
}
