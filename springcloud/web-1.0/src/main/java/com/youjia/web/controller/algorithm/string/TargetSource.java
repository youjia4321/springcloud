package com.youjia.web.controller.algorithm.string;

import com.sun.xml.internal.bind.v2.TODO;
import org.apache.logging.log4j.util.Strings;

import java.util.*;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className TargetSource
 * @date 2023/3/15 11:37
 */
public class TargetSource {


    public static void main(String[] args) {

        // 1
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextLine()) {
//            String target = sc.nextLine();
//            String[] str = target.split(" ");
//            System.out.println(str[str.length-1].length());
//        }

        // 2
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextLine()) {
//            String or = sc.nextLine().toLowerCase();
//            String des = sc.nextLine().toLowerCase();
//            int count = 0;
//            for(int i = 0; i < or.length(); i++) {
//                if(or.charAt(i) == des.charAt(0)) {
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }

//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextLine()) { // 注意 while 处理多个 case
//            String a = in.nextLine();
//            dfs(a);
//        }
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextLine()) {
//            String target = in.nextLine();
//            String base = "0123456789ABCDEF";
//            String[] targets = target.split("");
//            String[] bases = base.split("");
//            int result = 0;
//            for(int i = 0; i < targets.length; i ++){
//                for(int j = 0; j < bases.length; j ++){
//                    if(targets[i].equals(bases[j])){
//                        result = result << 4 | j;
//                    }
//                }
//            }
//            System.out.println(result);
//        }
//
//            Scanner sc = new Scanner(System.in);
//            while (sc.hasNextLine()){
//                String line = sc.nextLine().substring(2);
//                System.out.println(Integer.parseInt(line,16));
//            }


//        Scanner sc = new Scanner(System.in);
//        long num = Long.parseLong(sc.next());
//        long k = (long) Math.sqrt(num);
//        for (int i = 2; i <= k; ++i) {
//            while (num != i) {
//                if (num % i == 0){
//                    System.out.print(i + " ");
//                    num = num/i;
//                } else {
//                    break;
//                }
//            }
//        }
//        System.out.println(num);

//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextInt()) {
//            int s = sc.nextInt();
//            if(s == 0) {
//                return;
//            }
//            if(s < 3) {
//                System.out.println(0);
//            }
//            System.out.println(s/2);
//        }

//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String result = "";
//        for(int i = str.length(); i > 0 ; i--) {
//            if(!result.contains(str.substring(i-1, i))) {
//                result += str.substring(i-1, i);
//            }
//        }
//        System.out.println(result.length());

//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        // 记录字符上一次出现的位置
//        int[] last = new int[128];
//        for(int i = 0; i < 128; i++) {
//            last[i] = -1;
//        }
//        int n = s.length();
//
//        int res = 0;
//        int start = 0; // 窗口开始位置
//        for(int i = 0; i < n; i++) {
//            int index = s.charAt(i);
//            start = Math.max(start, last[index] + 1);
//            res = Math.max(res, i - start + 1);
//            last[index] = i;
//        }
//
//        System.out.println(res);

//        Scanner scanner = new Scanner(System.in);
//        int tableSize = scanner.nextInt();
//        Map<Integer, Integer> table = new HashMap<>(tableSize);
//        for (int i = 0; i < tableSize; i++) {
//            int key = scanner.nextInt();
//            int value = scanner.nextInt();
//            if (table.containsKey(key)) {
//                table.put(key, table.get(key) + value);
//            } else {
//                table.put(key, value);
//            }
//        }
//        for (Integer key : table.keySet()) {
//            System.out.println( key + " " + table.get(key));
//        }


//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        Set<Character> strings = new HashSet<>();
//        for(int i = 0 ; i < str.length(); i++) {
//            strings.add(str.charAt(i));
//        }
//        System.out.println(strings.size());

//        Scanner scanner = new Scanner(System.in);
//        int str = scanner.nextInt();
//
//        String ss = String.valueOf(str);
//        String res = "";
//        for(int i = ss.length(); i > 0; i--) {
//            res += ss.substring(i-1, i);
//        }
//        System.out.println(res);

//        Scanner in = new Scanner(System.in);
//        String word = in.nextLine();
//
//        String[] words = word.split(" ");
//        for(int i = words.length; i > 0; i--) {
//            System.out.print(words[i-1] + " ");
//        }


//        Scanner scanner = new Scanner(System.in);
//        int tableSize = scanner.nextInt();
//        String [] arr = new String[tableSize];
//        for (int i = 0; i < tableSize; i++) {
//            String key = scanner.next();
//            arr[i] = key;
//        }
//        Arrays.sort(arr);
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        String num = Integer.toBinaryString(n);
//        int originLen = num.length();
//        String re = num.replaceAll("1", "");
//        System.out.println(originLen - re.length());

//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//
//        char[] chars = str.toCharArray();
//        StringBuffer buffer = new StringBuffer();
//        for(char c : chars){
//            //如果是正整数则不需要进行加密
//            if(c>='0'&& c<='9'){
//                buffer.append(c);
//            }else if(c>='A'&& c<='Y'){
//                char newChar = (char)(c+33);
//                buffer.append(newChar);
//            }else if(c=='Z'){
//                buffer.append("a");
//            }else{
//                Set<String> keys = map.keySet();
//                for(String k : keys){
//                    if(k.contains(String.valueOf(c)))
//                        buffer.append(map.get(k));
//                }
//            }
//        }
//        System.out.println(buffer.toString());

//        Scanner scanner = new Scanner(System.in);
//        String st = scanner.next();
//        String[] str = st.split("");
//        Map<String, Integer> map = new HashMap<>();
//        for(int i = 0; i < str.length; i++) {
//            if(map.containsKey(str[i])) {
//                map.put(str[i], map.get(str[i]) + 1);
//            } else {
//                map.put(str[i], 1);
//            }
//        }
//        int min = str.length;
//        for (Integer value : map.values()) {
//            if(value < min) {
//                min = value;
//            }
//        }
//        for (String s : map.keySet()) {
//            if(map.get(s) == min) {
//                st = st.replaceAll(s, "");
//            }
//        }
//        System.out.println(st);


//        Scanner scanner = new Scanner(System.in);
//        String st = scanner.nextLine();
//        char[] chars = st.toCharArray();
//        StringBuffer buffer = new StringBuffer();
//        for(int i = 0; i < chars.length; i++) {
//            if(chars[i] >= 'A' && chars[i] <= 'Z' || chars[i] >= 'a' && chars[i] <= 'z') {
//                buffer.append(chars[i]);
//            } else {
//                buffer.append(" ");
//            }
//        }
//        String[] sp = buffer.toString().split(" ");
//        for(int i = sp.length-1; i >= 0; i--) {
//            System.out.print(sp[i] + " ");
//        }


//        Scanner scanner = new Scanner(System.in);
//        String st = scanner.nextLine();
//        char[] chars = st.toCharArray();
//        char tmp;
//        for(int i = 0; i < chars.length; i++) {
//            for(int j = 0; j < chars.length - i - 1; j++) {
//                if(chars[j] > chars[j+1]) {
//                    tmp = chars[j];
//                    chars[j] = chars[j+1];
//                    chars[j+1] = tmp;
//                }
//            }
//        }
//        System.out.println(chars);

//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()) {
//            int num = sc.nextInt();
//            for (int i = 0; i < num; i++) {
//                for (int j = (i + 1); j <= num; j++) {
//                    System.out.print(((j*j + j) / 2) - i + " ");
//                }
//                System.out.println();
//            }
//        }


//        Scanner sc = new Scanner(System.in);
//        int month = sc.nextInt();
//        System.out.println(fs(month));

//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        int s = 0, k = 0, f = 0, r = 0;
//        for(int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
//                s++;
//            }
//
//            else if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
//                k++;
//            }
//
//            else if(str.charAt(i) == ' ') {
//                f++;
//            }
//
//            else {
//                r++;
//            }
//        }
//
//        System.out.println(s + "\n" + f + "\n" + k + "\n" + r);

//        Scanner in = new Scanner(System.in);
//        String str=in.nextLine();
//        int sum = 0;
//        for(int i = 0; i < str.length(); i++){
//            int num = GetCount(str,i,i); //奇数串
//            int num2 = GetCount(str,i,i+1); //偶数串
//            int max = Math.max(num, num2);
//            if(sum < max) sum = max;
//        }
//        System.out.print(sum);

//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        System.out.println(a*b / gcd(a,b));

//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        for(int i = str.length() - 1; i >=0; i--) {
//            System.out.print(str.charAt(i));
//        }
//        System.out.println();

//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        TreeMap<Character, Integer> map = new TreeMap<>();
//
//        for(int i = 0 ; i < str.length(); i++) {
//            if(map.containsKey(str.charAt(i))) {
//                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
//            } else {
//                map.put(str.charAt(i), 1);
//            }
//        }
//
//        int max = 0;
//        for (int val : map.values()) {
//            if(val > max) {
//                max = val;
//            }
//        }
//
//        //输出
//        while (max > 0){
//            for (char key: map.keySet()){
//                if(map.get(key) == max)
//                    System.out.print(key);
//            }
//            max--;
//        }

//        Scanner in = new Scanner(System.in);
//        int i = in.nextInt();
//        System.out.println(add(i));


//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int count = 0;
//        for(int i = 0 ; i <= n; i++) {
//            if(String.valueOf(i*i).endsWith(String.valueOf(i))) {
//                count++;
//            }
//        }
//
//        System.out.println(count);

//
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        String str2 = in.nextLine();
//
//        int len = 0;
//        for(int i = 0; i < str.length(); i++) {
//            if(str2.contains(str.substring(i, i+1))) {
//                len++;
//            }
//        }
//        if(len >= str.length()) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }

//        Scanner in = new Scanner(System.in);
//        int str = in.nextInt();
//        int x, y, z;
//        for(int i = 0; i < 4; i++) {
//            x = 4 * i;
//            y = 25 - 7*i;
//            z = 100 - x - y;
//            System.out.println(x+" "+y+" "+z);
//        }


//        Scanner in=new Scanner(System.in);
//        int y=in.nextInt();
//        int m=in.nextInt();
//        int d=in.nextInt();
//        Calendar c1=Calendar.getInstance();
//        c1.set(y, m-1, d);
//        System.out.println(c1.get(Calendar.DAY_OF_YEAR));


//        Scanner in=new Scanner(System.in);
//        int n = in.nextInt();
//        int start = (n-1) * n + 1;
//        for(int i = 0; i < n; i++) {
//            if(i == n-1) {
//                System.out.println(start);
//            }
//            System.out.print(start + "+");
//            start += 2;
//        }

//        Scanner in=new Scanner(System.in);
//        String str = in.nextLine();
//
//        boolean flag = false;
//        StringBuffer buffer = new StringBuffer();
//        for(int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
//                if(flag) {
//                    if(i == str.length() - 1) {
//                        buffer.append(str.charAt(i)).append("*");
//                    } else {
//                        buffer.append(str.charAt(i));
//                    }
//                } else {
//                    if(i == str.length() - 1) {
//                        buffer.append("*").append(str.charAt(i)).append("*");
//                    } else {
//                        buffer.append("*").append(str.charAt(i));
//                    }
//                    flag = true;
//                }
//            } else {
//                if(flag) {
//                    buffer.append("*").append(str.charAt(i));
//                    flag = false;
//                } else {
//                    buffer.append(str.charAt(i));
//                }
//            }
//        }
//        System.out.println(buffer.toString());
//
//
//        String s = in.nextLine();
//        s = s.replaceAll("(\\d+)","\\*$1\\*");
//        System.out.println(s);

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[][] dp = new int[n+1][m+1];
//        for(int i = 0; i <= n; i++) {
//            for(int j = 0; j <= m; j++) {
//                if(i == 0 && j == 0) {
//                    dp[i][j] = 1;
//                } else if(i == 0) {
//                    dp[i][j] = dp[i][j-1];
//                } else if(j == 0) {
//                    dp[i][j] = dp[i-1][j];
//                } else {
//                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
//                }
//            }
//        }
//        System.out.println(dp[n][m]);


//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        int max = 0;
//        for(int i = 0; i < str.length(); i++) {
//            for(int j = str.length(); j > i; j--) {
//                String s = str.substring(i, j);
//                if(s.equals(new StringBuilder(s).reverse().toString())) {
//                    max = Math.max(max, j - i);
//                }
//            }
//        }
//        System.out.println(max);

//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.next();
//        String str2 = sc.next();
//        Map<Integer, String> map = new HashMap<>();
//        int max = 0;
//        int len1 = str1.length();
//        int len2 = str2.length();
//        String minStr = len1 >= len2? str2: str1;
//        String maxStr = len1 >= len2? str1: str2;
//        for(int i = 0; i < minStr.length(); i++) {
//            for(int j = minStr.length(); j > i; j--) {
//                String s = minStr.substring(i, j);
//                if(maxStr.contains(s)) {
//                    max = Math.max(max, s.length());
//                    if(map.containsKey(max)) {
//                        continue;
//                    }
//                    map.put(max, s);
//                }
//            }
//        }
//        System.out.println(map.get(max));
//
//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.next();
//        String str2 = sc.next();
//        int max = 0;
//        int len1 = str1.length();
//        int len2 = str2.length();
//        String minStr = len1 >= len2? str2: str1;
//        String maxStr = len1 >= len2? str1: str2;
//        for(int i = 0; i < minStr.length(); i++) {
//            for(int j = minStr.length(); j > i; j--) {
//                String s = minStr.substring(i, j);
//                if(maxStr.contains(s)) {
//                    max = Math.max(max, s.length());
//                }
//            }
//        }
//        System.out.println(max);

//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String l = str;
//        Map<Character, Integer> map = new HashMap<>();
//        for(int i = 0 ; i < str.length(); i++) {
//            if(map.containsKey(str.charAt(i))) {
//                l = l.replaceAll(String.valueOf(str.charAt(i)), "");
//            } else {
//                map.put(str.charAt(i), 1);
//            }
//            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
//
//            }
//        }
//        System.out.println(l.length() > 0?l.substring(0, 1): -1);

//        int[] a = {-1};
//        containsNearbyDuplicate(a, 2);
//        System.out.println(findMaxAverage(a, 1));

//        System.out.println(romanToInt("LVIII"));

        System.out.println(letterCombinations("22"));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ls = new ArrayList<>();
        if(nums1.length <= nums2.length) {
            for(int n: nums1) {
                for(int m: nums2) {
                    if(m == n) {
                        if(!ls.contains(n)){
                            ls.add(n);
                        }
                    }
                }
            }
        } else {
            for(int n: nums2) {
                for(int m: nums1) {
                    if(m == n) {
                        if(!ls.contains(n)){
                            ls.add(n);
                        }
                    }
                }
            }
        }
        int[] s = new int[ls.size()];
        for(int i = 0; i < ls.size(); i++){
            s[i] = ls.get(i);
        }
        return s;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n >= 0) System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
        System.out.print(Arrays.toString(nums1));
    }


    public static List<String> letterCombinations(String digits) {
        List<String> ls = new ArrayList<>();
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        if(digits.length() == 0) {
            return ls;
        }

        if(digits.length() == 1) {
            return Arrays.asList(map.get(digits.charAt(0)).split(""));
        }

        for(int i = 0; i < digits.length(); i++) {
            for(int j = i+1; j < digits.length(); j++) {
                for(int k = 0; k < map.get(digits.charAt(i)).length(); k++) {
                    for(int m = 0; m < map.get(digits.charAt(j)).length(); m++) {
                        ls.add(map.get(digits.charAt(i)).charAt(k) +
                                String.valueOf(map.get(digits.charAt(j)).charAt(m)));
                    }
                }

            }
        }
        return ls;
    }


    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            int a = map.get(s.charAt(i));
            if(i < s.length() - 1 && a < map.get(s.charAt(i+1))) {
                sum -= map.get(s.charAt(i));
            } else {
                sum += map.get(s.charAt(i));
            }
        }
        return sum;
    }


    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return s.equals(new StringBuilder(s).reverse().toString());

