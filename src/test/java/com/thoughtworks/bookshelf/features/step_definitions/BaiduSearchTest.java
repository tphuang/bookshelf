package com.thoughtworks.bookshelf.features.step_definitions;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(features="classpath:features/baidu_search.feature", monochrome = true, format = {"pretty", "html:target/features", "rerun:target/rerun.txt"})
public class BaiduSearchTest {
}
