package tensor;

public class Tensors {
    /**
     * 24. 전달받은 두 스칼라의 덧셈이 가능하다
     * @param scalar1
     * @param scalar2
     * @return 새로 생성된 두 스칼라의 덧셈 결과
     */
    public static Scalar addScalar(Scalar scalar1, Scalar scalar2) {
        return Scalar.add(scalar1, scalar2);
    }

    /**
     * 25. 전달받은 두 스칼라의 곱셈이 가능하다
     * @param scalar1
     * @param scalar2
     * @return 새로 생성된 두 스칼라의 곱셈 결과
     */
    public static Scalar multiplyScalar(Scalar scalar1, Scalar scalar2) {
        return Scalar.multiply(scalar1, scalar2);
    }

    /**
     * 26. 전달받은 두 벡터의 덧셈이 가능하다 (길이가 같을 때)
     * @param vector1
     * @param vector2
     * @return 새로 생성된 두 벡터의 덧셈 결과
     */
    public static Vector addVector(Vector vector1, Vector vector2) {
        return Vector.add(vector1, vector2);
    }

    /**
     * 27. 전달받은 스칼라와 벡터의 곱셈이 가능하다. (벡터의 모든 요소에 스칼라를 곱한다.)
     * @param vector 곱할 Vector
     * @param scalar 곱할 Scalar
     * @return 새로 생성된 벡터의 곱셈 결과
     */
    public static Vector multiplyVector(Vector vector, Scalar scalar) {
        return Vector.multiply(vector, scalar);
    }

    /**
     * 28. 전달받은 두 행렬의 덧셈이 가능하다 (크기가 같을 때)
     * @param matrix1
     * @param matrix2
     * @return 새로 생성된 두 행렬의 덧셈 결과
     */
    public static Matrix addMatrix(Matrix matrix1, Matrix matrix2) {
        return Matrix.add(matrix1, matrix2);
    }

    /**
     * 29. 전달받은 두 행렬의 곱셈이 가능하다 ((mxn)x(nxl)일 때)
     * @param matrix1
     * @param matrix2
     * @return 새로 생성된 두 행렬의 곱셈 결과
     */
    public static Matrix multiplyMatrix(Matrix matrix1, Matrix matrix2) {
        return Matrix.multiply(matrix1, matrix2);
    }

    /**
     * 32. 행렬은 다른 행렬과 가로로 합쳐질 수 있다. (두 행렬의 행 개수가 같아 가능하다면)
     * @param matrix1 왼쪽 행렬
     * @param matrix2 오른쪽 행렬
     */
    public static Matrix concatCol(Matrix matrix1, Matrix matrix2) {
        return Matrix.concatCol(matrix1, matrix2);
    }

    /**
     * 33. 행렬은 다른 행렬과 세로로 합쳐질 수 있다. (두 행렬의 열 개수가 같아 가능하다면)
     * @param matrix1 위 행렬
     * @param matrix2 아래 행렬
     */
    public static Matrix concatRow(Matrix matrix1, Matrix matrix2) {
        return Matrix.concatRow(matrix1, matrix2);
    }
}
