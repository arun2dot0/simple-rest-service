package controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Person;

@Controller
@RequestMapping
public class PersonController {

	 @GetMapping("/person")
    public  @ResponseBody Person getPerson(@RequestParam(value="firstname", required=false, defaultValue="Jason") String firstName,
    					   @RequestParam(value="lastname", required=false, defaultValue="Bourne") String lastName,
    					   @RequestParam(value="phone", required=false, defaultValue="000-000-000") String phone,
    					   @RequestParam(value="email", required=false, defaultValue="secret@gmail.com") String email ) {
        return new Person(firstName,lastName,phone,email);
    }
	 
	 @PostMapping("/person")
	    public  @ResponseBody Person insertPerson(@RequestBody( required=true) Person person) {
	        return person;
	    }
    
    

}
