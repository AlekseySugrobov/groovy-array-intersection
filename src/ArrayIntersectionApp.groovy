import utils.ArraysWorker

class ArrayIntersectionApp {

    static void main(String[] args) {
        def arr1 = [1, 2, 3, 4, 5, 6, 7, 8, 9]
        def arr2 = [1, 3, 5, 7, 9, 11, 13, 15]
        println(ArraysWorker.unique(arr1, arr2))
    }

}
