package tensor;

public interface Matrix {
    /**
     * 11. 특정 위치의 요소를 지정 조회할 수 있다
     * @param row 요소의 행 위치
     * @param col 요소의 열 위치
     * @return Matrix의 행, 열 위치의 Scalar
     */
    Scalar get(int row, int col);

    /**
     * 11. 특정 위치의 요소를 지정 조회할 수 있다
     * @param row 요소의 행 위치
     * @param col 요소의 열 위치
     * @param value 설정할 Scalar 값
     */
    void set(int row, int col, Scalar scalar);

    /**
     * 13. 크기 정보를 조회할 수 있다
     * @return Matrix의 행 개수
     */
    int rowSize();

    /**
     * 13. 크기 정보를 조회할 수 있다
     * @return Matrix의 열 개수
     */
    int colSize();

    /**
     * 14. 객체를 콘솔에 출력할 수 있다. <br>
     * 14m. 값들을 차원 배열 모양으로
     * @return Matrix의 String으로 포맷된 값
     */
    @Override
    String toString();

    /**
     * 15. 객체의 동등성 판단을 할 수 있다
     * @param object 비교할 객체
     * @return object 객체와 값이 동등한지
     */
    @Override
    boolean equals(Object object);

    /**
     * 17. 객체 복제를 할 수 있다
     * @return 복제된 객체
     */
    Matrix clone();

    /**
     * 22. 행렬은 다른 행렬과 덧셈이 가능하다
     * @param matrix
     */
    void add(Matrix matrix);

    /**
     * 23. 행렬은 다른 행렬과 곱셈이 가능하다. ((mxn)x(nxl)일 때)
     * @param matrix
     */
    void multiply(Matrix matrix);

    /**
     * 32. 행렬은 다른 행렬과 가로로 합쳐질 수 있다. (두 행렬의 행 개수가 같아 가능하다면)
     * @param matrix 합칠 행렬
     */
    void concatCol(Matrix matrix);

    /**
     * 33. 행렬은 다른 행렬과 세로로 합쳐질 수 있다. (두 행렬의 열 개수가 같아 가능하다면)
     * @param matrix 합칠 행렬
     */
    void concatRow(Matrix matrix);

    /**
     * 34. 행렬은 특정 행을 벡터 형태로 추출해 줄 수 있다.
     * @param row 행 위치
     */
    Vector getRow(int row);

    /**
     * 35. 행렬은 특정 열을 벡터 형태로 추출해 줄 수 있다.
     * @param col 열 위치
     */
    Vector getCol(int col);

    /**
     * 36. 행렬은 특정 범위의 부분 행렬을 추출해 줄 수 있다.
     * @param startRow 시작 행 위치
     * @param endRow 끝 행 위치
     * @param startCol 시작 열 위치
     * @param endCol 끝 열 위치
     */
    Matrix extract(int startRow, int endRow, int startCol, int endCol);

    /**
     * 37. 행렬은 특정 범위의 부분 행렬을 추출해 줄 수 있다.
     * @param removeRow 제외할 행 위치
     * @param removeCol 제외할 열 위치
     */
    Matrix extract(int removeRow, int removeCol);

    /**
     * 38. 행렬은 전치행렬을 (새로 생성하여) 구해줄 수 있다.
     */
    Matrix transpose();

    /**
     * 39. 행렬은 대각 요소의 합을 구해줄 수 있다.
     */
    Scalar trace();

    /**
     * 40. 행렬은 자신이 정사각 행렬인지 여부를 판별해 수 있다.
     */
    boolean isSquare();

    /**
     * 41. 행렬은 자신이 상삼각 행렬인지 여부를 판별해 수 있다.
     */
    boolean isUpperTriangular();

    /**
     * 42. 행렬은 자신이 하삼각 행렬인지 여부를 판별해 수 있다.
     */
    boolean isLowerTriangular();

    /**
     * 43. 행렬은 자신이 단위 행렬인지 여부를 판별해 수 있다.
     */
    boolean isIdentity();

    /**
     * 44. 행렬은 자신이 영 행렬인지 여부를 판별해 수 있다.
     */
    boolean isZero();

    /**
     * 45. 행렬은 특정 두 행의 위치를 맞교환할 수 있다
     */
    void interchangeRow(int row1, int row2);

    /**
     * 46. 행렬은 특정 두 열의 위치를 맞교환할 수 있다
     */
    void interchangeCol(int col1, int col2);

    /**
     * 47. 행렬은 특정 행에 상수배 스칼라 를 할 수 있다
     */
    void scaleRow(int row, Scalar scalar);

    /**
     * 48. 행렬은 특정 열에 상수배 스칼라 를 할 수 있다
     */
    void scaleCol(int col, Scalar scalar);

    /**
     * 49. 행렬은 특정 행에 다른 행의 상수배를 더할 수 있다
     */
    void replaceRow(int row1, int row2, Scalar scalar);

    /**
     * 50. 행렬은 특정 열에 다른 열의 상수배를 더할 수 있다
     */
    void replaceCol(int col1, int col2, Scalar scalar);

    /**
     * 51. 행렬은 자신으로부터 RREF 행렬을 구해서 반환해 줄 수 있다
     */
    Matrix getRREF();

    /**
     * 52. 행렬은 자신이 RREF 행렬인지 여부를 판별해 줄 수 있다
     */
    boolean isRREF();

    /**
     * 53. 행렬은 자신의 행렬식을 구해줄 수 있다
     */
    Scalar determinant();

    /**
     * 54. 행렬은 자신의 역행렬을 구해줄 수 있다
     */
    Matrix inverse();

    /**
     * 28. 전달받은 두 행렬의 덧셈이 가능하다 (크기가 같을 때)
     * @param matrix1
     * @param matrix2
     * @return 새로 생성된 두 행렬의 덧셈 결과
     */
    static Matrix add(Matrix matrix1, Matrix matrix2) {
        Matrix newMatrix = matrix1.clone();

        newMatrix.add(matrix2);
        return newMatrix;
    }

    /**
     * 29. 전달받은 두 행렬의 곱셈이 가능하다 ((mxn)x(nxl)일 때)
     * @param matrix1
     * @param matrix2
     * @return 새로 생성된 두 행렬의 곱셈 결과
     */
    static Matrix multiply(Matrix matrix1, Matrix matrix2) {
        Matrix newMatrix = matrix1.clone();

        newMatrix.multiply(matrix2);
        return newMatrix;
    }

    /**
     * 32. 행렬은 다른 행렬과 가로로 합쳐질 수 있다. (두 행렬의 행 개수가 같아 가능하다면)
     * @param matrix1 왼쪽 행렬
     * @param matrix2 오른쪽 행렬
     */
    static Matrix concatCol(Matrix matrix1, Matrix matrix2) {
        Matrix newMatrix = matrix1.clone();

        newMatrix.concatCol(matrix2);
        return newMatrix;
    }

    /**
     * 33. 행렬은 다른 행렬과 세로로 합쳐질 수 있다. (두 행렬의 열 개수가 같아 가능하다면)
     * @param matrix1 위 행렬
     * @param matrix2 아래 행렬
     */
    static Matrix concatRow(Matrix matrix1, Matrix matrix2) {
        Matrix newMatrix = matrix1.clone();

        newMatrix.concatRow(matrix2);
        return newMatrix;
    }
}
