package spring.hw02;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/ex04/*")
@SessionAttributes("member")
public class MemberControllerEx04 {
	
	@RequestMapping(value = "beforeSesstion", method = RequestMethod.GET)
	public String beforeSesstion(){
		
		return "ex04/result";
	}
	
	@RequestMapping(value = "afterSesstion", method = RequestMethod.GET)
	public String afterSesstion( Model model){
		
		Member member = new Member();
		member.setId("18");
		
		
		
		model.addAttribute("member", member);
		return "ex04/result";
	}
	
	@RequestMapping(value = "removeSesstion", method = RequestMethod.GET)
	public String removeSesstion(SessionStatus sessionStatus){
		
		sessionStatus.setComplete();
		
		return "ex04/result";
	}
	
	
}
