package oop.inheritance.level_2.task1;

public class Friend {
 protected String name;
 protected String phone;
 protected Date date;

 public Friend() {
 }

 public Friend(String name, String phone, Date date) {
  this.name = name;
  this.phone = phone;
  this.date = date;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getPhone() {
  return phone;
 }

 public void setPhone(String phone) {
  this.phone = phone;
 }

 public Date getDate() {
  return date;
 }

 public void setDate(Date date) {
  this.date = date;
 }

 @Override
 public String toString() {
  return "Friend{" +
          "name='" + name + '\'' +
          ", phone='" + phone + '\'' +
          ", date=" + date +
          '}';
 }
}