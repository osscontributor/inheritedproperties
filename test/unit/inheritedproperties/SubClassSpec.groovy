package inheritedproperties

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(SubClass)
@Mock(SuperClass)
class SubClassSpec extends Specification {

    void "test binding inherited properties"() {
        when:
        def instance = new SubClass(a: 'A', b: 'B')

        then:
        'A' == instance.a
        'Bs' == instance.b
    }
}
