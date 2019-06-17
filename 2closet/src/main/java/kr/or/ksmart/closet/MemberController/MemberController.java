package kr.or.ksmart.closet.MemberController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.or.ksmart.closet.vo.Test;

@Controller
public class MemberController {
	
	@GetMapping("/memberList")
	public String getMemberList(Model model) {
		Test test = new Test();
		test.setTest("test");
		model.addAttribute("test", test);
		
		return "/memberList";
	}

}
