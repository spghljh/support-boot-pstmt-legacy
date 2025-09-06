# 1. Java 17 슬림 이미지 사용
FROM openjdk:17-jdk-slim

# 2. GitHub Actions에서 전달받을 JAR 파일 경로를 ARG로 선언
ARG JAR_FILE

# 3. 해당 JAR 파일을 이미지 내부로 복사
COPY ${JAR_FILE} /app.jar

# 4. Spring Boot 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "/app.jar"]
