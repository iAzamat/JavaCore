FROM openjdk:8-jdk-alpine
COPY ../../.. /usr/src/mygame
WORKDIR /usr/src/mygame
RUN javac -sourcepath ./src -d out src/Homeworks/HW1/sample/Main.java
CMD java -classpath ./out Homeworks.HW1.sample.Main