1. ȸ�������� ������ ������ �� �ִ� 'web_member'���̺��� ����ÿ�.
   �÷��� : m_email / m_pw / m_tel / m_address

   create table WEB_MEMBER(
   	m_email varchar(50),
   	m_pw varchar(50) not null,
   	m_tel varchar(50) not null,
   	m_address varchar(50) not null,
   	constraint web_member_pk primary key(m_email)
   );
   
   create table web_message(
   	m_num number,
   	m_sendName varchar(50) not null,
   	m_receiveEmail varchar (50) not null,
   	m_content varchar(200) not null,
   	m_sendDate date not null,
   	constraint web_message_pk primary key(m_num)
   );
   --������ ����
   create sequence num_seq increment by 1 start with 1;
   
   insert into web_message values
   (num_seq.nextval, 'test','ehddbs0147@naver.com','�׽�Ʈ����',sysdate);
   
   drop table WEB_MEMBER;
   
   
   select * from web_message;
   select * from WEB_MEMBER;









