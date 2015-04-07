package com.oracle.tutorial.jdbc;

public class translation {
	
	/**
	 * http://docs.oracle.com/javase/tutorial/jdbc/index.html
	 */
/*  
JDBC™ API被设计用于让简单的事情更简单。这意味着JDBC让日常的数据库任务简单。这份
教程将会通过简单的使用JDBC执行常用SQL语句、完成其他对于数据库应用很常见的其他目的。
这份教程分为以下课程“
JDBC介绍：列举JDBC特征，描述JDBC架构和预览SQL命令和关系数据苦的概念。
JDBC基础：涉及JDBC API，这些包含在 Java™标准版第六版的发布文件里面。
通过本次课程，你将会知道怎样使用基础的JDBC API来建表，插入数据，查询数据，
从查询的数据集中检索结果和更新数据。在这个过程中，你将会学会怎么样使用简单的
声明和预编译声明，你将会看到一个使用存储过程的例子。你也会学会怎么样执行事务
和捕获异常和警告。
*
*/

	
	/**
	 *http://docs.oracle.com/javase/tutorial/jdbc/overview/index.html
	 * @param args
	 */
/*
教程：JDBC介绍
JDBC API 是一个连接各种表格状数据的JAVA API，特别是那些存储在关系数据库的数据。
JDBC帮助你编写管理以下三个编程活动的JAVA程序。
1、连接一个数据源，例如一个数据库。
2、发送查询或者更新语句至数据库。
3、检索和处理那些数据库为了答复你的请求而发送的数据。
以下简单的代码片段描述了这三步的小例子
public void connectToAndQueryDatabase(String username, String password) {

    Connection con = DriverManager.getConnection(
                         "jdbc:myDriver:myDatabase",
                         username,
                         password);

    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT a, b, c FROM Table1");

    while (rs.next()) {
        int x = rs.getInt("a");
        String s = rs.getString("b");
        float f = rs.getFloat("c");
    }
}
这简短的代码段举例说明一个DriverManager对象来连接数据库驱动和登陆数据库，举例说明一个
Statement对象传递你的SQL查询语句至数据库；举例说明了一个ResultSet对象检索你查询的结果，
然后执行简单的while循环来检索和展示这些结果。这很简单。



 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
