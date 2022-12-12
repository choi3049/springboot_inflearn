package hello.core.memberReview;

public interface MemberServiceReview {

    void join(MemberReview member);

    MemberReview findMember(Long memberId);
}
