FROM mysql:latest

ENV MYSQL_ROOT_PASSWORD=98164123
ENV MYSQL_DATABASE=gocar
ENV MYSQL_USER=admin
ENV MYSQL_PASSWORD=98164123

VOLUME [ "/var/lib/mysql" ]

COPY ./database/ /docker-entrypoint-initdb.d/