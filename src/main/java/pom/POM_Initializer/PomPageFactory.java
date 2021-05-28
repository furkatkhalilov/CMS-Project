package pom.POM_Initializer;

import pom.POM_Classes.LoginPage;

public class PomPageFactory {

    private static ThreadLocal<Pom_AbstractPage> pom_abstract = new ThreadLocal<>();

    public static void setPomPage(String pageName){
        switch (pageName){
            case "Login Page":              pom_abstract.set(new LoginPage());          break;
        }
    }

    public static Pom_AbstractPage getPomPage(){
        return pom_abstract.get();
    }
}
