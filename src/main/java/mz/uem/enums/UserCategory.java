package mz.uem.enums;

public enum UserCategory {

    ADMIN("Administrador"),
    CLIENT("Cliente"),
    TECHNIC("Técnico");

    private String userCategory;

    private UserCategory(String userCategory){
        this.userCategory=userCategory;
    }
    public void setUserCategory(String userCategory) {
        this.userCategory = userCategory;
    }
    public String getUserCategory() {
        return userCategory;
    }

}
