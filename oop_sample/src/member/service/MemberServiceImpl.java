package member.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import member.Member;
import member.repository.MemberRepository;

@Data
@AllArgsConstructor
public class MemberServiceImpl implements MemberService {

   private MemberRepository memberRepository;

   @Override
   public void signUp(Member member) {
      memberRepository.save(member);
   }

   @Override
   public Member findByIdMember(Long memberId) {
      return memberRepository.findById(memberId);
   }

}
