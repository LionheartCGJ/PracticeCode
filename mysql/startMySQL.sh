#/bin/bash

bin/mysqld --defaults-file=/home/wayss/developmentEnv/mysql-5.7.19-linux-glibc2.12-x86_64/my.cnf &

#��ʼ�����ݿ�
bin/mysqld --defaults-file=/home/wayss/developmentEnv/mysql-5.7.19-linux-glibc2.12-x86_64/my.cnf --initialize-insecure

#��������
bin/mysqladmin -uroot password '123456' --socket=./mysql.sock

#����Զ�̵�¼
bin/mysql -uroot -p123456 -e "grant all on *.*  to root@'%' identified by '123456';" --socket=./mysql.sock