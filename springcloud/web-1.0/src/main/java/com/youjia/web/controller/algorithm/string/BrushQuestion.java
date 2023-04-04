package com.youjia.web.controller.algorithm.string;

import org.apache.kafka.common.protocol.types.Field;

import javax.sound.midi.Soundbank;
import java.util.*;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className BrushQuestion
 * @date 2023/3/23 10:20
 */
public class BrushQuestion {

    static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            ListNode header = new ListNode(-1, null);
//            for(int i = 0; i < n; i++) {
//                int m = sc.nextInt();
//                header.next = new ListNode(m, header.next);
//            }
//            int target = sc.nextInt();
//            for (int i = 0; i < target; i++) {
//                header = header.next;
//            }
//            System.out.println(header.val);
//        }

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int count = 0;
//        for(int i = 1; i <= n; i++) {
//            int sum = 0;
//            for(int j = 1; j < i; j++) {
//                if(i % j == 0) {
//                    sum += j;
//                }
//            }
//            if(sum == i) {
//                count++;
//            }
//
//        }
//        System.out.println(count);

        //放苹果分为两种情况，一种是有盘子为空，一种是每个盘子上都有苹果。
        //令(m,n)表示将m个苹果放入n个盘子中的摆放方法总数。
        //1.假设有一个盘子为空，则(m,n)问题转化为将m个苹果放在n-1个盘子上，即求得(m,n-1)即可
        //2.假设所有盘子都装有苹果，则每个盘子上至少有一个苹果，即最多剩下m-n个苹果，问题转化为将m-n个苹果放到n个盘子上
        //即求(m-n，n)

//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//
//        int c = get(m, n);
//        System.out.println(c);

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String[] arr = new String[n];
//        for(int i = 0; i < n; i++) {
//            arr[i] = sc.next();
//        }
//        String str = sc.next();
//        int k = sc.nextInt();
//        Arrays.sort(arr);
//        int count = 0;
//        String s1 = null;
//        for(String s: arr) {
//            if(compare(str, s)) {
//                count++;
//                if(count == k) {
//                    s1 = s;
//                }
//            }
//        }
//        System.out.println(count);
//        if(count>=k){
//            System.out.println(s1);
//        }

//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            String str = sc.next();
//            String en = sc.next();
//            char[] chars = new char[str.length()];
//            for(int i = 0; i < str.length(); i++) {
//                if(str.charAt(i) == 'Z') {
//                    chars[i] = 'a';
//                } else if(str.charAt(i) == 'z') {
//                    chars[i] = 'A';
//                } else if(str.charAt(i) == '9') {
//                    chars[i] = '0';
//                }
//                else if(str.charAt(i) >= 'a' && str.charAt(i) < 'z') {
//                    chars[i] = (char) (str.charAt(i) + 1 - 32);
//                } else if(str.charAt(i) >= 'A' && str.charAt(i) < 'Z') {
//                    chars[i] = (char) (str.charAt(i) + 1 + 32);
//                } else if(str.charAt(i) >= '0' && str.charAt(i) < '9') {
//                    chars[i] = (char) (str.charAt(i) + 1);
//                } else {
//                    chars[i] = str.charAt(i);
//                }
//            }
//            System.out.println(chars);
//            chars = new char[en.length()];
//            for(int i = 0; i < en.length(); i++) {
//                if(en.charAt(i) == 'a') {
//                    chars[i] = 'Z';
//                } else if(en.charAt(i) == 'A') {
//                    chars[i] = 'z';
//                } else if(en.charAt(i) == '0') {
//                    chars[i] = '9';
//                }
//                else if(en.charAt(i) > 'a' && en.charAt(i) <= 'z') {
//                    chars[i] = (char) (en.charAt(i) - 1 - 32);
//                } else if(en.charAt(i) > 'A' && en.charAt(i) <= 'Z') {
//                    chars[i] = (char) (en.charAt(i) - 1 + 32);
//                } else if(en.charAt(i) > '0' && en.charAt(i) <= '9') {
//                    chars[i] = (char) (en.charAt(i) - 1);
//                } else {
//                    chars[i] = en.charAt(i);
//                }
//            }
//            System.out.println(chars);
//
//        }
// 超时
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            String str = sc.next();
//            int max = 0;
//            for(int i = 0; i < str.length(); i++) {
//                for(int j = str.length(); j > i; j--) {
//                    String s = str.substring(i, j);
//                    if(s.equals(new StringBuilder(s).reverse().toString())) {
//                        max = Math.max(max, s.length());
//                        break;
//                    }
//                }
//            }
//            System.out.println(max);
//        }
//
//        Scanner sc = new Scanner(System.in);
//        String in = sc.next();
//        System.out.println(getlongstr(in));


//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//
//            String line = sc.nextLine();
//            String[] ss = line.split("[^0-9]+");
//            int max  = 0;
//            ArrayList<String> list = new ArrayList<>();
//            for(String s : ss){
//                if(s.length() > max){
//                    max = s.length();
//                    list.clear();
//                    list.add(s);
//                }else if(s.length() == max){
//                    list.add(s);
//                }
//            }
//            StringBuilder sb = new StringBuilder();
//            for(String item : list){
//                sb.append(item);
//            }
//            sb.append(",").append(max);
//            System.out.println(sb.toString());

//            String in = sc.next();
//            String[] ss = in.split("[^0-9]+");
//            System.out.println(Arrays.toString(ss));
//            StringBuilder builder = new StringBuilder();
//            boolean flag = false;
//            int count = 0, max = 0;
//            List<String> list = new ArrayList<>();
//            for(int i = 0; i < in.length(); i++) {
//                if(in.charAt(i) >= '0' && in.charAt(i) <= '9') {
//                    flag = true;
//                    count++;
//                    builder.append(in.charAt(i));
//                    if(i == in.length() - 1) {
//                        list.add(builder.toString());
//                        max = Math.max(count, max);
//                    }
//                } else {
//                    if(flag) {
//                        list.add(builder.toString());
//                        max = Math.max(count, max);
//                        count = 0;
//                        builder = new StringBuilder();
//                    }
//                    flag = false;
//                }
//            }
//            for(String s: list) {
//                if(s.length() == max) {
//                    System.out.print(s);
//                }
//            }
//            System.out.println(","+max);
//        }


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[] a = {1,2,3,4,5,6};
//        for(int i = 0 ; i < m; i++) {
//            int last = a[n-1];
//            for(int j = 0; j < n; j++) {
//                int tmp = a[j];
//                a[j] = last;
//                last = tmp;
//            }
//        }
//        System.out.println(Arrays.toString(a));

//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            List<Integer> ls = new ArrayList<>();
//            int m1 = sc.nextInt();
//            for(int i = 0; i < m1; i++) {
//                int n = sc.nextInt();
//                if(!ls.contains(n)) {
//                    ls.add(n);
//                }
//            }
//
//            int m2 = sc.nextInt();
//            for(int i = 0; i < m2; i++) {
//                int m = sc.nextInt();
//                if(!ls.contains(m)) {
//                    ls.add(m);
//                }
//            }
//
//            Collections.sort(ls);
//            for(int i = 0; i < ls.size(); i++) {
//                System.out.print(ls.get(i));
//            }
//        }

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        String bin = Integer.toBinaryString(a);
////        int max = 0, sum = 0;
////        for(int i = 0; i < bin.length(); i++) {
////            if(bin.charAt(i) == '1') {
////                sum++;
////                if(i == bin.length() - 1) {
////                    max = Math.max(max, sum);
////                }
////            } else {
////                max = Math.max(max, sum);
////                sum = 0;
////            }
////        }
////        System.out.println(max);
//        String[] strings = bin.split("0+");
//        int max = 0;
//        for(String s: strings) {
//            max = Math.max(max, s.length());
//        }
//        System.out.println(max);

//        Scanner sc = new Scanner(System.in);
//        float count1 = 0;
//        int count2 = 0;
//        float sum = 0;
//        while (sc.hasNextInt()){
//            int cur = sc.nextInt();
//            if (cur >= 0){
//                count1++;
//                sum += cur;
//            }else{
//                count2++;
//            }
//        }
//        System.out.println(count2);
//        if(sum == 0) {
//            System.out.print("0.0\n");
//        } else {
//            System.out.printf("%.1f\n", sum/count1);
//        }

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        List<Integer> ls = new ArrayList<>();
//        for (int i = 2; i < n; i++) {
//            int temp = -1;
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) {
//                    temp = 1;
//                    break;
//                }
//            }
//            if (temp == -1) {
//                ls.add(i);
//            }
//        }
//        int min = n;
//        int k = 0, v = 0;
//        for(int i = 0; i < ls.size(); i++) {
//            for(int j = i; j < ls.size(); j++) {
//                if(ls.get(i) + ls.get(j) == n) {
//                    if(ls.get(j)-ls.get(i) < min) {
//                        min = ls.get(j)-ls.get(i);
//                        k = i;
//                        v = j;
//                    }
//                }
//            }
//        }
//        System.out.print(ls.get(k) + "\n" + ls.get(v));

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = {2, 3, 2 ,4};
//        if (n < 3) {
//            System.out.println(-1);
//        }
//        else {
//            System.out.println(arr[(n - 3) % 4]);
//        }

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        Map<String, Integer> map = new LinkedHashMap<>();
//        for(int i = 0; i < n; i++) {
//            String name = sc.next();
//            map.put(name, 0);
//        }
//        map.put("Invalid", 0);
//        int m = sc.nextInt();
//        for(int i = 0; i < m; i++) {
//            String s = sc.next();
//            if(map.containsKey(s)) {
//                map.put(s, map.get(s)+1);
//            } else {
//                map.put("Invalid", map.get("Invalid")+1);
//            }
//        }
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() +" : " + entry.getValue());
//        }

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        Set<Integer> set = new HashSet<>();
//        for(int i = 0; i < n; i++) {
//            int a = sc.nextInt();
//            set.add(a);
//        }
//        Object[] arr = set.toArray();
//        Arrays.sort(arr);
//        for (Object integer : arr) {
//            System.out.println(integer);
//        }

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        StringBuilder s = new StringBuilder().append(str1).append(str2);
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            if(i % 2 == 0) {
                l1.add(String.valueOf(s.charAt(i)));
            } else {
                l2.add(String.valueOf(s.charAt(i)));
            }
        }
        Collections.sort(l1);
        Collections.sort(l2);
        StringBuilder s1 = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(i % 2 == 0) {
                s1.append(l1.get(i/2));
            } else {
                s1.append(l2.get(i/2));
            }
        }


        for (int i = 0; i < s1.length(); i++) {
            String s2 = s1.substring(i, i+1);
            if(s2.matches("[0-9a-fA-F]")){
                StringBuilder binary = new StringBuilder(Integer.toBinaryString(Integer.parseInt(s2, 16)));
                int len = binary.length();
                for (int j = 0; j < 4-len ; j++) {
                    binary.insert(0, "0");
                }
                binary.reverse();
                int n = Integer.parseInt(binary.toString(), 2);
                String hexString = Integer.toHexString(n).toUpperCase();
                s1.replace(i, i+1, hexString);
            }
        }
        System.out.println(s1);

    }

    public static String getlongstr(String s) {
        int res = 0;
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++) {
            // ABA
            int len1 = longest(s, i, i);
            // ABBA
            int len2 = longest(s, i, i+1);
//            res = Math.max(res, Math.max(len1, len2));
            res = Math.max(len1, len2);

            if (res > end - start) {
                start = i - (res - 1) / 2;
                end = i + res / 2;
            }

        }
//        return res;
        return s.substring(start, end+1);
    }

    private static int longest(String s, int l, int r) {
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }


    public static boolean compare(String s1, String s2) {
        if(s1.length() != s2.length() || s1.equals(s2)) {
            return false;
        }
        char[] sc1 = s1.toCharArray();
        char[] sc2 = s2.toCharArray();
        Arrays.sort(sc1);
        Arrays.sort(sc2);
        for(int i = 0; i < s1.length(); i++) {
            if(sc1[i] != sc2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int get(int m, int n) {
        if(m == 0 || n == 1) {
            return 1;
        }
        if(m < n) return get(m, m);
        return get(m, n-1) + get(m-n, n);

    }

}
