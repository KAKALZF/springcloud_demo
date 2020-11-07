FROM java:8
VOLUME /tmp
RUN mkdir /app
ADD order-service-1.0.0-SNAPSHOT.jar /app/app.jar
ADD runboot.sh /app/
RUN bash -c 'touch /app/app.jar'
WORKDIR /app
RUN chmod a+x runboot.sh
EXPOSE 9702
CMD /app/runboot.sh

