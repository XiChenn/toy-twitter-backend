# Start MySQL
```bash
$ docker run --name mysql-test -e MYSQL_ROOT_PASSWORD=root -d mysql:latest
```

# Connect to MySQL from command line
### find the IP address
```bash
$ docker inspect mysql-test | grep "IPAddress"
```
### connect using MySQL client
```bash
$ mysql -h <<IP found in previous step>> -u root -p
```

# Create toy_twitter database
```bash
mysql> create database toy_twitter;
```

# Run and Test
Run creatTweet() in TweetControllerTest.java to generate a record. Go to http://127.0.0.1:8090/tweet/user/1 to retrieve the record.

