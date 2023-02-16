# Spock Framework

### Java 테스팅 툴

### Reference
https://spockframework.org/spock/docs/2.3/all_in_one.html

### build.gradle 추가 사항
```
plugins {
    ...
    id 'groovy' //JVM에서 groovy를 돌릴 수 있게 적용
}

```
```
dependencies {
  ...
  testImplementation 'org.codehaus.groovy:groovy-all:2.4.7'
  testImplementation 'org.spockframework:spock-core:1.0-groovy-2.4'
}
```

## Block
- Spock은 테스트 코드를 블록 개념으로 관리한다.
- 블록은 `given`, `when`, `then`, `expect`, `cleanup`, `where` 블록이 존재한다.
- 각각의 페이즈
- `given`
  - `Setup`
  - 테스트를 실행하기 전 설정하는 단계
  - 필수는 아니다.
  - `setup:` 으로도 사용 가능
- `when`
  - `Stimulus`
  - 테스트 하는 코드에 어떤 값을 넣고 어떻게 실행할지 설정하는 단계
  - 해당 블럭을 사용할 경우 `then` 블럭은 필수로 사용해야 한다.
- `then`
  - `Response`
  - `when` 블럭에서 테스트한 결과 값이 예상한 결과값과 맞는지 검증하는 단계
  - `when` 블럭 없이 단독으로 사용할 수 없다.
- `expect`
  - `Stimulus` + `Response`
  - `when` 블럭과 `then` 블럭을 합친 단계
  - `when`과 `then`을 안 쓰고 해당 블럭에서 행위와 검증을 동시에 작성하여도 된다.
- `cleanup`
  - `Cleanup`
  - 테스트가 끝날 시 사용되었던 리소스를 정리하는 단계
  - 기본 값이 변경 된 데이터가 있을 경우 추 후 다른 테스트 혹은 서비스에서 문제가 생길 수 있으므로, 검증이 끝난 데이터는 원래 기본값으로 돌려 놓는다.
  - 필수는 아니다.
- `where`
  - 항상 메서드의 마지막에 작성 가능하며, 데이터를 세팅하는데 사용된다.

### Spock을 이용한 Test 클래스 만들기
- `Junit`과 달리 `src/test/java` 대신 `src/test/groovy` 디렉토리에 테스트 클래스 추가
- 추가 된 클래스에 `Specification` 클래스를 상속 받는다.
- ex)
    ```
    import spock.lang.Specification

    class SampleSpock extends Specification {
    }
    ```
