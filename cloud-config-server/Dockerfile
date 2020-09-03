FROM openjdk:11-slim as builder
WORKDIR application
ARG JAR_FILE
ADD target/${JAR_FILE} app.jar
# In order to build a proper layered docker file, we need to take our application (which must have been created with
# layered mode enabled) and pull all of the layers out.  These will be copied to our image.
RUN java -Djarmode=layertools -jar app.jar extract

FROM openjdk:11-slim
WORKDIR application
# Here, we copy over all of the layers.  They must be copied in the proper order, which can be revealed with:
#       java -Djarmode=layertools -jar app.jar list
COPY --from=builder application/dependencies/ ./
COPY --from=builder application/spring-boot-loader/ ./
COPY --from=builder application/snapshot-dependencies/ ./
COPY --from=builder application/application/ ./

EXPOSE 8888

ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]