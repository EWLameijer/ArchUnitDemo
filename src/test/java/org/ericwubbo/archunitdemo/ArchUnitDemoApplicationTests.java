package org.ericwubbo.archunitdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

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

    @Test
    void createModuleDocumentation() {
        ApplicationModules modules = ApplicationModules.of(ArchUnitDemoApplication.class);
        new Documenter(modules)
                .writeDocumentation()
                .writeIndividualModulesAsPlantUml();
    }
}
