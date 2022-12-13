package hello.core.memberReview;

public interface MemberRepositoryReview {

    void save(MemberReview memberReview);

    MemberReview findById(Long memberId);
}
