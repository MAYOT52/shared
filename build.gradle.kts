plugins {
    id("java-library")
}

group = "com.s21"
version = "1.0.0"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // Lombok
    compileOnly("org.projectlombok:lombok:1.18.38")
    annotationProcessor("org.projectlombok:lombok:1.18.38")
    // Lombok + MapStruct
    annotationProcessor("org.projectlombok:lombok-mapstruct-binding:0.2.0")
}

tasks.test {
    useJUnitPlatform()
}