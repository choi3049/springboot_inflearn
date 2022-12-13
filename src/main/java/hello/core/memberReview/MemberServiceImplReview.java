package hello.core.memberReview;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemberServiceImplReview implements MemberServiceReview {

    private final MemberRepositoryReview memberRepositoryReview = new
            MemoryMemberRepositoryReview();

    public void join(MemberReview member) {
        memberRepositoryReview.save(member);
    }

    public MemberReview findMember(Long memberId) {
        return memberRepositoryReview.findById(memberId);
    }

}
