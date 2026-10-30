package org.example.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class) //testi Cucumber ilə işlədir.    @RunWith → JUnit-də testləri hansı runner-in işlədəcəyini göstərir.
@CucumberOptions(  //→ Cucumber ayarları üçündür (feature yolu, plugin, glue və s.).

        features = {"src/test/resources/Sauce.feature"},  //features → test ssenariləri yazılan .feature faylları haradadır
        glue = {"org.example.Step", "org/example/config"},  //glue → o ssenarilərin Java kodları (step definitions) haradadır
        plugin = {"pretty"},                                           //plugin → test nəticəsi necə görünsün (səliqəli report)
        monochrome = false, //False console-daki output-u daha oxunaqli edir  true → sadə, rəngsiz , false → rəngli, oxunaqlı
        tags = "@SaUcE" //Qeyd olunan tag-lere uygun feature file-lari run olur  tags → yalnız seçilmiş testlər işləsin (məs: @Smoke olanlar)
)

public class StepRunner {

}

