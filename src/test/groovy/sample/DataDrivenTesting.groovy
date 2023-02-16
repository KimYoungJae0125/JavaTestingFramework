package sample

import spock.lang.Specification
import spock.lang.Unroll

/*
 * @Unroll : 해당 어노테이션은 where 블록에서 넣은 데이터들로 테스트 한 결과를 각각 독립적으로 표시하게 해준다.
 * ex)
 * @Unroll
 * def "Test"() {
 *  expect:
 *      a + b == c
 *
 *  where:
 *      a | b || c
 *      1 | 3 || 4
 *      7 | 4 || 11
 * }
 *  결과 출력 :  Test[0]
 *             Test[1]
 *
 * 만약 @Unroll이 붙어있지 않을 경우
 * 결과는 Test 하나로만 출력된다.
 *
 */
class DataDrivenTesting extends Specification {


    @Unroll
    def "where 블록 Data Table 방식"() {
        expect: "when + then"
        a + b == c

        where:  "Data Table 방식"
        a | b || c
        1 | 3 || 4
        7 | 4 || 11
        0 | 0 || 0
    }

    @Unroll
    def "where 블록 Data Pipes 방식"() {
        expect: "when + then"
        a + b == c

        where:  "Data Pipes 방식"
        a << [1, 7, 0]
        b << [3, 4, 0]
        c << [4, 11, 0]
    }

}
