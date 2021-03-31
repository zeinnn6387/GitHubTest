package tests;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import javax.swing.text.html.Option;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GithubTests {

    @BeforeAll
    static  void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void testGithub() {

        open("https://github.com/selenide/selenide");
        $("h1").shouldHave(Condition.text("selenide / selenide"));
        $("[data-tab-item='i4wiki-tab']").click();
        $("[href='/selenide/selenide/wiki/SoftAssertions']").shouldHave(text("Soft assertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));


    }


}
