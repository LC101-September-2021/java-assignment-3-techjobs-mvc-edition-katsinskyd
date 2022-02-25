package org.launchcode.techjobs.mvc.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

public class TechJobsController {
    static HashMap<String, String> actionChoices = new HashMap<>();

    @ModelAttribute("actions")
    static HashMap getActionChoices() {
        return actionChoices;
    }
}
