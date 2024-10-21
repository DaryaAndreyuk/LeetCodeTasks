package easy.intersectionoftwoarrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = intersect(nums1, nums2);
        printArray(result);

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        int[] result2 = intersect(nums3, nums4);
        printArray(result2);
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        // Используем HashMap для подсчёта количества элементов в первом массиве
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Список для хранения пересечения
        List<Integer> intersection = new ArrayList<>();

        // Проверяем элементы второго массива на наличие в первом
        for (int num : nums2) {
            if (countMap.containsKey(num) && countMap.get(num) > 0) {
                intersection.add(num);
                countMap.put(num, countMap.get(num) - 1);  // Уменьшаем счётчик
            }
        }

        // Преобразуем список в массив
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        return result;
    }
}

