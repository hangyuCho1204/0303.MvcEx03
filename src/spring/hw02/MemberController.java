package spring.hw02;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ex01/*")
public class MemberController {
	@RequestMapping(value="input", method=RequestMethod.GET)
	
	public String createMember(@ModelAttribute("m") Member member){
		
		System.out.println("get!방식");
		System.out.println("m : "+member.getId());
		return "ex01/member";
	}
	@RequestMapping(value="input", method=RequestMethod.POST)
	public String addMember(@ModelAttribute Member member) {
	//@Valid Member에 적용된 Pattern안에 유효성 검사를 적용 시 적용되는 어노테이션
	//BindingResult는 유효성 검사를 하고난 후의 결과 값이 넘어온다.
		System.out.println(member.getId());
		System.out.println(member.getPassword());
		System.out.println(member.getEmail());
		
		//bindingresult에 error가 있으면 member로 가~ 라는 뜻!
		
		return "ex01/result";
	}
}
