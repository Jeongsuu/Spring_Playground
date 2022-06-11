package com.spring.core;

import com.spring.core.member.*;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();

        Member member = new Member(1L, "member1", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new Member = " + findMember.getName());
        System.out.println("find Member = " + member.getName());
    }
}