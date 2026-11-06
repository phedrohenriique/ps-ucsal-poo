package app;

// $ choco install maven ( for windows users )
// go to scrapper/app-java
// run script with
// $ mvn compile
// $ java -cp target/classes App

// to run directly
// mvn clean compile exec:java
// mvn dependency:tree - check for maven dependencies
// mvn -f scripts/script-pom.xml clean compile exec:java

public class Programa {

    public static void main(String[] args) throws Exception {

        System.out.println("STARTING APP");

        try {

        } catch (Exception exception) {

            System.err.println("ERROR : " + exception.getMessage());

        }

    }

}
