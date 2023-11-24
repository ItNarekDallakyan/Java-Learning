package oop.inheritance.level_2.task2;

public class Worker {
 protected String name;
 protected MyDate date;

 public Worker() {
 }

 public Worker(String name, MyDate date) {
  this.name = name;
  this.date = date;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public MyDate getDate() {
  return date;
 }

 public void setDate(MyDate date) {
  this.date = date;
 }

 @Override
 public String toString() {
  return "Worker{" +
          "name='" + name + '\'' +
          ", date=" + date +
          '}';
 }
}