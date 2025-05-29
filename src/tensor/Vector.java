package tensor;

public interface Vector {
    /**
     * 11. 특정 위치의 요소를 지정 조회할 수 있다
     * @param index 요소의 위치
     * @return Vector의 index 위치의 Scalar
     */
    Scalar get(int index);

    /**
     * 11. 특정 위치의 요소를 지정 조회할 수 있다
     * @param index 요소의 위치
     * @param scalar 설정할 Scalar 값
     */
    void set(int index, Scalar scalar);

    /**
     * 13. 크기 정보를 조회할 수 있다
     * @return Vector의 차원
     */
    int size();

    /**
     * 14. 객체를 콘솔에 출력할 수 있다. <br>
     * 14v. 벡터 값들을 차원 배열 모양으로
     * @return Vector의 String으로 포맷된 값
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
    Vector clone();

    /**
     * 20. 벡터는 다른 벡터와 덧셈이 가능하다
     * @param vector 더할 Vector
     */
    void add(Vector vector);

    /**
     * 21. 벡터는 다른 스칼라와 곱셈이 가능하다
     * @param scalar 곱할 Scalar
     */
    void multiply(Scalar scalar);

    /**
     * 30. n-차원 벡터 객체는 자신으로부터 nx1 행렬을 생성할 수 있다
     */
    Matrix toColMatrix();

    /**
     * 31. n-차원 벡터 객체는 자신으로부터 1xn 행렬을 생성할 수 있다
     */
    Matrix toRowMatrix();

    /**
     * 26. 전달받은 두 벡터의 덧셈이 가능하다 (길이가 같을 때)
     * @param vector1
     * @param vector2
     * @return 새로 생성된 두 벡터의 덧셈 결과
     */
    static Vector add(Vector vector1, Vector vector2) {
        Vector newVector = vector1.clone();

        newVector.add(vector2);
        return newVector;
    }

    /**
     * 27. 전달받은 스칼라와 벡터의 곱셈이 가능하다. (벡터의 모든 요소에 스칼라를 곱한다.)
     * @param vector 곱할 Vector
     * @param scalar 곱할 Scalar
     * @return 새로 생성된 벡터의 곱셈 결과
     */
    static Vector multiply(Vector vector, Scalar scalar) {
        Vector newVector = vector.clone();

        newVector.multiply(scalar);
        return newVector;
    }
}
