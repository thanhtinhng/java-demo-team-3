package org.example.java_core.oop.final_keyword;

public class AppConfig_DemoFinalVar {

    private static final String APP_NAME = "FinalDemoApp";

    // Final instance variable – phải gán trong constructor
    private final String author;

    public AppConfig_DemoFinalVar(String author) {
        this.author = author;
    }

    public void printConfig() {
        System.out.println("App: " + APP_NAME);
        System.out.println("Author: " + author);
    }

    // Vì author là final nên không thể chỉnh sửa (sẽ báo lỗi)
//    public void setAuthor(String author) {
//        this.author = author;
//    }
}
