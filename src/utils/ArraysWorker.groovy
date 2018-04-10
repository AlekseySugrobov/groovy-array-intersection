package utils

class ArraysWorker {
    static String unique(List<?> arr1, List<?> arr2){
        if(arr1.size() == 0){
            return "Первый массив пустой"
        }
        if(arr2.size() == 0){
            return "Второй массив пустой"
        }
        return (arr1 + arr2).unique{a, b -> a <=> b}.join(", ")
    }

}
