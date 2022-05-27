import org.cecil.springshellpoc.SpringShellPocApplication
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(classes = SpringShellPocApplication)
class BaseSpec extends Specification {
    def "should load context"() {
        expect: true
    }
}
