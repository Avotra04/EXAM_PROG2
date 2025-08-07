package org.examProg2;

public class Function extends SocialMedia {
    String comment;
    String post;
    String delete;
    String create;

    public Function(String comment, String post, String delete) {
    this.comment = comment;
    this.post = post;
    this.delete = delete;
    }

    @Override
    public void Users(String userStandar, String moderator, String admin) {
        super.Users(userStandar, moderator, admin);
    }

    @Override
    public String getUserStandar() {
        return super.getUserStandar();
    }

    @Override
    public void setUserStandar(String userStandar) {
        super.setUserStandar(userStandar);
    }

    @Override
    public String getAdmin() {
        return super.getAdmin();
    }

}



