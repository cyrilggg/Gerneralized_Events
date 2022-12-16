Drop database if exists Social_Science;
create database Social_Science;
use Social_Science;

DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS event;
DROP TABLE IF EXISTS event_type;
DROP TABLE IF EXISTS generalized_event;

CREATE TABLE event
(
    id       		int(10)      NOT NULL AUTO_INCREMENT,
    Ordered_Pos 	int(10)		 NOT NULL ,
    Chain_Id  		int(10)      NOT NULL ,
    Event_Id        int(10)      NOT NULL UNIQUE,
    Event_Type_Id	int(10)	     NOT NULL ,
    Title     		varchar(50)  NOT NULL,
    Article     	text(5000)   NOT NULL,
    Abstract		text(5000)   NOT NULL,
    Event_Date      varchar(50)  NOT NULL,
    PRIMARY KEY (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8;

CREATE TABLE event_type
(
    id       		int(10)      	NOT NULL AUTO_INCREMENT,
    Event_Type_Id   int(10)      	NOT NULL,
    Title 			varchar(10)		NOT NULL,
    Description		text(500)      	NOT NULL,
    PRIMARY KEY (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8;

CREATE TABLE generalized_event
(
    id       		int(10)      NOT NULL AUTO_INCREMENT,
    Ordered_Pos 	int(10)		 NOT NULL,
    Chain_Id  		int(10)      NOT NULL,
    Event_Id        int(10)      NOT NULL UNIQUE,
    Title     		varchar(50)  NOT NULL,
    PRIMARY KEY (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8;

CREATE TABLE users
(
    id       int(10)      NOT NULL AUTO_INCREMENT,
    name     varchar(50)  NOT NULL,
    password varchar(50)  NOT NULL,
    loginName varchar(50) NOT NULL,
    PRIMARY KEY (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8;

INSERT INTO users(loginName, password, name)
VALUES ('00001', '12323', '小明'),
       ('00002', '11221', '小红'),
       ('00003', '12323', '小王'),
       ('00004', '11221', '小张'),
       ('00005', '12323', '小雯'),
       ('00006', '11221', '小苹'),
       ('00007', '12323', '小宇');

insert into generalized_event(Ordered_Pos, Chain_Id, Event_Id, Title)
values (1,1,1,'我是第一条第一个'),
       (2,1,2,'我是第一条第二个'),
       (1,2,3,'我是第二条第一个'),
       (2,2,4,'我是第二条第二个'),
       (3,2,5,'我是第二条第三个'),
       (4,2,6,'我是第二条第四个');

insert into event_type(Event_Type_Id, Title, Description)
values (1, '我是标题1', '我是描述1'),
       (1, '我是标题2', '我是描述2'),
       (4, '我是标题3', '我是描述3'),
       (3, '我是标题4', '我是描述4'),
       (1, '我是标题5', '我是描述5'),
       (2, '我是标题6', '我是描述6'),
       (2, '我是标题7', '我是描述7');

insert into event(Ordered_Pos, Chain_Id, Event_Id, Event_Type_Id, Title, Article, Abstract, Event_Date)
values (1, 1, 1, 1, '我是标题1', '我是文章1', '我是摘要1', '2020/5/14'),
       (2, 1, 2, 2, '我是标题1', '我是文章1', '我是摘要1', '2021/5/15'),
       (3, 1, 3, 3, '我是标题1', '我是文章1', '我是摘要1', '2022/5/28'),
       (1, 2, 4, 4, '我是标题1', '我是文章1', '我是摘要1', '2020/1/1');