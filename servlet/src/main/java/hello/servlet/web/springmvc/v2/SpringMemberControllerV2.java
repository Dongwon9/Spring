package hello.servlet.web.springmvc.v2;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
//이 requestmapping 옵션은 이 클래스의 내부 requestmapping 경로의 공통 앞부분으로 사용된다.
@RequestMapping("/springmvc/v2/members")
public class SpringMemberControllerV2 {
    private final MemberRepository memberRepository = MemberRepository.getInstance();

    //내부 메소드에서는 공통되지 않는 뒷부분만 작성하면 된다.
    //이거는 @RequsetMapping("/springmvc/v2/members/new-form")과 같다.
    @RequestMapping("/new-form")
    public ModelAndView newForm() {
        return new ModelAndView("new-form");
    }

    //뒷부분을 추가 안할 수도 있다.
    @RequestMapping()
    public ModelAndView members(Map<String, String> paramMap) {
        List<Member> members = memberRepository.findAll();
        ModelAndView mv = new ModelAndView("members");
        mv.addObject("members", members);
        return mv;
    }

    @RequestMapping("/save")
    public ModelAndView save(HttpServletRequest req, HttpServletResponse resp) {
        String username = req.getParameter("username");
        int age = Integer.parseInt(req.getParameter("age"));
        Member member = new Member(username, age);
        memberRepository.save(member);
        ModelAndView mv = new ModelAndView("save-result");
        mv.addObject("member", member);
        return mv;
    }
}
