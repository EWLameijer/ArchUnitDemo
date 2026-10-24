package org.ericwubbo.archunitdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootTest
class ArchUnitDemoApplicationTests {

    @Test
    void createApplicationModuleModel() {
        ApplicationModules modules = ApplicationModules.of(ArchUnitDemoApplication.class);
        modules.forEach(System.out::println);
    }

    @Test
    void verifiesModularStructure() {
        ApplicationModules modules = ApplicationModules.of(ArchUnitDemoApplication.class);
        modules.verify();
    }
}
