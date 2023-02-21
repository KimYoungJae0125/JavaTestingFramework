package sample

import com.testframework.spock.domain.controller.TestingController
import config.MockMvcConfig

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

class ControllerTesting extends MockMvcConfig {

    def endPoint = '/test-method'

    def setup() {
        setMockMvc(new TestingController())
    }

    def "Get Method 테스트"() {
        expect:
            mockMvc.perform(get(endPoint))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello"))
    }
    def "Post Method 테스트"() {
        expect:
            mockMvc.perform(post(endPoint))
                .andExpect(status().isOk())
                .andExpect(jsonPath('$.post').value("1"))
                .andExpect(jsonPath('$.get').value("1"))
    }

}
