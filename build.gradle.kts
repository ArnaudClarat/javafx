plugins {
    java
    application //nécessaire pour lancer l’application et la tester via la tâche "run"
    id("org.openjfx.javafxplugin") version "0.0.8" //Utilisation d’un plugin qui va installer javaFX automatiquement
}

group = "com.ifosupwavre.info"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    //testCompile("junit", "junit", "4.12")
    implementation("com.h2database:h2:1.4.196") //utilisation de la db
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_12 //version de Java
}

javafx {
    //Configuration de JavaFX
    version = "13" //Version de javafx
    modules = listOf("javafx.controls", "javafx.fxml") //modules utilisés. Controls est obligatoire, FXML pour le support des fichiers FXML.
}

application {
    //Configuration de l’application. Utile pour la tâche "run"
    mainClassName = "$moduleName/com.ifosupwavre.info.javafx.MainApp" //à remplacer!

    //Créer un fichier "modules-info.java dans src/main/java pour activer la variable moduleName
}