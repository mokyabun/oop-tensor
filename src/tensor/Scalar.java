package tensor;

public interface Scalar extends Comparable<Scalar> {
    // 16. 스칼라의 경우 값의 대소 비교를 할 수 있다. -> Comparable<Scalar>

    /**
     * 12. 값을 지정 조회할 수 있다 (String 으로 입출력)
     * @return String으로 변환된 Scalar의 값
     */
    String getValue();

    /**
     * 12. 값을 지정 조회할 수 있다 (String 으로 입출력)
     * @param string String으로 변환된 Scalar의 값
     */
    void setValue(String string);

    /**
     * 14. 객체를 콘솔에 출력할 수 있다. <br>
     * 14s. 스칼라: 값 하나
     * @return String으로 변환된 Scalar의 값
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
    Scalar clone();

    /**
     * 18. 스칼라는 다른 스칼라와 덧셈이 가능하다
     * @param scalar 더할 Scalar
     */
    void add(Scalar scalar);

    /**
     * 19. 스칼라는 다른 스칼라와 곱셈이 가능하다
     * @param scalar 곱할 Scalar
     */
    void multiply(Scalar scalar);

    /**
     * 24. 전달받은 두 스칼라의 덧셈이 가능하다
     * @param scalar1
     * @param scalar2
     * @return 새로 생성된 두 스칼라의 덧셈 결과
     */
    static Scalar add(Scalar scalar1, Scalar scalar2) {
        Scalar newScalar = scalar1.clone();

        newScalar.add(scalar2);
        return newScalar;
    }

    /**
     * 25. 전달받은 두 스칼라의 곱셈이 가능하다
     * @param scalar1
     * @param scalar2
     * @return 새로 생성된 두 스칼라의 곱셈 결과
     */
    static Scalar multiply(Scalar scalar1, Scalar scalar2) {
        Scalar newScalar = scalar1.clone();

        newScalar.multiply(scalar2);
        return newScalar;
    }
}
