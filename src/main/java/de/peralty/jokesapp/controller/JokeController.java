package de.peralty.jokesapp.controller;

import de.peralty.jokesapp.service.JokeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping({"/",""})
public class JokeController {

    private final JokeService jokeService;

    @GetMapping
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }

}
