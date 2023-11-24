FROM openjdk
WORKDIR /app
COPY . /app
RUN javac A2Q5.java
CMD ["java","A2Q5"]