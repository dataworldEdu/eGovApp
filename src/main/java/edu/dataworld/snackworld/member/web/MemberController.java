package edu.dataworld.snackworld.member.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/member")
public class MemberController {

    @RequestMapping(value="/memberList.do")
    public String getMember() {
        return "/member/memberList";
    }

    @RequestMapping(value = "/filedownload.do")
    public String filedownload() {
        return "download";
    }
}
