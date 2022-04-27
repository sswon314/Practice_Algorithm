package String_Algorithm;

import java.util.*;

public class 문자열정렬 {
    public static String[] stringSort(String[] strings) {

        // Comparator 클래스를 사용해서 정렬하는 기준을 만들 수 있다
        Arrays.sort(strings, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                // o1과 o2을 바꿀지 말지에 대한 기준을 여기다 쓰면 됨
                // 여기서는 문자열의 길이에 따라 오름차순으로 정렬

                // 앞에 값(o1)과 뒤의 값(o2)을 비교해서 리턴값을 양수로 주면 값을 바꿈 -> 오름차순
                if (o1.length() > o2.length())
                    return 1;
                    // 앞에 값(o1)과 뒤의 값(o2)을 비교해서 리턴값을 음수로 주면 값을 바꾸지 않음 -> 내림차순
                else
                    return -1;

                // o1.compareTo(o2)는 o1이 사전적으로 앞이면 음수 뒤면 양수 (오름차순 정렬에 쓰임)
            }
        });

        return strings;
    }
}