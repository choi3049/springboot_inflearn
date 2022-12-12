package hello.core.memberReview;

public class MemberReview {
    private Long id;
    private String name;
    private GradeReview grade;  // Gradeタイプというのは列挙型でGradeファイルで列挙した変数を選べる

    public MemberReview(Long id, String name, GradeReview grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GradeReview getGrade() {
        return grade;
    }

    public void setGrade(GradeReview grade) {
        this.grade = grade;
    }
}
