-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3308
-- Generation Time: Sep 18, 2019 at 05:00 PM
-- Server version: 5.5.62
-- PHP Version: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jcaoqs`
--
CREATE DATABASE IF NOT EXISTS `jcaoqs` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `jcaoqs`;

-- --------------------------------------------------------

--
-- Table structure for table `adminlogin`
--

DROP TABLE IF EXISTS `adminlogin`;
CREATE TABLE IF NOT EXISTS `adminlogin` (
  `uname` varchar(255) NOT NULL,
  `pname` varchar(255) DEFAULT NULL,
  `aid` int(255) NOT NULL,
  UNIQUE KEY `uname` (`uname`),
  UNIQUE KEY `aid` (`aid`),
  UNIQUE KEY `pname` (`pname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminlogin`
--

INSERT INTO `adminlogin` VALUES('narender', 'admin', 1);

-- --------------------------------------------------------

--
-- Table structure for table `adquestion`
--

DROP TABLE IF EXISTS `adquestion`;
CREATE TABLE IF NOT EXISTS `adquestion` (
  `qid` int(255) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `op1` varchar(255) DEFAULT NULL,
  `op2` varchar(255) DEFAULT NULL,
  `op3` varchar(255) DEFAULT NULL,
  `op4` varchar(255) DEFAULT NULL,
  `c_ans` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adquestion`
--

