package hanlim.hanlimspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HanlimController {

    @GetMapping("hello")
    public String hanlim(Model model){
        model.addAttribute("data", "spring!!");
        return "hello"; // hello.html 파일을 뷰 리졸버(viewResolver)가 찾아서 처리해줌
    }
}
