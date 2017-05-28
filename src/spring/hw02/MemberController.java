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
		
		System.out.println("get!���");
		System.out.println("m : "+member.getId());
		return "ex01/member";
	}
	@RequestMapping(value="input", method=RequestMethod.POST)
	public String addMember(@ModelAttribute Member member) {
	//@Valid Member�� ����� Pattern�ȿ� ��ȿ�� �˻縦 ���� �� ����Ǵ� ������̼�
	//BindingResult�� ��ȿ�� �˻縦 �ϰ� ���� ��� ���� �Ѿ�´�.
		System.out.println(member.getId());
		System.out.println(member.getPassword());
		System.out.println(member.getEmail());
		
		//bindingresult�� error�� ������ member�� ��~ ��� ��!
		
		return "ex01/result";
	}
}
