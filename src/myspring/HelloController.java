/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myspring;



import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author Vivek
 */
@Controller
public class HelloController {
	/*private static final String[] countries = { "Turkey",
			"United States", "Germany" };
	public enum Gender {
		MALE,
		FEMALE;
		}*/

	
//	@RequestMapping("/")
//	public ModelAndView HelloWorld(){
//		
//		ModelAndView mv=new ModelAndView("welcome");
//		mv.addObject("mymsg","This is my first spring controller/page");
//		
//		
//		return mv;
//	}
//	
	
	
	
			@RequestMapping(value = "/")
			public ModelAndView students() {
				
		 
			//ModelAndView modelAndView =new ModelAndView("regForm","student1", new Student());
			ModelAndView modelAndView =new ModelAndView("regForm");
			return modelAndView;
			}
			
			@RequestMapping(value = "/result",method=RequestMethod.POST)
			public ModelAndView processStudnet(@Valid @ModelAttribute("s") Student student,BindingResult result) {
			ModelAndView modelAndView = new ModelAndView();
		//	modelAndView.addObject("s", stu);
			if (result.hasErrors()) {
				modelAndView.setViewName("regForm");
				}
				else {
				modelAndView.setViewName("userResult");
				}
				return modelAndView;
			}

   
    
  
}
