package tensor;

public class Factory {
    /**
     * 1. 값(String)을 지정하여 스칼라를 생성할 수 있다.
     * @param value 스칼라의 값
     * @return value 값을 갖는 새 스칼라 객체
     */
    public static Scalar createScalar(String value) {
        return null;
    }

    /**
     * 2. i 이상 j 미만의 무작위 값을 요소로 하는 스칼라를 생성할 수 있다.
     * @param i
     * @param j
     * @return i 이상 j 미만의 무작위 값을 요소로 하는 새 스칼라 객체
     */
    public static Scalar createScalar(int i, int j) {
        return null;
    }

    /**
     * 3. 지정한 하나의 값을 모든 요소의 값으로 하는 n-차원 벡터를 생성할 수 있다.
     * @param value 벡터의 모든 요소에 할당할 값
     * @param size 벡터의 차원
     * @return 모든 요소가 value 값을 갖는 새 벡터 객체
     */
    public static Vector createVector(String value, int size) {
        return null;
    }

    /**
     * 3. 지정한 하나의 값을 모든 요소의 값으로 하는 n-차원 벡터를 생성할 수 있다.
     * @param value 벡터의 모든 요소에 할당할 값
     * @param size 벡터의 차원
     * @return 모든 요소가 value 값을 갖는 새 벡터 객체
     */
    public static Vector createVector(Scalar value, int size) {
        return null;
    }

    /**
     * 4. i 이상 j 미만의 무작위 값을 요소로 하는 n-차원 벡터를 생성할 수 있다.
     * @param i
     * @param j
     * @param size 벡터의 차원
     * @return i 이상 j 미만의 무작위 값을 요소로 하는 새 벡터 객체
     */
    public static Vector createVector(int i, int j, int size) {
        return null;
    }

    /**
     * 5. 1차원 배열로부터 n-차원 벡터를 생성할 수 있다.
     * @param array 1차원 배열
     * @return 1차원 배열의 요소를 갖는 새 벡터 객체
     */
    public static Vector createVector(String[] array) {
        return null;
    }

    /**
     * 5. 1차원 배열로부터 n-차원 벡터를 생성할 수 있다.
     * @param array 1차원 배열
     * @return 1차원 배열의 요소를 갖는 새 벡터 객체
     */
    public static Vector createVector(Scalar[] array) {
        return null;
    }

    /**
     * 6. 지정한 하나의 값을 모든 요소의 값으로 하는 행렬을 생성할 수 있다
     * @param value 행렬의 모든 요소에 할당할 값
     * @param row 행렬의 행 수
     * @param column 행렬의 열 수
     * @return 모든 요소가 value 값을 갖는 새 행렬 객체
     */
    public static Matrix createMatrix(String value, int row, int column) {
        return null;
    }

    /**
     * 6. 지정한 하나의 값을 모든 요소의 값으로 하는 행렬을 생성할 수 있다
     * @param value 행렬의 모든 요소에 할당할 값
     * @param row 행렬의 행 수
     * @param column 행렬의 열 수
     * @return 모든 요소가 value 값을 갖는 새 행렬 객체
     */
    public static Matrix createMatrix(Scalar value, int row, int column) {
        return null;
    }

    /**
     * 7. i 이상 j 미만의 무작위 값을 요소로 하는 행렬을 생성할 수 있다.
     * @param i
     * @param j
     * @param row 행렬의 행 수
     * @param column 행렬의 열 수
     * @return i 이상 j 미만의 무작위 값을 요소로 하는 새 행렬 객체
     */
    public static Matrix createMatrix(int i, int j, int row, int column) {
        return null;
    }

    /**
     * 8. csv 파일로부터 m x n 행렬을 생성할 수 있다.
     * @param filePath csv 파일의 경로
     * @return 2차원 배열의 요소를 갖는 새 행렬 객체
     */
    public static Matrix createMatrix(String filePath) {
        return null;
    }

    /**
     * 9. 2차원 배열로부터 행렬을 생성할 수 있다
     * @param array 2차원 배열
     * @return 2차원 배열의 요소를 갖는 새 행렬 객체
     */
    public static Matrix createMatrix(String[][] array) {
        return null;
    }

    /**
     * 9. 2차원 배열로부터 행렬을 생성할 수 있다
     * @param array 2차원 배열
     * @return 2차원 배열의 요소를 갖는 새 행렬 객체
     */
    public static Matrix createMatrix(Scalar[][] array) {
        return null;
    }

    /**
     * 10. 단위 행렬을 생성할 수 있다.
     * @param size 단위 행렬의 크기
     * @return size x size 크기의 단위 행렬 객체
     */
    public static Matrix createMatrix(int size) {
        return null;
    }
}
