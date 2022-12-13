package hello.core.memberReview;

public interface MemberServiceReview {

    void join(MemberReview memberReview);

    MemberReview findMember(Long memberId);
}
