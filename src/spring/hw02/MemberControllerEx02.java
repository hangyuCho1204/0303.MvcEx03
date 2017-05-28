package spring.hw02;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ex02/*")
public class MemberControllerEx02 {
	
	@ModelAttribute("memberModel")
	public Member getMember(){
		
		Member member = new Member();
		member.setId("id1231");
		member.setPassword("password");
		member.setEmail("email");
		return member;
	}
	
/*	@RequestMapping(value="result", method=RequestMethod.GET)
	public String result(){
		return "ex02/result";
	}*/
	@RequestMapping(value="result", method=RequestMethod.GET)
	public String result(@ModelAttribute("memberModel") Member member){

		member.setId("id1");
		return "ex02/member";
	}
	//get�ɹ��� �����ϴ� ���(���뿡 ���� ��� �� ����ϸ� ��)
	
}
