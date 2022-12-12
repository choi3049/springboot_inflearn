package hello.core.memberReview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImplReview implements MemberServiceReview {

    private final MemberRepositoryReview memberRepository;

    @Autowired //ac.getBean(MemberRepository.class)
    public MemberServiceImplReview(MemberRepositoryReview memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(MemberReview member) {
        memberRepository.save(member);
    }

    @Override
    public MemberReview findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    //test
    public MemberRepositoryReview getMemberRepository() {
        return memberRepository;
    }

}
