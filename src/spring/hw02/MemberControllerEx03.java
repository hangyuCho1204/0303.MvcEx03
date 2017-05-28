package spring.hw02;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberControllerEx03 {
	
	@RequestMapping(value = "/ex03/input", method = RequestMethod.GET)
	public void inputMember(@ModelAttribute Member member){
		
	}
	
	@RequestMapping(value = "/ex03/input", method = RequestMethod.POST)
	public String addMember(@RequestParam String id, @RequestParam("password") String pw, @RequestParam String email, Model model){
		System.out.println(id);
		System.out.println(pw);
		System.out.println(email);
		
		Member member = new Member();
		
		member.setId(id);
		member.setPassword(pw);
		member.setEmail(email);
		
		model.addAttribute("member", member);
		model.addAttribute("msg", "잘되었나요?");
		
		return "ex03/result";
	}
}