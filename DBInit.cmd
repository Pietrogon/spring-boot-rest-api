docker build -t projectdb .

docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=admin -e MYSQL_DATABASE=ProjectDB -e MYSQL_USER=admin -e MYSQL_PASSWORD=admin projectdb