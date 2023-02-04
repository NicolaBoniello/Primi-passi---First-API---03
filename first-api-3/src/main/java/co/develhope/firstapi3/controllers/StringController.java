package co.develhope.firstapi3.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strings")
public class StringController {

    @GetMapping("/")
    public String concatenation(@RequestParam String StringOne,
                                @RequestParam( required = false) String StringTwo){

        if (StringTwo == null){
        return StringOne;
      } else return "result  of the concatenation string = " + StringOne + " " + StringTwo;

    }
}