//        int left = 0;
//        int right = s.length() - 1;
//        while (right > left) {
//            if(s.charAt(left) != s.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
    }


    public int maxSubArray(int[] nums) {
        int sum = 0;
        int res = Integer.MIN_VALUE;
        for(int num: nums) {
            if(sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            res = Math.max(res, sum);
        }
        return res;
    }


    public static double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int avg = 0;
        int maxAvg = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            avg += nums[i];
            if(i - left + 1 == k) {
                maxAvg = Math.max(avg, maxAvg);
                avg -= nums[left++];
            }
        }
        return  (double) maxAvg / k;
    }


    public static boolean containsNearbyDuplicate(int[] nums, int k) {
//        for(int i = 0; i < nums.length; i++) {
//            for(int j = i+1; j < nums.length; j++) {
//                if(nums[i] == nums[j]) {
//                    if(Math.abs(i - j) <= k) {
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;


        Map<Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }


    public int firstUniqChar(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return i;
            }
        }
        return 0;
    }


    // 长度最小的子数组
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                min = Math.min(min, i - left + 1);
                sum -= nums[left++];
            }
        }
        return min;

    }

    // 无重复字符串
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }

    private static int add(int n) {
        if(n == 1) {
            return 2;
        }
        int sum = 2;
        int  count = 0;
        for(int i = 0; i < n; i++) {
            count += sum;
            sum = sum + 3;

        }
        return count;
    }


    private static int gcd(int a, int b) {
        return b==0? a: gcd(b,a%b);
    }


    // 中心扩散法，比较l和r位置的字符是否相同，相同则
    private static int GetCount(String str,int l,int r) {
        int count = 0;
        while(l >= 0 && r < str.length() && str.charAt(l) == str.charAt(r)){
            l--;
            r++;
            count = r-l-1;
        }
        return count;
    }

    public static int fs(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        return fs(n-1)+fs(n-2);
    }

    private static Map<String,String> map = new HashMap<>();
    static{
        map.put("abc","2");
        map.put("def","3");
        map.put("ghi","4");
        map.put("jkl","5");
        map.put("mno","6");
        map.put("pqrs","7");
        map.put("tuv","8");
        map.put("wxyz","9");
    }


    public static void dfs(String str) {
        int l = str.length();
        if (l > 8) {
            System.out.println(str.substring(0, 8));
            dfs(str.substring(8, l));
        } else if(l < 8) {
            StringBuilder strBuilder = new StringBuilder(str);
            while (l != 8) {
                strBuilder.append("0");
                l++;
            }
            str = strBuilder.toString();
            System.out.println(str);
        } else {
            System.out.println(str);
        }
    }

}
