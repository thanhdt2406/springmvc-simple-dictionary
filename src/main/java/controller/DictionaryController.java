package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.IDictionaryService;

@Controller
@RequestMapping("/dictionary")
public class DictionaryController {
    @Autowired
    IDictionaryService dictionaryService;

    @GetMapping
    public ModelAndView translate(){
        return new ModelAndView("dictionary");
    }

    @PostMapping
    public ModelAndView translate(@RequestParam String eng,Model model){
        model.addAttribute("eng",eng);
        model.addAttribute("vie",dictionaryService.translate(eng.toLowerCase()));
        return new ModelAndView("dictionary");
    }
}
