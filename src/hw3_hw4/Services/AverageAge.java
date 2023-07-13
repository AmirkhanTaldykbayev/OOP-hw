package hw3_hw4.Services;

import hw3_hw4.StudentDomen.User;

import java.util.List;

public class AverageAge {

    /**
     * Статический метод для подсчета среднего возраста
     * @param arr Входящий список*/
    public static <T extends User> double meanAge(List<T> arr){
        double res = 0.0;
        for (int i = 0; i < arr.size(); i++) {
            res = res + arr.get(i).getAge();
        }
        return res / arr.size();
    }
}