INSERT INTO `adquestion` VALUES(1, 'which is the capital of your india?', 'mumbai', 'kolkata', 'delhi', 'goa', 'delhi');
INSERT INTO `adquestion` VALUES(2, 'jio founded by?', 'mukesh ambani', 'anil ambani', 'tata', 'birla', 'mukesh ambani');
INSERT INTO `adquestion` VALUES(3, 'current technology of internet?', '1G', '2G', '3G', '4G', '4G');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(1, 'which is the capital of your india?', 'mumbai', 'kolkata', 'delhi', 'goa', 'delhi');
INSERT INTO `adquestion` VALUES(2, 'jio founded by?', 'mukesh ambani', 'anil ambani', 'tata', 'birla', 'mukesh ambani');
INSERT INTO `adquestion` VALUES(3, 'current technology of internet?', '1G', '2G', '3G', '4G', '4G');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(1, 'which is the capital of your india?', 'mumbai', 'kolkata', 'delhi', 'goa', 'delhi');
INSERT INTO `adquestion` VALUES(2, 'jio founded by?', 'mukesh ambani', 'anil ambani', 'tata', 'birla', 'mukesh ambani');
INSERT INTO `adquestion` VALUES(3, 'current technology of internet?', '1G', '2G', '3G', '4G', '4G');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(1, 'which is the capital of your india?', 'mumbai', 'kolkata', 'delhi', 'goa', 'delhi');
INSERT INTO `adquestion` VALUES(2, 'jio founded by?', 'mukesh ambani', 'anil ambani', 'tata', 'birla', 'mukesh ambani');
INSERT INTO `adquestion` VALUES(3, 'current technology of internet?', '1G', '2G', '3G', '4G', '4G');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(1, 'which is the capital of your india?', 'mumbai', 'kolkata', 'delhi', 'goa', 'delhi');
INSERT INTO `adquestion` VALUES(2, 'jio founded by?', 'mukesh ambani', 'anil ambani', 'tata', 'birla', 'mukesh ambani');
INSERT INTO `adquestion` VALUES(3, 'current technology of internet?', '1G', '2G', '3G', '4G', '4G');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, '', '', '', '', '', '');
INSERT INTO `adquestion` VALUES(0, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `adquestion` VALUES(15, NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `c`
--

DROP TABLE IF EXISTS `c`;
CREATE TABLE IF NOT EXISTS `c` (
  `q_id` varchar(255) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `op_1` varchar(255) DEFAULT NULL,
  `op_2` varchar(255) DEFAULT NULL,
  `op_3` varchar(255) DEFAULT NULL,
  `op_4` varchar(255) DEFAULT NULL,
  `c_ans` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `computernetworks`
--

DROP TABLE IF EXISTS `computernetworks`;
CREATE TABLE IF NOT EXISTS `computernetworks` (
  `q_id` varchar(255) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `op_1` varchar(255) DEFAULT NULL,
  `op_2` varchar(255) DEFAULT NULL,
  `op_3` varchar(255) DEFAULT NULL,
  `op_4` varchar(255) DEFAULT NULL,
  `c_ans` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `computernetworks`
--

INSERT INTO `computernetworks` VALUES('1', 'How many layers are there in the OSI Model?', '5', '6', '7', '10', '7');
INSERT INTO `computernetworks` VALUES('2', 'The protocol data unit(PDU) for the application layer in the Internet stack is _____', 'Segment', 'Datagram', 'Message', 'Frame', 'Message');
INSERT INTO `computernetworks` VALUES('3', 'Which transmission media has the highest transmission speed in a network?', 'coaxial cable', 'twisted pair cable', 'optical fiber', 'electrical cable', 'optical fiber');

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
CREATE TABLE IF NOT EXISTS `feedback` (
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `fb` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` VALUES('NARENDER KESWANI', '9320907041', 'narender.rk10@gmail.com', 'I M FEELING GOOD');
INSERT INTO `feedback` VALUES('NARENDER KESWANI', '9320907041', 'narender.rk10@gmail.com', 'SO NICE , I M FEELING LUCKY, MY IQ IS INCREASING');
INSERT INTO `feedback` VALUES('NARENDER KESWANI', '9320907041', 'narender.rk10@gmail.com', 'Nice quiz');

-- --------------------------------------------------------

--
-- Table structure for table `java`
--

DROP TABLE IF EXISTS `java`;
CREATE TABLE IF NOT EXISTS `java` (
  `q_id` int(251) DEFAULT NULL,
  `question` varchar(251) DEFAULT NULL,
  `op_1` varchar(251) DEFAULT NULL,
  `op_2` varchar(251) DEFAULT NULL,
  `op_3` varchar(251) DEFAULT NULL,
  `op_4` varchar(251) DEFAULT NULL,
  `c_ans` varchar(251) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `java`
--

INSERT INTO `java` VALUES(1, 'Who manages the SERVLET LIFE CYCLE in JAVA?', 'SERVLET', 'SERVLET-CONTAINER', 'WEB SERVER', 'WEB BROWSER', 'SERVLET-CONTAINER');
INSERT INTO `java` VALUES(2, 'Which is not method of SERVLET LIFE CYCLE?', 'service()', 'init()', 'getAttribute()', 'destroy()', 'getAttribute()');
INSERT INTO `java` VALUES(3, 'Which of the following code is used to get names of the headers in servlet?', 'response.getHeaderNames()', 'request.getHeaderNames()', 'Header.getHeaderNames()', 'None of the above.', 'request.getHeaderNames()');
INSERT INTO `java` VALUES(4, 'Which of the following code retrieves the MIME type of the body of the request?', 'new MimeType()', 'request.getContentType()', 'response.getContentType()', 'None of the above.', 'request.getContentType()');
INSERT INTO `java` VALUES(5, 'Which of the following code retrieves session ID specified by the client?', 'request.getRequestedSessionId()', 'response.getRequestedSessionId()', 'Header.getRequestedSessionId()', 'None of the above.', 'request.getRequestedSessionId()');
INSERT INTO `java` VALUES(6, 'Which of the following code is used to delete a HTTP Session object in servlets?', 'session.invalidate()', 'request.invalidate()', 'request.deleteSession()', 'None of the above.', 'session.invalidate()');
INSERT INTO `java` VALUES(7, 'Which method take a string not a URL?', 'sendRedirect', 'forward', 'Both A & B', 'None of them', 'sendRedirect');
INSERT INTO `java` VALUES(8, 'Which of the following are interface? 1. ServletContext 2. Servlet 3. GenericServlet 4. HttpServlet ?', '1,2,3,4', '1,2', '1,3,4', '1,4', '1,2');
INSERT INTO `java` VALUES(9, 'Which method shows the client what server is receiving?', 'goGet', 'doOption', 'doTrace', 'doPost', 'goGet');
INSERT INTO `java` VALUES(10, 'Which cookie it is valid for single session only and it is removed each time when the user closes the browser?', 'Persistent cookie', 'Non-persistent cookie', 'All the Above', 'None of above', 'Non-peristent cookie');
INSERT INTO `java` VALUES(11, 'Which of the following can be operands of arithmetic operators?', 'Numeric', 'Boolean', 'Characters', 'Both Numeric & Characters', 'Both Numeric & Characters');
INSERT INTO `java` VALUES(12, 'Decrement operator, â??â??, decreases the value of variable by what number?', '1', '2', '3', '4', '1');
INSERT INTO `java` VALUES(13, 'Which of these keywords is used to make a class?', 'class', 'struct', 'int', 'None of above', 'class');
INSERT INTO `java` VALUES(14, 'Which of the following is a valid declaration of an object of class Box?', 'Box obj = new Box();', 'Box obj = new Box;', 'obj = new Box();', 'new Box obj;', 'Box obj = new Box();');
INSERT INTO `java` VALUES(15, ' Which of these operators is used to allocate memory for an object?', 'malloc', 'alloc', 'new', 'give', 'new');
INSERT INTO `java` VALUES(16, 'Which of the following statements is correct?', 'Public method is accessible to all other classes in the hierarchy', ' Public method is accessible only to subclasses of its parent class', 'Public method can only be called by object of its class', 'Public method can be accessed by calling object of the public class', 'Public method is accessible to all other classes in the hierarchy');
INSERT INTO `java` VALUES(17, ' Which of these class object can be used to form a dynamic array?', 'ArrayList', 'Map', ' Vector', 'ArrayList & Vector', 'ArrayList & Vector');
INSERT INTO `java` VALUES(18, ' Which of these methods is used to add elements in vector at specific location?', 'add()', 'set()', 'AddElement()', 'addElement()', 'addElement()');
INSERT INTO `java` VALUES(19, 'Which of the following contains both date and time?', 'java.io.date', ' java.sql.date', ' java.util.date', 'java.util.dateTime', 'java.util.dateTime');
INSERT INTO `java` VALUES(20, 'Which of the following is advantage of using JDBC connection pool?', 'Slow performance', 'Using more memory', 'Using less memory', 'Better performance', 'Better performance');
INSERT INTO `java` VALUES(21, 'Which of the following is used to limit the number of rows returned?', 'setMaxRows(int i)', 'setMinRows(int i)', 'getMaxrows(int i)', 'getMinRows(int i)', 'setMaxRows(int i)');
INSERT INTO `java` VALUES(22, 'Which of the following is method of JDBC batch process?', 'setBatch()', 'deleteBatch()', 'removeBatch()', 'addBatch()', 'addBatch()');
INSERT INTO `java` VALUES(23, 'Which of the below is not a session tracking method?', 'URL rewriting', 'History', 'Cookies', 'SSL sessions', 'History');
INSERT INTO `java` VALUES(24, 'What is the maximum size of cookie?', '4 KB', '4 MB', '4 bytes', '40 KB', '4 KB');
INSERT INTO `java` VALUES(25, 'Which object is used by spring for authentication?', 'ContextHolder', 'SecurityHolder', 'AnonymousHolder', 'SecurityContextHolder', 'SecurityContextHolder');
INSERT INTO `java` VALUES(26, 'Which one of the following is correct for directive in JSP?', '<%@directive%>', '<%!directive%>', '<%directive%>', '<%=directive%>', '<%@directive%>');
INSERT INTO `java` VALUES(27, 'Which of the following action variable is used to include a file in JSP?', 'jsp:setProperty', 'jsp:getProperty', 'jsp:include', 'jsp:plugin', 'jsp:include');
INSERT INTO `java` VALUES(28, 'Which attribute uniquely identification element?', 'ID', 'Class', ' Name', 'Scope', 'ID');
INSERT INTO `java` VALUES(29, 'â??outâ?? is implicit object of which class?', 'javax.servlet.jsp.PrintWriter', 'javax.servlet.jsp.SessionWriter', ' javax.servlet.jsp.SessionPrinter', 'javax.servlet.jsp.JspWriter', 'javax.servlet.jsp.JspWriter');
INSERT INTO `java` VALUES(30, 'Which object stores references to the request and response objects?', 'sessionContext', ' pageContext', ' HttpSession', ' sessionAttribute', ' pageContext');
INSERT INTO `java` VALUES(31, 'What temporarily redirects response to the browser?', '<jsp:forward>', '<%@directive%>', ' response.sendRedirect(URL)', 'response.setRedirect(URL)', 'response.sendRedirect(URL)');
INSERT INTO `java` VALUES(32, 'Which tag is used to set a value of a JavaBean?', '<c:set>', '<c:param>', '<c:choose>', '<c:forward>', '<c:set>');
INSERT INTO `java` VALUES(33, 'Java code is embedded under which tag in JSP?', 'Declaration', 'Scriptlet', ' Expression', 'Comment', 'Scriptlet');
INSERT INTO `java` VALUES(34, 'Which of the following is not a directive in JSP?', 'page directive', 'include directive', 'taglib directive', 'command directive', 'command directive');
INSERT INTO `java` VALUES(35, 'Which class is used to generate random number?', ' java.lang.Object', 'java.util.randomNumber', ' java.util.Random', ' java.util.Object', ' java.util.Random');
INSERT INTO `java` VALUES(36, 'What is the return type of Math.random() method?', 'Integer', 'Double', 'String', 'Boolean', 'Double');
INSERT INTO `java` VALUES(37, 'How many bits are used for generating random numbers?', '32', '64', '48', '8', '48');
INSERT INTO `java` VALUES(38, 'What is the signature of Math.random() method?', 'public static double random()', 'public void double random()', 'public static int random()', 'public void int random()', 'public static double random()');
INSERT INTO `java` VALUES(39, 'How constructor can be used for a servlet?', 'Initialization', 'Constructor function', 'Initialization and Constructor function', 'Setup() method', 'Initialization and Constructor function');
INSERT INTO `java` VALUES(40, 'Which version of Java introduced annotation?', 'Java 5', 'Java 6', 'Java 7', 'Java 8', 'Java 5');
INSERT INTO `java` VALUES(41, 'Annotation type definition looks similar to which of the following?', ' Method', 'Class', 'Interface', 'Field', 'Interface');
INSERT INTO `java` VALUES(42, 'Which is the Parent class of annotation class?', 'Class', 'Object', 'Main', 'Super', 'Object');
INSERT INTO `java` VALUES(43, 'How does applet and servlet communicate?', 'HTTP', 'HTTPS', 'FTP', 'HTTP Tunneling', 'HTTP Tunneling');
INSERT INTO `java` VALUES(44, 'Which of these classes can schedule task for execution in future?', 'Thread', 'Timer', 'System', 'Observer', 'Timer');
INSERT INTO `java` VALUES(45, 'Which of these interfaces is implemented by TimerTask class?', 'Runnable', 'Thread', 'Observer', 'ThreadCount', 'Runnable');
INSERT INTO `java` VALUES(46, 'Which of the following is not OOPS concept in Java?', ' Inheritance', 'Encapsulation', 'Polymorphism', 'Compilation', 'Compilation');
INSERT INTO `java` VALUES(47, 'When does method overloading is determined?', 'At run time', 'At compile time', 'At coding time', 'At execution time', 'At compile time');
INSERT INTO `java` VALUES(48, 'Which of these interface handle sequences?', 'Set', 'List', 'Comparator', 'Collection', 'List');
INSERT INTO `java` VALUES(49, 'Which of these method is used to reduce the capacity of an ArrayList object?', 'trim()', 'trimSize()', ' trimTosize()', 'trimToSize()', 'trimToSize()');
INSERT INTO `java` VALUES(50, 'Which of these class provides various types of rounding functions?', 'Math', 'Process', 'System', 'Object', 'Math');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `uname` varchar(255) DEFAULT NULL,
  `pname` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phnn` varchar(251) DEFAULT NULL,
  `en` varchar(251) DEFAULT NULL,
  `occ` varchar(251) DEFAULT NULL,
  `uc` varchar(251) DEFAULT NULL,
  UNIQUE KEY `uname` (`uname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` VALUES('narender', 'admin', 'NARENDER KESWANI', '9320907041', 'narender.rk10@gmail.com', 'Student', 'INDIA');
INSERT INTO `login` VALUES('riteshrts', 'ritesh', 'ritesh', '9664083261', 'riteshydav240.ry@gmail.com', 'Student', 'India');
INSERT INTO `login` VALUES('ganesh', '27112006', 'GANESH KESWANI', '9503338045', 'narender.rk10@gmail.com', 'Student', 'India');
INSERT INTO `login` VALUES('ganesh27', '27112006', 'GANESH KESWANI', '9503338045', 'narender.rk10@gmail.com', 'Student', 'India');
INSERT INTO `login` VALUES('rajesh', 'admin', 'RAJESH KESWANI', '9323955500', 'rajesh.b.keswani66@gmail.com', 'Other', 'India');
INSERT INTO `login` VALUES('test1', 'admin', 'TESTER MAN', '9320907041', 'narender.rk10@gmail.com', 'Student', 'India');
INSERT INTO `login` VALUES('test2', 'admin', 'Tester1.1', '9320907041', 'narender.rk10@gmail.com', 'Student', 'India');
INSERT INTO `login` VALUES('test3', 'admin', 'I AM TESTER MAN', '9320907041', 'narender.rk10@gmail.com', 'Student', 'India');
INSERT INTO `login` VALUES('testingjava', 'admin', 'TESTING PROJECT', '9320907041', 'narender.rk10@gmail.com', 'Student', 'India');

-- --------------------------------------------------------

--
-- Table structure for table `mysql`
--

DROP TABLE IF EXISTS `mysql`;
CREATE TABLE IF NOT EXISTS `mysql` (
  `q_id` varchar(255) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `op_1` varchar(255) DEFAULT NULL,
  `op_2` varchar(255) DEFAULT NULL,
  `op_3` varchar(255) DEFAULT NULL,
  `op_4` varchar(255) DEFAULT NULL,
  `c_ans` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mysql`
--

INSERT INTO `mysql` VALUES('1', 'The maximum length of the char columns is', '255 bytes', '25555 bytes', '555 bytes', '1055 bytes', '255 bytes');
INSERT INTO `mysql` VALUES('2', 'Which among the following have the maximum bytes?', 'Varchar', 'Char', 'Text type', 'Both Varchar and Char', 'Text type');
INSERT INTO `mysql` VALUES('3', 'The “father” of MySQL is ______.', 'Michael Widenius', 'Bill Joy', 'Bill Gates', 'Stephanie Wall', 'Michael Widenius');
INSERT INTO `mysql` VALUES('4', 'Which of the following can add a row to a table?', ' Alter', 'Add', ' Insert', 'Create', ' Insert');
INSERT INTO `mysql` VALUES('5', 'Which of these field types would be best to hold a .jpg image?', 'char binary', 'nchar binary', 'text', 'blob', 'blob');
INSERT INTO `mysql` VALUES('1', 'The maximum length of the char columns is', '255 bytes', '25555 bytes', '555 bytes', '1055 bytes', '255 bytes\r');
INSERT INTO `mysql` VALUES('2', 'Which among the following have the maximum bytes?', 'Varchar', 'Char', 'Text type', 'Both Varchar and Char', 'Text type\r');
INSERT INTO `mysql` VALUES('3', 'The “father” of MySQL is ______.', 'Michael Widenius', 'Bill Joy', 'Bill Gates', 'Stephanie Wall', 'Michael Widenius\r');
INSERT INTO `mysql` VALUES('4', 'Which of the following can add a row to a table?', ' Alter', 'Add', ' Insert', 'Create', ' Insert\r');
INSERT INTO `mysql` VALUES('5', 'Which of these field types would be best to hold a .jpg image?', 'char binary', 'nchar binary', 'text', 'blob', 'blob\r');

-- --------------------------------------------------------

--
-- Table structure for table `reports`
--

DROP TABLE IF EXISTS `reports`;
CREATE TABLE IF NOT EXISTS `reports` (
  `uname` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `tdt` varchar(255) DEFAULT NULL,
  `score` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reports`
--

INSERT INTO `reports` VALUES('narender', 'NARENDER KESWANI', 'Mon Sep 16 18:49:56 IST 2019', 4);
INSERT INTO `reports` VALUES('narender', 'NARENDER KESWANI', 'Mon Sep 16 18:49:56 IST 2019', 4);
INSERT INTO `reports` VALUES('narender', 'NARENDER KESWANI', 'Mon Sep 16 19:58:25 IST 2019', 14);

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

DROP TABLE IF EXISTS `result`;
CREATE TABLE IF NOT EXISTS `result` (
  `name` varchar(255) DEFAULT NULL,
  `qid` varchar(255) NOT NULL,
  `corans` varchar(255) DEFAULT NULL,
  `usrans` varchar(255) NOT NULL,
  `sesid` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `result`
--

INSERT INTO `result` VALUES('narender', '45', 'Runnable', 'Runnable', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '45', 'Runnable', 'Runnable', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '5', 'request.getRequestedSessionId()', 'request.getRequestedSessionId()', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '20', 'Better performance', 'Better performance', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '1', 'SERVLET-CONTAINER', 'SERVLET-CONTAINER', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '50', 'Math', 'Math', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '7', 'sendRedirect', 'sendRedirect', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '33', 'Scriptlet', 'Scriptlet', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '4', 'request.getContentType()', 'request.getContentType()', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '29', 'javax.servlet.jsp.JspWriter', 'javax.servlet.jsp.PrintWriter', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '37', '48', '48', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '37', '48', '48', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '42', 'Object', 'Class', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '28', 'ID', 'ID', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '22', 'addBatch()', 'addBatch()', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '38', 'public static double random()', 'public void double random()', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '46', 'Compilation', 'Compilation', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '46', 'Compilation', 'Compilation', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '46', 'Compilation', 'Compilation', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '46', 'Compilation', 'Compilation', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '39', 'Initialization and Constructor function', 'Initialization and Constructor function', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '21', 'setMaxRows(int i)', 'setMaxRows(int i)', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '10', 'Non-peristent cookie', 'Non-persistent cookie', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '10', 'Non-peristent cookie', 'Non-persistent cookie', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '11', 'Both Numeric & Characters', 'Numeric', 'a6fc28f37e45a0a3a5a4eec6d218');
INSERT INTO `result` VALUES('narender', '23', 'History', 'History', 'a6fc28f37e45a0a3a5a4eec6d218');

-- --------------------------------------------------------

--
-- Table structure for table `softwaretesting`
--

DROP TABLE IF EXISTS `softwaretesting`;
CREATE TABLE IF NOT EXISTS `softwaretesting` (
  `q_id` varchar(255) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `op_1` varchar(255) DEFAULT NULL,
  `op_2` varchar(255) DEFAULT NULL,
  `op_3` varchar(255) DEFAULT NULL,
  `op_4` varchar(255) DEFAULT NULL,
  `c_ans` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `webprogramming`
--

DROP TABLE IF EXISTS `webprogramming`;
CREATE TABLE IF NOT EXISTS `webprogramming` (
  `q_id` varchar(255) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `op_1` varchar(255) DEFAULT NULL,
  `op_2` varchar(255) DEFAULT NULL,
  `op_3` varchar(255) DEFAULT NULL,
  `op_4` varchar(255) DEFAULT NULL,
  `c_ans` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
