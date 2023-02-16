package sample

import spock.lang.Specification

class BasicTesting extends Specification{

    def "기본 : given / when / then 블록"() {
        given: "조건"
        def string = "hi"

        when: "행위"
        string += " hello"

        then: "검증"
        string == "hi hello"
    }
}
