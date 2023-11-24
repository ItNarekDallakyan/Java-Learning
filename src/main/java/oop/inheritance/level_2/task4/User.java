package oop.inheritance.level_2.task4;

public class User {
 protected String name;
 protected Time time;
 protected String operator;

 public User() {
 }

 public User(String name, Time time, String operator) {
  this.name = name;
  this.time = time;
  this.operator = operator;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public Time getTime() {
  return time;
 }

 public void setTime(Time time) {
  this.time = time;
 }

 public String getOperator() {
  return operator;
 }

 public void setOperator(String operator) {
  this.operator = operator;
 }

 @Override
 public String toString() {
  return "User{" +
          "name='" + name + '\'' +
          ", time=" + time +
          ", operator='" + operator + '\'' +
          '}';
 }
}