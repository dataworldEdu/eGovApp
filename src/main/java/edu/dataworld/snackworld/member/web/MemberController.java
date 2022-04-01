package edu.dataworld.snackworld.member.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

    @RequestMapping(value="/member")
    public String getMember() {
        return "/member/memberList";
    }

    @RequestMapping(value = "/filedownload")
    public String filedownload() {
        return "download";
    }
}
