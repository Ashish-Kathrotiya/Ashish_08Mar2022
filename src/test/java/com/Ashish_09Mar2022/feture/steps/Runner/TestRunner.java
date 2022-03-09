package com.Ashish_09Mar2022.feture.steps.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = "src/test/resources/features/validateAddToCart.feature", glue = {
		"com.Ashish_09Mar2022.feture.steps"})

public class TestRunner {
}