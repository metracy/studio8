package org.launchcode.skilltracker.controllers;

import org.springframework.stereotype.Controller ;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SkillsController {
    @GetMapping()
    @ResponseBody
    public String Skills() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Programming Languages to Learn</h2>" +
                    "<ol>" +
                        "<li>Python</li>" +
                        "<li>JavaScript</li>" +
                        "<li>Java</li>" +
                        "<li>Rust</li>" +
                    "</ol>" +
                "</body>" +
                "</html>";
    }
    @GetMapping("/form")
    @ResponseBody
    public String form() {
        return "<html>" +
                "<body>" +
                "<form method='post' action='/form'>" +
                "<label for='name'>Name:</label>" +
                "<input type='text' id='name' name='name' />" +
                "<br />" +

                "<label for='first'>1st Favorite Language:</label>" +
                "<select id='first' name='first'>" +
                    "<option value='Python'>Python</option>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Rust'>Rust</option>" +
                "</select>" +
                "<br />" +

                "<label for='second'>2nc Favorite Language:</label>" +
                "<select id='second' name='second'>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='Python'>Python</option>" +
                    "<option value='Rust'>Rust</option>" +
                "</select>" +
                "<br />" +

                "<label for='third'>3rd Favorite Language:</label>" +
                "<select id='third' name='third'>" +

                    "<option value='Rust'>Rust</option>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +

                "</select>" +
                "<br />" +
                "<label for='fourth'>4th Favorite Language:</label>" +
                "<select id='fourth' name='fourth'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                    "<option value='Rust'>Rust</option>" +
                "</select>" +
                "<br />" +

                "<input type='submit' value='Submit' />" +


                "</form>" +
                "</body>" +
                "</html>";
    }
    @PostMapping("/form")
    @ResponseBody
    public String formpost(@RequestParam String name,
                           @RequestParam String first,
                           @RequestParam String second,
                           @RequestParam String third,
                           @RequestParam String fourth) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "'s Favorite Programming Languages</h1>" +
                "<ol>" +
                    "<li>" + first + "</li>" +
                    "<li>" + second + "</li>" +
                    "<li>" + third + "</li>" +
                    "<li>" + fourth + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
