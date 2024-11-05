package br.com.fiap.projdiamantegym.split;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SplitController {

    private final SplitService splitService;

    public SplitController(SplitService splitService) {
        this.splitService = splitService;
    }

    @GetMapping
    public String index(Model model) {
        var split = splitService.findAll();
        model.addAttribute("split", split);
        return "index";
    }

}
