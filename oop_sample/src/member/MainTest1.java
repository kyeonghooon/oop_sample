package member;

import member.repository.MemberRepository;
import member.repository.MemoryMemberRepositoryImpl;
import member.service.MemberService;
import member.service.MemberServiceImpl;

public class MainTest1 {
   public static void main(String[] args) {

      // MemberRepository memberRepositoryDB = new DBMemberRepositoryImpl();

      MemberRepository memberRepository = MemoryMemberRepositoryImpl.getInstance();

      MemberService memberService = new MemberServiceImpl(memberRepository);

      // 클라이언트
      Member member = new Member(100L, "티모", Grade.VIP);

      // 신규 회원 가입
      memberService.signUp(member);

      // 정상적으로 메모리에 들어갔늕지 확인
      System.out.println(memberService.findByIdMember(100L));
   }
}
